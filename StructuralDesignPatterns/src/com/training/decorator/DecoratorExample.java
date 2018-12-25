package com.training.decorator;


public class DecoratorExample {

	public static void main(String[] args) {
	

		 BankAccount account1 = new SavingsAccount();
		 
				System.out.println("Minimum Balance "+account1.balanceToMaintain());
		
		 	 
		 
		 //FeatureDectorator account1x = new OnlineBanking(account1);
		 
				OnlineBanking account1x = new OnlineBanking(account1);
				
		 	System.out.println("Minimum Balance with One Feature"+account1x.balanceToMaintain());
   		
		 
		 	 
		 //FeatureDectorator account2x = new InternationalBanking(new OnlineBanking(account1));
		
		 InternationalBanking account2x = new InternationalBanking(new OnlineBanking(account1));
			
		 
           		 System.out.println("Minimum Balance with Two Feature"+account2x.balanceToMaintain());
           		 

           		 
		 
	}

}
