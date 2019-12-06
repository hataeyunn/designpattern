package org.jsoup.nodes;

public class imageBuilder extends LeafNodeBuilder {
    String data;
    String baseUri = null;
    public imageBuilder(String _type, String _data) {
        super.type = _type;
        data = _data;
    }
    public imageBuilder(String _type, String _data, String _baseUri){
        super.type = _type;
        data = _data;
        baseUri = _baseUri;
    }
    public void buildPubsyskey(){
        para.setPubSysKey(null);
    }
    public void buildData(){
        para.setData(data);
    };
    public void buildbasUri(){
        para.setBaseUrl(baseUri);
    };
    public void buildText(){
        para.setText(null);
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
