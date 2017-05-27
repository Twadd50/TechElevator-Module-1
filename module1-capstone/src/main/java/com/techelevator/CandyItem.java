package com.techelevator;

import java.math.BigDecimal;

public class CandyItem extends VendingMachineItem {

	public CandyItem(String slotName, String name, BigDecimal cost) {
		super(slotName, name, cost);
	}

	@Override
	public String Consume() {
		return "Munch Munch, Yum!";
	}
}