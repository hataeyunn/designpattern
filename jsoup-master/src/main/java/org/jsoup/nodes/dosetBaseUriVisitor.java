package org.jsoup.nodes;

public class dosetBaseUriVisitor implements DPNodeVisitor {

	String baseUri;
	public dosetBaseUriVisitor(String baseUri) {
		this.baseUri = baseUri;
	}
	
	@Override
	public Object visit(Element element) {
		  element.baseUri = this.baseUri;
		  return null;
	}

	@Override
	public Object visit(LeafNode leafnode) {
		return null;
	}

}
