package org.jsoup.nodes;

import org.jsoup.parser.Tag;

public class element_parameter extends parameter {
    private String baseUri;
    private Tag tag;
    private Attribute attributes;

    element_parameter(String type){
        super.type = type;
    }
    public void setTag(Tag tag) {this.tag = tag;}
    public void setBaseUri(String baseUri) {this.baseUri = baseUri;}
    public void setAttributes(Attribute attributes) {this.attributes = attributes;}

    public String getBaseUri() {
        return baseUri;
    }

    public Tag getTag() {
        return tag;
    }

    public Attribute getAttributes() {
        return attributes;
    }

    public String getType() {return type;}

}
