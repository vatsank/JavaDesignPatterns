package com.training.chain;

public class TeamLeader implements Approver {

	private Approver successor;
	@Override
	public void setSuccessor(Approver successor) {
		
		this.successor=successor;

	}

	@Override
	public void processRequest(ApprovalRequest request) {
		
		     String req=request.getRequest();
		    if(req.equals("LEAVE"))
		    {
		    	System.out.println("Approved by the Team Lead");
		    	
		    }
		    else
		    {
		    	System.out.println("Requires Manager Approval -Forwarding");
		     successor.processRequest(request);
		    }

	}

}
