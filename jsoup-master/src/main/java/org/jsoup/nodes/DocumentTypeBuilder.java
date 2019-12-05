package org.jsoup.nodes;

public class DocumentTypeBuilder extends LeafNodeBuilder {
    String name;
    String baseUri;
    String pubsyskey = null;
    String publicId;
    String systtemId;

    public DocumentTypeBuilder(String _type, String _name, String _pubsyskey, String _publicId, String _systemId, String _baseUri) {
        super.type = _type;
        name = _name;
        baseUri = _baseUri;
        pubsyskey = _pubsyskey;
        systtemId = _systemId;
        publicId = _publicId;
    }
    public DocumentTypeBuilder(String _type, String _name, String _publicId, String _systemId, String _baseUri){
        super.type = _type;
        name = _name;
        baseUri = _baseUri;
        systtemId = _systemId;
        publicId = _publicId;
    }
    public void buildPubsyskey(){
        para.setPubSysKey(pubsyskey);
    }
    public void buildData(){
        para.setData(null);
    };
    public void buildbasUri(){
        para.setBaseUrl(baseUri);
    };
    public void buildText(){
        para.setText(null);
    };
    public void buildName(){
        para.setName(name);
    };
    public void buildPublicld(){
        para.setPublicld(publicId);
    };
    public void buildSystemId(){
        para.setSystemId(systtemId);
    };
    public void buildIsProcessingInstruction(){
        para.setProcessingInstruction(false);
    };
}
