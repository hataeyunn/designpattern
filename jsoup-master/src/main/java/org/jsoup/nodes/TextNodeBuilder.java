package org.jsoup.nodes;


public class TextNodeBuilder extends LeafNodeBuilder {
    String text;
    String baseUri = null;
    public TextNodeBuilder(String _type, String _text) {
        super.type = _type;
        text = _text;
    }
    public TextNodeBuilder(String _type, String _text, String _baseUri){
        super.type = _type;
        text = _text;
        baseUri = _baseUri;
    }
    public void buildPubsyskey(){
        para.setPubSysKey(null);
    }
    public void buildData(){
        para.setData(null);
    };
    public void buildbasUri(){
        para.setBaseUrl(baseUri);
    };
    public void buildText(){
        para.setText(text);
    };
    public void buildName(){
        para.setName(null);
    };
    public void buildPublicld(){
        para.setPublicld(null);
    };
    public void buildSystemId(){
        para.setSystemId(null);
    };
    public void buildIsProcessingInstruction(){
        para.setProcessingInstruction(false);
    };
}
