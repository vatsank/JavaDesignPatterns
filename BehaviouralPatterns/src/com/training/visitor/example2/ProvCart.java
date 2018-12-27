package com.training.visitor.example2;

public class ProvCart implements MyVisitable {

	int provList[] = {45,56,78,12,30};
	
	@Override
	public void accept(MyVisitor visitor) {
	
		visitor.visit(this);
	}

	public int[] getProvList() {
		return provList;
	}

	public void setProvList(int[] provList) {
		this.provList = provList;
	}

	
}
