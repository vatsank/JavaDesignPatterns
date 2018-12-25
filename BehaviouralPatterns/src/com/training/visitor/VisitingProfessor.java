package com.training.visitor;

public class VisitingProfessor implements Visitor {

	private double salary;
	@Override
	public double visit(Universty univ) {
		
	     salary+=univ.getProf_Fees();
		
		return salary;
	}

	@Override
	public double visit(College college) {
		
		salary+=college.getProf_fees();
		return salary;
	}

	public double getSalary(){
		
		return salary;
	}
}
