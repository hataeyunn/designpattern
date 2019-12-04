package org.jsoup.nodes;

public class attributesVisitor implements DPNodeVisitor {

	@Override
	public Object visit(Element element) {
		if (!(boolean)(element.accept(new hasAttributesVisitor())))
            element.attributes = new Attributes();
        return element.attributes;
	}

	@Override
	public Object visit(LeafNode leafnode) {

		leafnode.ensureAttributes();
        return (Attributes) leafnode.value;
	}	
}
