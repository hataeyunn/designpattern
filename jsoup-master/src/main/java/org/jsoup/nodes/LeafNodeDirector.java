package org.jsoup.nodes;

public class LeafNodeDirector {
    public LeafNodeBuilder LeafBuilder;
    private void setLeafNodeBuilder (LeafNodeBuilder leafnode){
        LeafBuilder = leafnode;
    }
    public parameter getelement(){
        return LeafBuilder.getParameter();
    }
    public void constructparameter() {
        LeafBuilder.createNewParameter();
        LeafBuilder.buildbasUri();
        LeafBuilder.buildData();
        LeafBuilder.buildIsProcessingInstruction();
        LeafBuilder.buildName();
        LeafBuilder.buildPublicld();
        LeafBuilder.buildPubsyskey();
        LeafBuilder.buildSystemId();
        LeafBuilder.buildText();
    }
}
