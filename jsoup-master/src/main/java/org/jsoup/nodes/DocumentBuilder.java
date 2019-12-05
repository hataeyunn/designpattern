package org.jsoup.nodes;

public class DocumentBuilder extends ElementBuilder {
    private String baseUri;

    DocumentBuilder (String type, String _baseUri){
        super.type = type;
        baseUri = _baseUri;
    }
    @Override
    public void buildTag(){
        para.setTag(null);
    }

    @Override
    public void buildAttributes() {
        para.setAttributes(null);
    }

    @Override
    public void buildbasUrI() {
        para.setBaseUri(baseUri);
    }
}
