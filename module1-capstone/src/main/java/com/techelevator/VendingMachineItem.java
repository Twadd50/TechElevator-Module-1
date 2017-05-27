package com.techelevator;

import java.math.BigDecimal;

public abstract class VendingMachineItem {

	private String slotName;
	private String name;
	private BigDecimal cost;

	// name & cost are being set here
	public VendingMachineItem(String slotName, String name, BigDecimal cost) {
		this.slotName = slotName;
		this.name = name;
		this.cost = cost;
	}

	abstract public String Consume();

	public String getName() {
		return name;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public String getSlotName() {
		return slotName;
	}

}
