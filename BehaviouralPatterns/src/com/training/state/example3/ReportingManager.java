package com.training.state.example3;

public class ReportingManager implements ApplicationState {

	Employee emp;
	@Override
	public void next(Employee emp) {

		this.emp = emp;
		emp.setLeaveApplicationState(new HRManager());
		
	}

	@Override
	public void printStatus() {

		System.out.println(this.emp + "Reporting Manager has accepted the request");
	}

}
