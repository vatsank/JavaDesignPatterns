package com.training.chain;

public  class ApprovalRequest {

	private String requestor_Id;
	private String request;
	
	public String getRequestor_Id() {
		return requestor_Id;
	}
	public void setRequestor_Id(String requestor_Id) {
		this.requestor_Id = requestor_Id;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public ApprovalRequest(String requestor_Id, String request) {
		super();
		this.requestor_Id = requestor_Id;
		this.request = request;
	}
	public ApprovalRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
