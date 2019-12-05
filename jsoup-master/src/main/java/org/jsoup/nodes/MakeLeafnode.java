package org.jsoup.nodes;

public class MakeLeafnode extends MakeFactory<LeafNode_parameter> {
    Node node = null;

    @Deprecated
    public Node createnode(LeafNode_parameter para) {
        if (para.type.equals("DataNode")) {
            if(para.getBaseUrl()==null){
                node = new DataNode(para.getData());
            }
            else {
                node = new DataNode(para.getData(),para.getBaseUrl());
            }
        }
        else if (para.type.equals("DocumentType")) {
            node = new DocumentType(para.getName(),para.getPubSysKey(),para.getPublicld(),para.getSystemId(),para.getBaseUrl());
        }
        else if (para.type.equals("XmlDeclaration")) {
            if(para.getBaseUrl()==null){
                node = new XmlDeclaration(para.getName(),para.getisProcessingInstruction());
            }
            else{
                node = new XmlDeclaration(para.getName(),para.getBaseUrl(),para.getisProcessingInstruction());
            }
        }
        else if (para.type.equals("CDataNode")) {
            node = new CDataNode(para.getText());
        }
        else if (para.type.equals("Comment")) {
            if (para.getBaseUrl()==null){
                node = new Comment(para.getData());

            }
            else {
                node = new Comment(para.getData(),para.getBaseUrl());
            }
        }
        else if (para.type.equals("TextNode")) {
            if (para.getBaseUrl()==null){
                node = new TextNode(para.getText());

            }
            else {
                node = new TextNode(para.getText(),para.getBaseUrl());
            }
        }
        return node;
    }

}