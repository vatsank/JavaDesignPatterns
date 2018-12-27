package com.training.state.example3;

public class HRManager implements ApplicationState {

	Employee emp;
	
	public HRManager(Employee emp) {
		super();
		this.emp = emp;
	}

	@Override
	public void next(Employee emp) {

		this.emp = emp;
		
		
	}

	@Override
	public void printStatus() {
           System.out.println("Request of" +this.emp+ "accepted by HR Manager");
	}

}
