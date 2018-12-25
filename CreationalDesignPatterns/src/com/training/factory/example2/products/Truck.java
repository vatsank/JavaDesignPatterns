package com.training.factory.example2.products;

/**
 *  Representation of Concrete Product;
 * @author Srivatsan
 *
 */
public class Truck implements Transport {

	private double ratePerKm;
	private double tax;
	private double amount;
	
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(double ratePerKm, double tax) {
		super();
		this.ratePerKm = ratePerKm;
		this.tax = tax;
	}

	public double getRatePerKm() {
		return ratePerKm;
	}

	public void setRatePerKm(double ratePerKm) {
		this.ratePerKm = ratePerKm;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public double estimate(double distance) {
		
		double baseAmount = distance * ratePerKm;
		double netAmount  =baseAmount +  baseAmount * tax;
			return netAmount;
	}

}
