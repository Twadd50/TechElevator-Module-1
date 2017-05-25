package com.techelevator;

import java.math.BigDecimal;

public class CandyItem extends VendingMachineItem {
	
	public CandyItem(String name, BigDecimal cost, int itemCount) {
		super(name, cost, itemCount);
	
	}

	@Override
	public String Consume() {
		setItemCount(getItemCount() - 1); 
		return "Munch Munch, Yum!";
	}

	
	
}
