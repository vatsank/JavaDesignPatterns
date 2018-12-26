package com.training.state.example2;

public class ReceivedState implements PackageState {

	@Override
	public void next(Parcel pkg) {
		System.out.println("This package is already received by a client.");

	}

	@Override
	public void prev(Parcel pkg) {
		pkg.setState(new DeliveredState());

	}

	@Override
	public void printStatus() {
         System.out.println("package was received by client");
	}

}
