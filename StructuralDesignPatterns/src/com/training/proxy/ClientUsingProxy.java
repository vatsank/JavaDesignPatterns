package com.training.proxy;
/* Client */
public class ClientUsingProxy {

	public static void main(String[] args) {
		
		
		 InterNetAccess proxy=new ProxyInterNetAccess();
		 
		      proxy.setEmpGrade(6);
		      proxy.grantPermission();
		     
		     
	}
}
