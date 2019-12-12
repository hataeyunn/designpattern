package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.MarkNodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class markDownVisitorTest {

    markDownVisitor test_visitor = new markDownVisitor();
    //Tag test_tag = new Tag("h1");
    //Element test_element = new Element(test_tag, null, null);
    Elements element;
    LeafNode leafnode;

    Document doc = Jsoup.connect("http://34.84.237.242:8080/test3").get();

    MarkNodeTraversor a = new MarkNodeTraversor();
    String result = a.traverse(doc);

    public markDownVisitorTest() throws IOException {
    }

    @Test
    public void testVisith1tag() {
        element = doc.select("h1");
        assertEquals("#초코 공룡쿠키 만들기\n",test_visitor.visit(element.first()));
    }

    @Test
    public void testVisith4tag() {
        element = doc.select("h4");
        assertEquals("####간편하지만 정성이 가득한 만들기 세트를 만나보세요.\n",test_visitor.visit(element.first()));
    }

    @Test
    public void testVisith3tag() {
        element = doc.select("h3");
        assertEquals("###재료\n",test_visitor.visit(element.first()));
    }

    @Test
    public void testVisitbrtag() {
        element = doc.select("br");
        assertEquals("<br/>\n\n",test_visitor.visit(element.first()));
    }

    @Test
    public void testVisitultag() {
        element = doc.select("li");
        Element test_element = null;
        for(int i=0; i<element.size();i++){
            test_element = element.get(i);
            if(test_element.parentNode().toString().startsWith("<ul>")) {
                assertEquals("* 하트쿠키믹스\n", test_visitor.visit(test_element));
                break;
            }
        }
    }

    @Test
    public void testVisitoltag() {
        element = doc.select("li");
        Element test_element = null;
        for(int i=0; i<element.size();i++){
            test_element = element.get(i);
            if(test_element.parentNode().toString().startsWith("<ol>")) {
                assertEquals("1. 볼에 실온상태의 버터, 달걀노른자, 우유, 녹인초콜릿, 하트쿠키믹스를 넣고 핸드믹서 거품기로30초 섞어주세요.\n", test_visitor.visit(test_element));
                break;
            }
        }
    }

    @Test
    public void testVisitimgtag() {
        element = doc.select("img");
        assertEquals("  \n![](./https://i.imgur.com/OHAZxMa.jpg)\n",test_visitor.visit(element.first()));
    }

/*
    @Test
    public void testVisitleafnode() {
        NodeVisitor visitor = null;
        Node node = doc;
        int depth = 0;
        int leafindex = 0;

        ArrayList<Node> leafnodes = new ArrayList<>();
        String content;
        while (node != null) {
            if(!(node instanceof image)) {
                content = ((String) (node.accept(new markDownVisitor())));
                if (content != null) {
                    if (result != null) {
                        result = result + content;
                    } else
                        result = "" + content;
                }
            }
            if (((int)(node.accept(new childnodeSizeVisitor()))) > 0) {
                node = node.childNode(0);
                depth++;
            } else {
                while (node.nextSibling() == null && depth > 0) {
                    node = node.parentNode();
                    depth--;
                }
                if (node == doc) {
                    break;
                }
                node = node.nextSibling();
            }
        }

        LeafNode test_leaf = null;
        for(int i=0; i<leafnodes.size(); i++) {

            String thiscontent = leafnode.value.toString();
            if(leafnode.parentNode().toString().startsWith("<body>")&&!thiscontent.equals("")&&thiscontent!=null){
                test_leaf = (LeafNode) leafnodes.get(i);
            }
        }


        assertEquals("  \n태윤:공룡쿠키잘만들었어요^^",test_visitor.visit(test_leaf));
    }
    */
 
}