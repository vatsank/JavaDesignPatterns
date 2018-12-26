package com.training.state.example2;

public class DeliveredState implements PackageState {

	@Override
	public void next(Parcel pkg) {

		pkg.setState(new ReceivedState());
	}

	@Override
	public void prev(Parcel pkg) {
	pkg.setState(new OrderedState());

	}

	@Override
	public void printStatus() {
		System.out.println("Package delivered to post office, not received yet.");

	}

}
