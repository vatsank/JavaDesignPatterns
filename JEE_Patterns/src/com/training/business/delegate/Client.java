package com.training.business.delegate;

public class Client {

	   BusinessDelegate businessService;

	   public Client(BusinessDelegate businessService){
	      this.businessService  = businessService;
	   }

	   public void doTask(){		
	      businessService.doTask();
	   }

	   public static void main(String[] args) {
		      BusinessDelegate businessDelegate = new BusinessDelegate();
		      businessDelegate.setServiceType("EJB");

		      Client client = new Client(businessDelegate);
		      client.doTask();

		      businessDelegate.setServiceType("JMS");
		      client.doTask();

	}
}
