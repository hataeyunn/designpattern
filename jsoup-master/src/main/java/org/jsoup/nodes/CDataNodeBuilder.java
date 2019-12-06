package org.jsoup.nodes;

public class CDataNodeBuilder extends TextNodeBuilder {
    String text;

    public CDataNodeBuilder(String _type, String _text) {
        super(_type, _text);
    }
    public void buildbasUri(){
        para.setBaseUrl(null);
    };

}
