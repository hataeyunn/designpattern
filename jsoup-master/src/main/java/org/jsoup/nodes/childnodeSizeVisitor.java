package org.jsoup.nodes;

public class childnodeSizeVisitor implements DPNodeVisitor {

	@Override
	public Object visit(Element element) {
		return element.childNodes.size();
	}

	@Override
	public Object visit(LeafNode leafnode) {
		return 0;
	}

}
