package org.jsoup.nodes;


public class XmlDeclarationBuilder extends LeafNodeBuilder {
    String name;
    Boolean IsProcessingInstruction;
    String baseUri = null;
    public XmlDeclarationBuilder(String _type, String _name,  String _baseUri,Boolean _IsProcessingInstruction) {
        super.type = _type;
        name = _name;
        baseUri = _baseUri;
        IsProcessingInstruction = _IsProcessingInstruction;
    }
    public XmlDeclarationBuilder(String _type, String _name, Boolean _IsProcessingInstruction){
        super.type = _type;
        name = _name;
        IsProcessingInstruction = _IsProcessingInstruction;
    }
    public void buildPubsyskey(){
        para.setPubSysKey(null);
    }
    public void buildData(){
        para.setData(null);
    };
    public void buildbasUri(){
        para.setBaseUrl(baseUri);
        System.out.println("baseuri");
        System.out.println(baseUri);
    };
    public void buildText(){
        para.setText(null);
    };
    public void buildName(){
        try {
            para.setName(name);
        } catch(Exception e) {
            System.out.println("name");
            System.out.println(name);
        }
    };
    public void buildPublicld(){
        para.setPublicld(null);
    };
    public void buildSystemId(){
        para.setSystemId(null);
    };
    public void buildIsProcessingInstruction(){
        para.setProcessingInstruction(IsProcessingInstruction);
        System.out.println("ispo");
        System.out.println(IsProcessingInstruction);
    };
}
