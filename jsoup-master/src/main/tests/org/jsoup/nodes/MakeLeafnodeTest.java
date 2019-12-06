package org.jsoup.nodes;

import org.junit.Test;

import javax.sound.midi.SysexMessage;

import static org.junit.Assert.*;

public class MakeLeafnodeTest {

    @Deprecated
    @Test
    public void createnode() {
        LeafNodeDirector leaf = new LeafNodeDirector();
        LeafNodeBuilder xmlDeclaration = new XmlDeclarationBuilder("XmlDeclaration","xml",false);
        try {
            leaf.setLeafNodeBuilder(xmlDeclaration);
            leaf.constructparameter();
        } catch(Exception e1){
            System.out.println(e1);
        }
        LeafNode_parameter params = leaf.getelement();

        MakeLeafnode factory = new MakeLeafnode();
        XmlDeclaration decl;
        try {
            decl = (XmlDeclaration) factory.createnode(params);
        } catch (Exception e2){
            System.out.println(e2);
        }

        assertEquals(false,xmlDeclaration.getParameter().getisProcessingInstruction());
        assertEquals("xml", xmlDeclaration.getParameter().getName());
    }
}