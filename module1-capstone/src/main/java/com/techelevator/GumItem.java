package com.techelevator;

import java.math.BigDecimal;

public class GumItem extends VendingMachineItem {

	public GumItem(String slotName, String name, BigDecimal cost) {
		super(slotName, name, cost);
	}

	@Override
	public String Consume() {
		return "Chew Chew, Yum!";
	}
}