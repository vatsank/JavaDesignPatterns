package com.training.visitor.example2;

public class ProvCart implements MyVisitable {

	Integer provList[] = {45,56,78,142,30};
	
	@Override
	public void accept(MyVisitor visitor) {
	
		visitor.visit(this);
	}

	public Integer[] getProvList() {
		return provList;
	}

	public void setProvList(Integer[] provList) {
		this.provList = provList;
	}

	
}
