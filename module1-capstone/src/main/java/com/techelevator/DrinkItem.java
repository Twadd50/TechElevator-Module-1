package com.techelevator;

import java.math.BigDecimal;

public class DrinkItem extends VendingMachineItem {

	public DrinkItem(String slotName, String name, BigDecimal cost) {
		super(slotName,name, cost);
	}

	@Override
	public String Consume() {
		return "Glug Glug, Yum!";
	}
}