package org.jsoup.nodes;

import org.jsoup.nodes.Element.NodeList;

public class ensureChildNodesVisitor implements DPNodeVisitor{

	@Override
	public Object visit(Element element) {
		if (element.childNodes == element.EMPTY_NODES) {
            element.childNodes = new Element.NodeList(element, 4);
        }
        return element.childNodes;
	}

	@Override
	public Object visit(LeafNode leafnode) {

	    return leafnode.EmptyNodes;
	}

}
