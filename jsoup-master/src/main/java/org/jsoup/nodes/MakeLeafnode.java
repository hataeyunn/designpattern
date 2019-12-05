package org.jsoup.nodes;

public class MakeLeafnode extends MakeFactory {
    Node node = null;
    public LeafNodeBuilder LeafBuilder;

    public Node createnode(parameter para) {

        if (para.type.equals("DataNode")) {

        }
        else if (para.type.equals("DocumentType")) {

        }
        else if (para.type.equals("XmlDeclaration")) {

        }
        else if (para.type.equals("CDataNode")) {

        }
        else if (para.type.equals("Comment")) {

        }
        else if (para.type.equals("TextNode")) {

        }
        return node;
    }
    private void setLeafNodeBuilder (LeafNodeBuilder leafnode){
        LeafBuilder = leafnode;
    }
    public parameter getelement(){
        return LeafBuilder.getParameter();
    }
    public void constructparameter() {
        LeafBuilder.createNewParameter();
        LeafBuilder.buildbasUri();
        LeafBuilder.buildData();
        LeafBuilder.buildIsProcessingInstruction();
        LeafBuilder.buildName();
        LeafBuilder.buildPublicld();
        LeafBuilder.buildPubsyskey();
        LeafBuilder.buildSystemId();
        LeafBuilder.buildText();
    }
}