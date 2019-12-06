package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommentBuilderTest {

    @Test
    public void buildData() {
        LeafNodeBuilder comment = new CommentBuilder("Comment", "data","baseuri");
        comment.createNewParameter();
        comment.buildData();
        assertEquals("data",comment.getParameter().getData());
    }

    @Test
    public void buildbasUri() {
        LeafNodeBuilder comment = new CommentBuilder("Comment", "data","baseuri");
        comment.createNewParameter();
        comment.buildbasUri();
        assertEquals("baseuri",comment.getParameter().getBaseUrl());
    }
}