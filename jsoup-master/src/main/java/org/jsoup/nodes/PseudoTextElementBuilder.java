package org.jsoup.nodes;

import org.jsoup.parser.Tag;

public class PseudoTextElementBuilder extends ElementBuilder {
    private String baseUri;
    private Attributes attributes;
    private Tag tag;

    public PseudoTextElementBuilder (String type, Tag _tag, String _baseUri, Attributes _attributes){
        super.type = type;
        baseUri = _baseUri;
        attributes = _attributes;
        tag = _tag;

    }
    @Override
    public void buildTag(){
        para.setTag(tag);
    }

    @Override
    public void buildAttributes() {
        para.setAttributes(attributes);
    }

    @Override
    public void buildbasUrI() {
        para.setBaseUri(baseUri);
    }
}
