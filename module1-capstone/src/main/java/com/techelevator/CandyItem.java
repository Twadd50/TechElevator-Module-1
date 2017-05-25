package com.techelevator;

import java.math.BigDecimal;

public class CandyItem extends VendingMachineItem {
	
	public CandyItem(String name, BigDecimal cost) {
		super(name, cost);
	
	}

	@Override
	public String Consume() {
		
		return "Munch Munch, Yum!";
	}

	
	
}
