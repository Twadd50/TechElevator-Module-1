package com.techelevator;

import java.math.BigDecimal;

public class ChipItem extends VendingMachineItem {

	public ChipItem(String slotName, String name, BigDecimal cost) {
		super(slotName, name, cost);
	}

	@Override
	public String Consume() {
		return "Crunch Crunch, Yum!";
	}
}