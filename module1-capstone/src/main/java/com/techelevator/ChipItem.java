package com.techelevator;

import java.math.BigDecimal;

public class ChipItem extends VendingMachineItem {

	public ChipItem(String name, BigDecimal cost) {
		super(name, cost);
	}

	@Override
	public String Consume() {
		return "Crunch Crunch, Yum!";
	}
}