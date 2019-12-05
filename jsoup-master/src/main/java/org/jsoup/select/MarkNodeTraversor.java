package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.childnodeSizeVisitor;
import org.jsoup.nodes.markDownVisitor;

public class MarkNodeTraversor{
    /**
     * Made by Jimin.
     * Start a depth-first traverse of the root and all of its descendants.
     * And return the elements to write to the md file.
     * @param root the root node point to traverse
     * @return result the String from html.
     */
    public static String traverse(Node root) {
        Node node = root;
        int depth = 0;
        String result = null;
        String content = null;

        while (node != null) {
            content = ((String) (node.accept(new markDownVisitor())));
            if(content != null) {
                if (result != null) {
                    result = result + content;
                } else
                    result = "" + content;
            }

            if (((int)(node.accept(new childnodeSizeVisitor()))) > 0) {
                node = node.childNode(0);
                depth++;
            } else {
                while (node.nextSibling() == null && depth > 0) {
                    node = node.parentNode();
                    depth--;
                }
                if (node == root) {
                    break;
                }
                node = node.nextSibling();
            }
        }
        return result;
    }

    /**
     * Start a depth-first traverse of all elements.
     * @param elements Elements to filter.
     */
    public static void traverse(Elements elements) {
        Validate.notNull(elements);
        for (Element el : elements)
            traverse(el);
    }
}
