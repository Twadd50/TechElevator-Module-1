package com.techelevator;

import java.math.BigDecimal;

public class ChipItem extends VendingMachineItem {
	
	public ChipItem(String name, BigDecimal cost, int itemCount) {
		super(name, cost, itemCount);
	}
	
	@Override
	public String Consume() {
		return null;
	}

}
