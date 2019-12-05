package org.jsoup.nodes;

public class baseUriVisitor implements DPNodeVisitor {

	@Override
	public Object visit(Element element) {
		return element.baseUri;
	}

	@Override
	public Object visit(LeafNode leafnode) {
		return leafnode.hasParent() ? leafnode.parent().accept(new baseUriVisitor()) : "";
	}
}
