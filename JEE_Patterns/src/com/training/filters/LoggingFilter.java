package com.training.filters;

public class LoggingFilter implements Filter {

	@Override
	public void execute(String request) {
		// TODO Auto-generated method stub

		System.out.println("log filter called");
	}

}
