package org.jsoup.nodes;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeafNodeBuilderTest {

    public static LeafNodeBuilder test_Textnode;
    public static LeafNodeBuilder test_CDatanode;
    public static LeafNodeBuilder test_Datanode;
    public static LeafNodeBuilder test_Comment;
    public static LeafNodeBuilder test_Documenttype;
    public static LeafNodeBuilder test_Image;
    public static LeafNodeBuilder test_XML;

    public static LeafNodeDirector Cdata;
    public static LeafNodeDirector data;
    public static LeafNodeDirector image;
    public static LeafNodeDirector xml;
    public static LeafNodeDirector textnode;
    public static LeafNodeDirector comment;
    public static LeafNodeDirector documenttype;

    @BeforeClass
    public static void MakeInstance() throws Exception{


        test_CDatanode = new CDataNodeBuilder("CDataNode","a");
        test_Datanode = new DataNodeBuilder("DataNode","a","b");
        test_Image = new imageBuilder("image","a");
        test_XML = new XmlDeclarationBuilder("XmlDeclaration","a",false);
        test_Textnode = new TextNodeBuilder("TextNode","a","b");
        test_Comment = new CommentBuilder("Comment","a","b");
        test_Documenttype = new DocumentTypeBuilder("DocumentType","a","b","c","d","e");

        Cdata= new LeafNodeDirector();
        Cdata.setLeafNodeBuilder(test_CDatanode);
        Cdata.constructparameter();

        data= new LeafNodeDirector();
        data.setLeafNodeBuilder(test_Datanode);
        data.constructparameter();

        image= new LeafNodeDirector();
        image.setLeafNodeBuilder(test_Image);
        image.constructparameter();

        xml= new LeafNodeDirector();
        xml.setLeafNodeBuilder(test_XML);
        xml.constructparameter();

        textnode= new LeafNodeDirector();
        textnode.setLeafNodeBuilder(test_Textnode);
        textnode.constructparameter();

        comment= new LeafNodeDirector();
        comment.setLeafNodeBuilder(test_Comment);
        comment.constructparameter();

        documenttype= new LeafNodeDirector();
        documenttype.setLeafNodeBuilder(test_Documenttype);
        documenttype.constructparameter();


    }
    @Test
    public void CDataNodeTest() {
        assertEquals("a",Cdata.getelement().getText());
        assertEquals("CDataNode",test_CDatanode.getParameter().getType());

    }
    @Test
    public void DataNodeTest(){
        assertEquals("a",test_Datanode.getParameter().getData());
        assertEquals("b",test_Datanode.getParameter().getBaseUrl());
        assertEquals("DataNode",test_Datanode.getParameter().getType());
    }

    @Test
    public void DocumentTypeTest(){

        assertEquals("a",test_Documenttype.getParameter().getName());
        assertEquals("b",test_Documenttype.getParameter().getPubSysKey());
        assertEquals("c",test_Documenttype.getParameter().getPublicld());
        assertEquals("d",test_Documenttype.getParameter().getSystemId());
        assertEquals("e",test_Documenttype.getParameter().getBaseUrl());
        assertEquals("DocumentType",test_Documenttype.getParameter().getType());


    }
    @Test
    public void CommentTest(){

        assertEquals("a",test_Comment.getParameter().getData());
        assertEquals("b",test_Comment.getParameter().getBaseUrl());
        assertEquals("Comment",test_Comment.getParameter().getType());
    }
    @Test
    public void TextNodeTest(){

        assertEquals("a",test_Textnode.getParameter().getText());
        assertEquals("b",test_Textnode.getParameter().getBaseUrl());
        assertEquals("TextNode",test_Textnode.getParameter().getType());
    }

    @Test
    public void XMLTest(){

        assertEquals("a",test_XML.getParameter().getName());
        assertEquals(false,test_XML.getParameter().getisProcessingInstruction());
        assertEquals("XmlDeclaration",test_XML.getParameter().getType());
    }
    @Test
    public void imageTest(){

        assertEquals("a",test_Image.getParameter().getData());
        assertEquals("image",test_Image.getParameter().getType());

    }
}