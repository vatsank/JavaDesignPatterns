package com.training.state;

public class MyStateClient {

	
	public static void main(String[] args) {
		
		MyStateContext ctx =new MyStateContext();
		
		ctx.changeState(new TiredState());
		
		System.out.println(ctx.saySomething());
		
		
		ctx.changeState(new HappyState());
		
		System.out.println(ctx.saySomething());
		
   ctx.changeState(new TiredState());
		
		System.out.println(ctx.saySomething());
		
	}
}
