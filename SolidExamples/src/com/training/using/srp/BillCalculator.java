package com.training.using.srp;

import java.util.List;

import com.training.without.srp.Item;

public class BillCalculator {

	public long calculateBill(Customer customer,long tax)
	{
		long bill=0;
		List<Item> listsOfItems=customer.getListsOfItems();
		for (Item item:listsOfItems) {
			bill+=item.getRatePerUnit();
		}
		bill+=tax;
		customer.setBill(bill);
		return bill;
	}

}
