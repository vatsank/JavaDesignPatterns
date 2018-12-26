package com.training.state.example2;

public class Parcel {

	private PackageState state = new OrderedState();

	public PackageState getState() {
		return state;
	}

	public void setState(PackageState state) {
		this.state = state;
	}

	public Parcel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void previousState() {
		state.prev(this);
	}

	public void nextState() {
		state.next(this);
	}
	
	public void printState() {
		state.printStatus();
	}
}
