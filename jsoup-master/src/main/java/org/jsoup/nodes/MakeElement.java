package org.jsoup.nodes;

public class MakeElement extends MakeFactory<element_parameter>{
    Node node = null;
    public ElementBuilder ElemBuilder;

    public Node createnode(element_parameter para){
        // Node node = null;
        if (para.type.equals("PseudoTextElement")) {
            node = new PseudoTextElement(para.getTag(),para.getBaseUri(),para.getAttributes();
        }
        else if (para.type.equals("Document")){
            node = new Document(para.getBaseUri());
        }
        else if (para.type.equals("FormElement")) {
            node = new FormElement(para.getTag(),para.getBaseUri(),para.getAttributes());
        }
        return node;
    }

    private void setElementBuilder(ElementBuilder element){
        ElemBuilder = element;
    }
    public parameter getelement(){
        return ElemBuilder.getParameter();
    }
    public void constructparameter(){
        ElemBuilder.createNewParameter();
        ElemBuilder.buildTag();
        ElemBuilder.buildbasUrI();
        ElemBuilder.buildAttributes();
    }
}
