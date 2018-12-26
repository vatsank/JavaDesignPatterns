package com.training.state.example2;

public class OrderedState implements PackageState {

	@Override
	public void next(Parcel pkg) {
		pkg.setState(new DeliveredState());

	}

	@Override
	public void prev(Parcel pkg) {
		System.out.println("The package is in its root state.");

	}

	@Override
	public void printStatus() {
		System.out.println("Package ordered, not delivered to the office yet.");

	}

}
