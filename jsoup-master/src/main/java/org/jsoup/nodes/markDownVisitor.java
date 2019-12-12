package org.jsoup.nodes;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

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
            StoreImage(element.absUrl("src").toString());
            return "  \n![](./"+element.absUrl("src").toString()+")\n";
        }else if(element.tag.toString() == "li") {
            if(element.parentNode().toString().startsWith("<ol>"))
                return "1. " + element.text() + "\n";
            else if(element.parentNode().toString().startsWith("<ul>"))
                return "* " + element.text() + "\n";
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
    public void StoreImage(String _url){
        URL url = null;
        InputStream in = null;
        OutputStream out = null;

        try {

            url = new URL(_url);

            in = url.openStream();


            out = new FileOutputStream("image"+".jpg");

            while(true){
                //이미지를 읽어온다.
                int data = in.read();
                if(data == -1){
                    break;
                }
                //이미지를 쓴다.
                out.write(data);

            }

            in.close();
            out.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
