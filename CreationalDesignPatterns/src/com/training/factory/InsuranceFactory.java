package com.training.factory;

public class InsuranceFactory {

	public static Insurance getInsurance(int key) throws Exception{
		
		Insurance ins=null;
		
		switch (key) {
		case 1:
			   ins=new LifeInsurance();
			   break;
		case 2:
			ins=new HealthInsurance();
            break;
 		default:
 			throw new Exception("Invlid Choice Object can not be created");
		}
		
		return ins;
	}

   /*public  Insurance getInsurance(int ch){
		
		Insurance ins=null;
		
		if(ch==1)
		{
		   ins=new LifeInsurance();
		}
		else
		{
			ins=new HealthInsurance();
		}
		return ins;
	}*/
	

}
