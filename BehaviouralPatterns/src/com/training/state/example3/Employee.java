package com.training.state.example3;

public class Employee {

	private String empName;
	private String designation;
	
	private ApplicationState leaveApplicationState ;

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", designation=" + designation + ", leaveApplicationState="
				+ leaveApplicationState + "]";
	}

	public Employee(String empName, String designation) {
		super();
		this.empName = empName;
		this.designation = designation;
		leaveApplicationState = new ReportingManager();
	}

	
	public Employee() {
		super();
		
	}
	
	public ApplicationState getLeaveApplicationState() {
		return leaveApplicationState;
	}

	public void setLeaveApplicationState(ApplicationState leaveApplicationState) {
		this.leaveApplicationState = leaveApplicationState;
	}

  public void nextState() {
	  
	  leaveApplicationState.next(this);
	  System.out.println("Changing the State ");
  }

   public void printState() {
	 
	   System.out.println("Reuest sent for Reporting Manager");
	  }
}
