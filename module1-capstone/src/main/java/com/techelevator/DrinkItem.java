package com.techelevator;

import java.math.BigDecimal;

public class DrinkItem extends VendingMachineItem {

	public DrinkItem(String name, BigDecimal cost, int itemCount) {
		super(name, cost, itemCount);
	}

	@Override
	public String Consume() {
		return null;
	}

}
