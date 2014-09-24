import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.examples.SourceDocumentInformation;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.DocumentAnnotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;

import cmu.edu.leixiao.Sentence;

//This is a collectionreader of the system.
//this process is to deal with the document 
//First reading the document
//And then store the sentence of the document into the cas, with form of Sentence
//In addition, we should separate the sentence into id and text.
//The method of separation is to identify the location of the space.
//From beginning to space is id.
//From space to end is text.

public class GeneCollectionReader extends CollectionReader_ImplBase {
	
	int flag;
	
	//get the value of the parameter, which is the location of the input file
	public static final String PARAM_INPUTDIR = "InputDocument";
	public void initialize() throws ResourceInitializationException {
		
		//To identify if the document has been read.
		//Since it has only one document to read, we need to close the system when completing one document
		flag=1;

	}
	
	@Override
	public void getNext(CAS aCAS) throws IOException, CollectionException {
		// TODO Auto-generated method stub
		
		JCas jcas;
	    try {
	      jcas = aCAS.getJCas();
	    } catch (CASException e) {
	      throw new CollectionException(e);
	    }
	    
	    //open the document  
	    FileReader reader = new FileReader((String)getConfigParameterValue(PARAM_INPUTDIR));
	    //System.out.println(getConfigParameterValue(PARAM_INPUTDIR));
	    
	    //read the document
		BufferedReader br = new BufferedReader(reader);
		String s1 = null;
		while((s1 = br.readLine()) != null) {
			  
			  Sentence a=new Sentence(jcas);
			  
			  int i=s1.indexOf(" ");
			  
			  //partition the sentence we read from the document			  
			  String id=s1.substring(0,i);
			  String text=s1.substring(i+1,s1.length()-1);	
			  
			  //put the document into cas
			  //in form of the Sentence
			  a.setSentenceID(id);
			  a.setSentenceText(text);
			  a.addToIndexes();

			  
		  }
		
		//when finish reading the whole document, close the file
		 br.close();
		 reader.close();
		 flag=0;
	    

		

	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Progress[] getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasNext() throws IOException, CollectionException {
		// TODO Auto-generated method stub
		
		//to identify if the document has been read or not
		//if already been read, end the system
		if(flag==1) return true;
		else return false;
	}

}
