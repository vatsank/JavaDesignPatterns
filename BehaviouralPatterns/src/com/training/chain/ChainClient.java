package com.training.chain;

public class ChainClient {

	
	public static void main(String[] args) {

		TeamLeader team =new TeamLeader();
        Manager manager = new Manager();

        team.setSuccessor(manager);
        
        
              team.processRequest(new ApprovalRequest("A1010", "TRVL"));
                 
            
        }

	
}
