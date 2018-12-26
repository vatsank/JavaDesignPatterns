package com.training.state.example2;

public interface PackageState {

	void next(Parcel pkg);
	void prev(Parcel pkg);
	void printStatus();

}
