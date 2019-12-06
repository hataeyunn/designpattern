package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class DocumentTypeBuilderTest {

    @Test
    public void buildPubsyskey() {
        LeafNodeBuilder documenttype = new DocumentTypeBuilder("TextNode", "name", "publicid", "systemid", "baseuri");
        documenttype.createNewParameter();
        documenttype.buildPubsyskey();
        assertEquals(null, documenttype.getParameter().getPubSysKey());
    }

    @Test
    public void buildbasUri() {
        LeafNodeBuilder documenttype = new DocumentTypeBuilder("TextNode", "name", "publicid", "systemid", "baseuri");
        documenttype.createNewParameter();
        documenttype.buildbasUri();
        assertEquals("baseuri", documenttype.getParameter().getBaseUrl());

    }

    @Test
    public void buildName() {
        LeafNodeBuilder documenttype = new DocumentTypeBuilder("TextNode", "name", "publicid", "systemid", "baseuri");
        documenttype.createNewParameter();
        documenttype.buildName();
        assertEquals("name", documenttype.getParameter().getName());
    }

    @Test
    public void buildPublicld() {
        LeafNodeBuilder documenttype = new DocumentTypeBuilder("TextNode", "name", "publicid", "systemid", "baseuri");
        documenttype.createNewParameter();
        documenttype.buildPublicld();
        assertEquals("publicid", documenttype.getParameter().getPublicld());
    }

    @Test
    public void buildSystemId() {
        LeafNodeBuilder documenttype = new DocumentTypeBuilder("TextNode", "name", "publicid", "systemid", "baseuri");
        documenttype.createNewParameter();
        documenttype.buildSystemId();
        assertEquals("systemid", documenttype.getParameter().getSystemId());
    }
}
