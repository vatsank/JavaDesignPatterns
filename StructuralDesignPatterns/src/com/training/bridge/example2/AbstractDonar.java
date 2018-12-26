package com.training.bridge.example2;

public abstract class AbstractDonar {

	  protected  IDonarType donar;

	public AbstractDonar(IDonarType donar) {
		super();
		this.donar = donar;
	}
	   
	  public abstract void  applyDonarType();
}
