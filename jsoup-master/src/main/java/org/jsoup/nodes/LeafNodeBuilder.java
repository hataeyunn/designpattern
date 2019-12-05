package org.jsoup.nodes;

public abstract class LeafNodeBuilder {


    protected LeafNode_parameter para;
    protected String type;


    public LeafNode_parameter getParameter(){
        return para;
    }
    public void createNewParameter(){
        para = new LeafNode_parameter(type);
    }
    public abstract void buildData();
    public abstract void buildPubsyskey();
    public abstract void buildbasUri();
    public abstract void buildText();
    public abstract void buildName();
    public abstract void buildPublicld();
    public abstract void buildSystemId();
    public abstract void buildIsProcessingInstruction();


}
