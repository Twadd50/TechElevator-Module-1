package com.techelevator;

import java.math.BigDecimal;

public class GumItem extends VendingMachineItem {

	public GumItem(String name, BigDecimal cost, int itemCount) {
		super(name, cost, itemCount);
	}
	@Override
	public String Consume() {
		return null;
	}

}
