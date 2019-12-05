package org.jsoup.nodes;

import org.jsoup.parser.Tag;

public abstract class ElementBuilder {
    protected element_parameter para;
    protected String type;


    public element_parameter getParameter(){
        return para;
    }
    public void createNewParameter(){
        para = new element_parameter(type);
    }
    public abstract void buildTag();
    public abstract void buildbasUrI();
    public abstract void buildAttributes();

}
