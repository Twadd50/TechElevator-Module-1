package com.techelevator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class VendingMachine {

	private BigDecimal availableSpendingBalance;
	private Map<String, List<VendingMachineItem>> items;

	// Constructor
	public VendingMachine(Map<String, List<VendingMachineItem>> items) {
		this.items = items;
	}

	// Available spending balance for the customer to make a purchase
	public BigDecimal feedMoney(BigDecimal dollars) {
		availableSpendingBalance.add(dollars);
		return availableSpendingBalance;
	}

	// Method needed to handle the purchase of an item
	public List<VendingMachineItem> customerMakesPurchase(String slotName) {
		List<VendingMachineItem> purchaseItem = items.get(slotName);
		return purchaseItem;
	}

	// Checking the list if it contains a value for the slotName provided
	public boolean IsSoldOut(String slotName) {
		return items.containsKey(slotName);
	}

	// Returns the remaining balance of available funds to spend
	public BigDecimal returnChange() {
		BigDecimal customerChange = availableSpendingBalance;
		return customerChange;

	}

}
