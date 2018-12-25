package com.training.chain;

public class Manager implements Approver {

	@Override
	public void setSuccessor(Approver successor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void processRequest(ApprovalRequest request) {

		 String req=request.getRequest();
		    if(req.equals("TRVL"))
		    {
		    	System.out.println("Approved by the Manager");
		    	
		    }
		    

	}

}
