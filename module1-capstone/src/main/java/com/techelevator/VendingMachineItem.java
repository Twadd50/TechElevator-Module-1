package com.techelevator;

import java.math.BigDecimal;

public abstract class VendingMachineItem {

		private String 	   name;
		private BigDecimal cost;
		private int        itemCount = 0;
	
	public VendingMachineItem(String name, BigDecimal cost, int itemCount) {
		this.name 	   = name;
		this.cost 	   = cost;
		this.itemCount = itemCount;
	}
	abstract public String Consume();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	
	
}
