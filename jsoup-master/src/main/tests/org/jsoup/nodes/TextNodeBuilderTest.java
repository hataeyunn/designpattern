package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextNodeBuilderTest {
    @Test
    public void buildbasUri(){}

    @Test
    public void buildText() {

        LeafNodeBuilder textnode = new TextNodeBuilder("TextNode", "aaa");
        textnode.createNewParameter();
        textnode.buildText();
        assertEquals("aaa",textnode.getParameter().getText());
    }

}