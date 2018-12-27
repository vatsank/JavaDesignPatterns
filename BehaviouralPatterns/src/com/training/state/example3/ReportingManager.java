package com.training.state.example3;

public class ReportingManager implements ApplicationState {

	Employee emp;
	@Override
	public void next(Employee emp) {

		this.emp = emp;
        emp.setLeaveApplicationState(new HRManager(emp));
		
	}

	@Override
	public void printStatus() {

	  System.out.println("Received by Reporting Manager");
	
	}

}
