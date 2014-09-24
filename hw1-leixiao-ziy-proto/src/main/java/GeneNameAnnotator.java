import java.util.Map;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import cmu.edu.leixiao.Sentence;
import cmu.edu.leixiao.gene;

//This is a casAnnotator of the system.
//The main idea of this part is to deal with the SentenceText and recognize the location of the gene tag.
//Put the SentenceText into this method, it will automatically return a Hashmap. 
//Through traversing the hash map, we could get the begin and end of each gene tag of the sentence .


public class GeneNameAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		
		//define an iterator to traverse the content of the cas
		//in form of the Sentence Type
		
		 FSIterator iter = aJCas.getAnnotationIndex().iterator();

	    // iterate
	    while (iter.isValid()) {
	    	
	    	//get the sentence type
	    	Sentence a = (Sentence)iter.get();
	    	
	    	String docText = a.getSentenceText();
	    	
	    	//use the function of the PosTagNamedEntityRecognizer.java
	    	PosTagNamedEntityRecognizer recognizer = null;
			try {
				recognizer = new PosTagNamedEntityRecognizer();
			} catch (ResourceInitializationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	    	
	    	String id=a.getSentenceID();
			
	    	//return the result of the map
	    	//the key of map is the beginning of the genetag
	    	//the value of map is the end of the genetag
	    	
		    Map<Integer, Integer> mymap = recognizer.getGeneSpans(docText); 
		    int begin=0;
		    int end=0;	
		    
		    //traverse the whole map to get each genetag
			 for (Map.Entry<Integer, Integer> entry : mymap.entrySet()) {
				 
				 gene name=new gene(aJCas);

				 begin=entry.getKey();
				 end=entry.getValue();
				 
				 //store the tag into the geneTYPE cas
				 String text=docText.substring(begin,end);		
			     name.setGeneID(id);
				 name.setGeneTag(text);
				 name.setHead(begin);
				 name.setTail(end);				 
				 name.addToIndexes();				
			 }			
			iter.moveToNext();
	    }
	}
}
