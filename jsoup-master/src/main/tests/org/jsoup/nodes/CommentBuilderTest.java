package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommentBuilderTest {

    @Test
    public void buildData() {
        LeafNodeBuilder comment = new CommentBuilder("Comment", "aaa");
        comment.createNewParameter();
        comment.buildData();
        assertEquals("aaa",comment.getParameter().getData());
    }

    @Test
    public void buildbasUri() {
    }
}