package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataNodeBuilderTest {

    @Test
    public void buildData() {
        LeafNodeBuilder documenttype = new DataNodeBuilder("DataNode", "data","baseuri");
        documenttype.createNewParameter();
        documenttype.buildData();
        assertEquals("data", documenttype.getParameter().getData());
    }

    @Test
    public void buildbasUri() {
        LeafNodeBuilder documenttype = new DataNodeBuilder("DataNode", "data","baseuri");
        documenttype.createNewParameter();
        documenttype.buildbasUri();
        assertEquals("baseuri", documenttype.getParameter().getBaseUrl());
    }

}