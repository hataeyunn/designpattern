package org.jsoup.nodes;

public interface DPNodeVisitor {
    Object visit(Element element);
    Object visit(LeafNode leafnode);
}