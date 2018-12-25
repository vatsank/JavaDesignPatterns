package com.training.visitor;

public class Universty implements Visitable {

	private double prof_Fees;
	
	public Universty(double prof_Fees) {
		super();
		this.prof_Fees = prof_Fees;
	}

	public double getProf_Fees() {
		return prof_Fees;
	}

	public void setProf_Fees(double prof_Fees) {
		this.prof_Fees = prof_Fees;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
