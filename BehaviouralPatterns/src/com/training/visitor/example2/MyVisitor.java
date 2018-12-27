package com.training.visitor.example2;

public interface MyVisitor {

	public void  visit(BookCart cart);
	public void visit(ProvCart cart);
}
