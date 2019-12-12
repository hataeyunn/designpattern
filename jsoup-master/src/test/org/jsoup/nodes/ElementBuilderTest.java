package org.jsoup.nodes;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElementBuilderTest {

    public static ElementBuilder test_pseudotextelement;
    public static ElementBuilder test_document;
    public static ElementBuilder test_form;

    public static ElementDirector pseudo;
    public static ElementDirector document;
    public static ElementDirector form;

    @BeforeClass
    public static void MakeInstance() throws Exception{

        test_pseudotextelement = new PseudoTextElementBuilder("PseudoText",null,"baseUri",null);
        test_document = new DocumentBuilder("document","baseUri");
        test_form = new FormElementBuilder("Form",null,"baseUri",null);

        pseudo = new ElementDirector();
        pseudo.setElementBuilder(test_pseudotextelement);
        pseudo.constructparameter();

        document = new ElementDirector();
        document.setElementBuilder(test_document);
        document.constructparameter();

        form = new ElementDirector();
        form.setElementBuilder(test_form);
        form.constructparameter();

    }

    @Test
    public void PseudoTextTest(){
        assertEquals("PseudoText",test_pseudotextelement.getParameter().getType());
        assertEquals(null,test_pseudotextelement.getParameter().getTag());
        assertEquals("baseUri",test_pseudotextelement.getParameter().getBaseUri());
        assertEquals(null,test_pseudotextelement.getParameter().getAttributes());
    }

    @Test
    public void FormElementTest(){
        assertEquals("Form",test_form.getParameter().getType());
        assertEquals(null,test_form.getParameter().getTag());
        assertEquals("baseUri",test_form.getParameter().getBaseUri());
        assertEquals(null,test_form.getParameter().getAttributes());
    }

    @Test
    public void DocumentTest(){
        assertEquals("document",test_document.getParameter().getType());
        assertEquals("baseUri",test_document.getParameter().getBaseUri());
    }
}