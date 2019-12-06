package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextNodeBuilderTest {
    @Test
    public void buildbasUri(){
        LeafNodeBuilder textnode = new TextNodeBuilder("TextNode", "text",null);
        textnode.createNewParameter();
        textnode.buildbasUri();
        assertEquals(null, textnode.getParameter().getBaseUrl());
    }

    @Test
    public void buildText() {
        LeafNodeBuilder textnode = new TextNodeBuilder("TextNode", "text");
        textnode.createNewParameter();
        textnode.buildText();
        assertEquals("text",textnode.getParameter().getText());
    }

}