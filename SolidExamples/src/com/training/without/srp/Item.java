package com.training.without.srp;

public class Item {

	private int itemNumber;
	private String itemName;
	private long ratePerUnit;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public long getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(long ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public Item(int itemNumber, String itemName, long ratePerUnit) {
		super();
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.ratePerUnit = ratePerUnit;
	}
	
}
