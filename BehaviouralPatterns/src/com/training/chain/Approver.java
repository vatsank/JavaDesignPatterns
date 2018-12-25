package com.training.chain;

public interface Approver {

       public void setSuccessor(Approver successor);
    
        public void processRequest(ApprovalRequest request);

}
