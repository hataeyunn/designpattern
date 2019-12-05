package org.jsoup.nodes;

public class MakeElement extends MakeFactory<element_parameter>{
    PseudoTextElement a = null;
    Document b = null;
    FormElement c = null;

    public Node createnode(element_parameter para){
        // Node node = null;
        if (para.type.equals("PseudoTextElement")) {
            a = new PseudoTextElement(para.getTag(),para.getBaseUri(),para.getAttributes());
            return a;
        }
        else if (para.type.equals("Document")){
            b = new Document(para.getBaseUri());
            return b;
        }
        else if (para.type.equals("FormElement")) {
            c = new FormElement(para.getTag(),para.getBaseUri(),para.getAttributes());
            return c;
        }
        else {
            return null;
        }
    }


}
