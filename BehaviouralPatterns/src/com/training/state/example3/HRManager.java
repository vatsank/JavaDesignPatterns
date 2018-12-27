package com.training.state.example3;

public class HRManager implements ApplicationState {

	Employee emp;
	@Override
	public void next(Employee emp) {

		this.emp = emp;
		printStatus();
	}

	@Override
	public void printStatus() {
           System.out.println(this.emp+ "Request accepted by HR Manager");
	}

}
