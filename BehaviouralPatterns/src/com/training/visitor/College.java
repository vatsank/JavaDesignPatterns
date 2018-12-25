package com.training.visitor;

public class College implements Visitable {

	   private double prof_fees; 
	   
	   
	public College(double prof_fees) {
		super();
		this.prof_fees = prof_fees;
	}


	public double getProf_fees() {
		return prof_fees;
	}


	public void setProf_fees(double prof_fees) {
		this.prof_fees = prof_fees;
	}


	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	
}
