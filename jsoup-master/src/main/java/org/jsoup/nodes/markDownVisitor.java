package org.jsoup.nodes;

public class markDownVisitor implements DPNodeVisitor{

    @Override
    public Object visit(Element element) {
        if(element.tag.toString() == "h1") {
            return "#" + element.text() + "\n";
        } else if(element.tag.toString() == "h2") {
            return "##" + element.text() + "\n";
        } else if(element.tag.toString() == "h3") {
            return "###" + element.text() + "\n";
        }else if(element.tag.toString() == "h4") {
            return "####" + element.text() + "\n";
        }else if(element.tag.toString() == "br") {
            return "<br/>\n\n";
        }else if(element.tag.toString() == "img") {
            return "  \n![]("+element.absUrl("src").toString()+")\n";
        }else if(element.tag.toString() == "li") {
            if(element.parentNode().toString().startsWith("<ol>"))
                return "* " + element.text() + "\n";
            else if(element.parentNode().toString().startsWith("<ul>"))
                return "1. " + element.text() + "\n";
            return null;
        }
        return null;
    }

    @Override
    public Object visit(LeafNode leafnode) {
        String content = leafnode.value.toString();
        content = content.replaceAll("\t","").replaceAll(" ","").replaceAll("\n","").trim();

        if(leafnode.parentNode().toString().startsWith("<body>")&&!content.equals("")&&content!=null){
                return "  \n" + content;
        }
        return null;
    }
}
