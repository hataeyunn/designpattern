package org.jsoup.nodes;

public class MakeElement extends MakeFactory<element_parameter>{
    Node node = null;

    public Node createnode(element_parameter para){
        // Node node = null;
        if (para.type.equals("PseudoTextElement")) {
            node = new PseudoTextElement(para.getTag(),para.getBaseUri(),para.getAttributes());
        }
        else if (para.type.equals("Document")){
            node = new Document(para.getBaseUri());
        }
        else if (para.type.equals("FormElement")) {
            node = new FormElement(para.getTag(),para.getBaseUri(),para.getAttributes());
        }
        return node;
    }


}
