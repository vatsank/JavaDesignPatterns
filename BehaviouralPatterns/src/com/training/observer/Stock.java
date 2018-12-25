package com.training.observer;

import java.util.Observable;

public class Stock extends Observable {

	private int stock_code;
	private String stock_name;
	private double quantity;
	public Stock() {
		super();
		
	}
	public Stock(int stock_code, String stock_name, double quantity) {
		super();
		this.stock_code = stock_code;
		this.stock_name = stock_name;
		this.quantity = quantity;
	}
	public int getStock_code() {
		return stock_code;
	}
	public void setStock_code(int stock_code) {
		this.stock_code = stock_code;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		
		
		this.quantity = quantity;
		
		setChanged();
		notifyObservers(quantity);
		
	}
	
	
}
