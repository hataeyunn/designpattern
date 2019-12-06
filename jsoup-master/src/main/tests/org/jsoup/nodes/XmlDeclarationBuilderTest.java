package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class XmlDeclarationBuilderTest {

    @Test
    public void buildbasUri() {
        LeafNodeBuilder xmldeclaration = new XmlDeclarationBuilder("XmlDeclaration", "name",null,true);
        xmldeclaration.createNewParameter();
        xmldeclaration.buildbasUri();
        assertEquals(null,xmldeclaration.getParameter().getBaseUrl());
    }

    @Test
    public void buildName() {
        LeafNodeBuilder xmldeclaration = new XmlDeclarationBuilder("XmlDeclaration", null,"baseuri",true);
        xmldeclaration.createNewParameter();
        xmldeclaration.buildName();
        assertEquals(null,xmldeclaration.getParameter().getName());
    }

    @Test
    public void buildIsProcessingInstruction() {
        LeafNodeBuilder xmldeclaration = new XmlDeclarationBuilder("XmlDeclaration", "name","baseuri",false);
        xmldeclaration.createNewParameter();
        xmldeclaration.buildIsProcessingInstruction();
        assertEquals(false,xmldeclaration.getParameter().getisProcessingInstruction());
    }
}