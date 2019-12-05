package org.jsoup.nodes;

public class MakeElement extends MakeFactory{
    public Node createnode(parameter para){
        Node node = null;
        if (para.type.equals("PseudoTextElement")) {

        }
        else if (para.type.equals("Document")){

        }
        else if (para.type.equals("FormElement")) {

        }
        return node;
    }
}
