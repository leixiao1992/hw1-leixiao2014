

/* First created by JCasGen Wed Sep 24 02:35:07 EDT 2014 */
package cmu.edu.leixiao;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 24 02:35:07 EDT 2014
 * XML source: /Users/leixiao/git/hw1-leixiao2014/hw1-leixiao-ziy-proto/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class gene extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(gene.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected gene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public gene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public gene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public gene(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: GeneID

  /** getter for GeneID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeneID() {
    if (gene_Type.featOkTst && ((gene_Type)jcasType).casFeat_GeneID == null)
      jcasType.jcas.throwFeatMissing("GeneID", "cmu.edu.leixiao.gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((gene_Type)jcasType).casFeatCode_GeneID);}
    
  /** setter for GeneID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneID(String v) {
    if (gene_Type.featOkTst && ((gene_Type)jcasType).casFeat_GeneID == null)
      jcasType.jcas.throwFeatMissing("GeneID", "cmu.edu.leixiao.gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((gene_Type)jcasType).casFeatCode_GeneID, v);}    
   
    
  //*--------------*
  //* Feature: GeneTag

  /** getter for GeneTag - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeneTag() {
    if (gene_Type.featOkTst && ((gene_Type)jcasType).casFeat_GeneTag == null)
      jcasType.jcas.throwFeatMissing("GeneTag", "cmu.edu.leixiao.gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((gene_Type)jcasType).casFeatCode_GeneTag);}
    
  /** setter for GeneTag - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneTag(String v) {
    if (gene_Type.featOkTst && ((gene_Type)jcasType).casFeat_GeneTag == null)
      jcasType.jcas.throwFeatMissing("GeneTag", "cmu.edu.leixiao.gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((gene_Type)jcasType).casFeatCode_GeneTag, v);}    
   
    
  //*--------------*
  //* Feature: head

  /** getter for head - gets 
   * @generated
   * @return value of the feature 
   */
  public int getHead() {
    if (gene_Type.featOkTst && ((gene_Type)jcasType).casFeat_head == null)
      jcasType.jcas.throwFeatMissing("head", "cmu.edu.leixiao.gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((gene_Type)jcasType).casFeatCode_head);}
    
  /** setter for head - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHead(int v) {
    if (gene_Type.featOkTst && ((gene_Type)jcasType).casFeat_head == null)
      jcasType.jcas.throwFeatMissing("head", "cmu.edu.leixiao.gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((gene_Type)jcasType).casFeatCode_head, v);}    
   
    
  //*--------------*
  //* Feature: tail

  /** getter for tail - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTail() {
    if (gene_Type.featOkTst && ((gene_Type)jcasType).casFeat_tail == null)
      jcasType.jcas.throwFeatMissing("tail", "cmu.edu.leixiao.gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((gene_Type)jcasType).casFeatCode_tail);}
    
  /** setter for tail - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTail(int v) {
    if (gene_Type.featOkTst && ((gene_Type)jcasType).casFeat_tail == null)
      jcasType.jcas.throwFeatMissing("tail", "cmu.edu.leixiao.gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((gene_Type)jcasType).casFeatCode_tail, v);}    
  }

    