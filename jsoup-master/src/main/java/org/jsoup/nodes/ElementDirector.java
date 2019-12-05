package org.jsoup.nodes;

public class ElementDirector {
    public ElementBuilder ElemBuilder;
    public void setElementBuilder(ElementBuilder element){
        ElemBuilder = element;
    }
    public element_parameter getelement(){
        return ElemBuilder.getParameter();
    }
    public void constructparameter(){
        ElemBuilder.createNewParameter();
        ElemBuilder.buildTag();
        ElemBuilder.buildbasUrI();
        ElemBuilder.buildAttributes();
    }
}