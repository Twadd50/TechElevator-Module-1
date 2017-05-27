package com.techelevator;

import java.math.BigDecimal;
import com.techelevator.VendingMachineItem;
import java.util.List;
import java.util.Map;

public class VendingMachine {

	private BigDecimal availableSpendingBalance;
	private Map<String, List<VendingMachineItem>> items;

	// info will be pulled into vending machine
	public VendingMachine(Map<String, List<VendingMachineItem>> items) {
		this.items = items;
	}

	// Available spending balance for the customer to make a purchase
	public BigDecimal feedMoney(BigDecimal dollars) {
		availableSpendingBalance.add(new BigDecimal("0.00"));
		availableSpendingBalance.add(dollars);
		return availableSpendingBalance;
	}

	// Method needed to handle the purchase of an item. This removes item from ArrayList and subtracts its cost from availableSpendingBalance.
	public List<VendingMachineItem> customerMakesPurchase(String slotName) {
		ProductImport productList = new ProductImport();
		items = productList.readInventory("/Users/antoinnemckinney/workspace/team2-java-module1-capstone/module1-capstone/vendingmachine.csv");
		availableSpendingBalance.subtract(items.get(slotName).remove(0).getCost());
		
			
		return items.get(slotName);
	}

	// Checking the list if it contains a value for the slotName provided
	public boolean IsSoldOut(String slotName) {
		
		
		return items.containsKey(slotName);
	}

	// Returns the value of the remaining balance of available funds to spend
	public BigDecimal returnChange() {
		return availableSpendingBalance;
	}

	// Print the message for the coins that will dispense to the customer
	public String changeDispenser() {
		MakeChange changeDispenser = new MakeChange();
		String dispenseMessage = changeDispenser.changeAmount(availableSpendingBalance);
		availableSpendingBalance = BigDecimal.ZERO;
		return dispenseMessage;
	}

}
