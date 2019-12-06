package org.jsoup.nodes;

import java.io.IOException;

public class image extends LeafNode {
    private static final String Image_key = "image";
    private String data = null;
    public image(String data) {
        value = data;
    }
    public image(String data, String baseUri) {
        this(data);
    }

    public String nodeName() {
        return "#image";
    }

    public String getWholeData() {
        return coreValue();
    }
    public String getdata(){
        return data;
    }

    void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        accum.append(getWholeData()); // data is not escaped in return from data nodes, so " in script, style is plain
    }

    void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {}

    @Override
    public String toString() {
        return outerHtml();
    }

    public image setWholeData(String data) {
        coreValue(data);
        return this;
    }

    /**
     Create a new DataNode from HTML encoded data.
     @param encodedData encoded data
     @param baseUri bass URI
     @return new DataNode
     */
    @Deprecated
    public static image createFromEncoded(String encodedData, String baseUri) {
        String data = Entities.unescape(encodedData);
        LeafNodeDirector leaf = new LeafNodeDirector();
        LeafNodeBuilder datanode = new imageBuilder("image",data);

        leaf.setLeafNodeBuilder(datanode);
        leaf.constructparameter();
        LeafNode_parameter params = leaf.getelement();

        MakeLeafnode factory = new MakeLeafnode();

        return (image) factory.createnode(params);
    }
}

