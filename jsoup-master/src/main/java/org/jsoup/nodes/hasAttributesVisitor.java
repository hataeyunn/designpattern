package org.jsoup.nodes;

public class hasAttributesVisitor implements DPNodeVisitor{

	@Override
	public Object visit(Element element) {
		return element.attributes != null;
	}

	@Override
	public Object visit(LeafNode leafnode) {
		 return leafnode.value instanceof Attributes;
	}
}
