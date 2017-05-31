package com.techelevator;

import java.math.BigDecimal;
import com.techelevator.VendingMachineItem;
import java.util.List;
import java.util.Map;

public class VendingMachine {

	private BigDecimal availableSpendingBalance = new BigDecimal("0.00");
	private Map<String, List<VendingMachineItem>> items;

	// info will be pulled into vending machine
	public VendingMachine(Map<String, List<VendingMachineItem>> items) {
		this.items = items;
	}

	// Available spending balance for the customer to make a purchase
	public BigDecimal feedMoney(BigDecimal dollars) {
		availableSpendingBalance = availableSpendingBalance.add(dollars);
		return availableSpendingBalance;
	}

	// Method needed to handle the purchase of an item. This removes item from ArrayList and subtracts its cost from availableSpendingBalance.
	public VendingMachineItem customerMakesPurchase(String slotName) {
		VendingMachineItem item = null;
		if(items.containsKey(slotName)){ // If the slot exists
			if( ! items.get(slotName).isEmpty()) { // If the slot has items
				if(availableSpendingBalance.compareTo(items.get(slotName).get(0).getCost()) >= 0){ // If they can afford it
					item = items.get(slotName).remove(0);
					availableSpendingBalance = availableSpendingBalance.subtract(item.getCost());
				} else {
					//throw new NotEnoughFundsException();
				}
			} else {
				
			}
		}

		
		return item;
	}

	// Checking the list if it contains a value for the slotName provided
	public boolean IsSoldOut(String slotName) {
		
		
		return items.containsKey(slotName);
	}

	// Print the message for the coins that will dispense to the customer
	public String changeDispenser() {
		MakeChange changeDispenser = new MakeChange();
		String dispenseMessage = changeDispenser.changeAmount(availableSpendingBalance);
		availableSpendingBalance = BigDecimal.ZERO;
		return dispenseMessage;
	}

	public BigDecimal getAvailableSpendingBalance() {
		return availableSpendingBalance;
	}

	public Map<String, List<VendingMachineItem>> getItems() {
		return items;
	}

}
