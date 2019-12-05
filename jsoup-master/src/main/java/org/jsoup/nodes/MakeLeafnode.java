package org.jsoup.nodes;

public class MakeLeafnode extends MakeFactory<LeafNode_parameter> {
    DataNode a = null;
    DocumentType b = null;
    XmlDeclaration c = null;
    CDataNode d = null;
    Comment e = null;
    TextNode f = null;

    @Deprecated
    public Node createnode(LeafNode_parameter para) {
        if (para.type.equals("DataNode")) {
            if (para.getBaseUrl() == null) {
                a = new DataNode(para.getData());
                return a;
            } else {
                a = new DataNode(para.getData(), para.getBaseUrl());
                return a;

            }
        } else if (para.type.equals("DocumentType")) {
            b = new DocumentType(para.getName(), para.getPubSysKey(), para.getPublicld(), para.getSystemId(), para.getBaseUrl());
            return b;

        } else if (para.type.equals("XmlDeclaration")) {
            if (para.getBaseUrl() == null) {

                c = new XmlDeclaration(para.getName(), para.getisProcessingInstruction());

                return c;
            } else {
                c = new XmlDeclaration(para.getName(), para.getBaseUrl(), para.getisProcessingInstruction());
                return c;
            }
        } else if (para.type.equals("CDataNode")) {
            d = new CDataNode(para.getText());
            return d;
        } else if (para.type.equals("Comment")) {
            if (para.getBaseUrl() == null) {
                e = new Comment(para.getData());
                return e;

            } else {
                e = new Comment(para.getData(), para.getBaseUrl());
                return e;
            }
        } else if (para.type.equals("TextNode")) {
            if (para.getBaseUrl() == null) {
                f = new TextNode(para.getText());
                return f;

            } else {
                f = new TextNode(para.getText(), para.getBaseUrl());
                return f;
            }
        }
        else {
            return null;
        }


    }
}
