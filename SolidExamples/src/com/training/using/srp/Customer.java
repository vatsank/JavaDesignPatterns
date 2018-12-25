package com.training.using.srp;

import java.util.List;

import com.training.without.srp.Item;

public class Customer {

	private String name;
	private int age;
	private long bill;
	private List<Item> listsOfItems;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getBill() {
		return bill;
	}
	public void setBill(long bill) {
		this.bill = bill;
	}
	public List<Item> getListsOfItems() {
		return listsOfItems;
	}
	public void setListsOfItems(List<Item> listsOfItems) {
		this.listsOfItems = listsOfItems;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, int age, long bill, List<Item> listsOfItems) {
		super();
		this.name = name;
		this.age = age;
		this.bill = bill;
		this.listsOfItems = listsOfItems;
	}

	
}
