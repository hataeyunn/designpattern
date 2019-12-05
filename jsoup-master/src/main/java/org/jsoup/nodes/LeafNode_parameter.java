package org.jsoup.nodes;


public class LeafNode_parameter extends parameter{
    private String data;
    private String baseUrl;
    private String text;
    private String name;
    private String publicld;
    private String systemId;
    private String pubSysKey;
    private boolean IsProcessingInstruction;

    LeafNode_parameter(String type){
        super.type = type;
    }

    public void setPubSysKey(String pubSysKey) {
        this.pubSysKey = pubSysKey;
    }

    public String getPubSysKey() {
        return pubSysKey;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublicld(String publicld) {
        this.publicld = publicld;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public void setProcessingInstruction(boolean processingInstruction) {
        IsProcessingInstruction = processingInstruction;
    }

    public String getData() {
        return data;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    public String getPublicld() {
        return publicld;
    }

    public String getSystemId() {
        return systemId;
    }

    public boolean getisProcessingInstruction() {
        return IsProcessingInstruction;
    }

    public String getType() {return type;}
}
