package com.techelevator;

import java.math.BigDecimal;

public class GumItem extends VendingMachineItem {

	public GumItem(String name, BigDecimal cost) {
		super(name, cost);
	}
	@Override
	public String Consume() {
		
		return "Chew Chew, Yum!";
	}

}
