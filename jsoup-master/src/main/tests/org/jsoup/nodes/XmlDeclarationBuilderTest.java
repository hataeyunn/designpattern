package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class XmlDeclarationBuilderTest {

    @Test
    public void buildbasUri() {
    }

    @Test
    public void buildName() {
        LeafNodeBuilder xmldeclaration = new XmlDeclarationBuilder("XmlDeclaration", "aaa",true);
        xmldeclaration.createNewParameter();
        xmldeclaration.buildData();
        assertEquals("aaa",xmldeclaration.getParameter().getName());
    }

    @Test
    public void buildIsProcessingInstruction() {
    }
}