package com.techelevator;

import java.math.BigDecimal;

public class MakeChange {

	BigDecimal numOfQuarters = new BigDecimal("0");
	BigDecimal numOfDimes = new BigDecimal("0");
	BigDecimal numOfNickels = new BigDecimal("0");

	BigDecimal quarter = new BigDecimal("0.25");
	BigDecimal dime = new BigDecimal("0.10");
	BigDecimal nickel = new BigDecimal("0.05");

	// can this machine return bills before change if given bigger bills
	public String changeAmount(BigDecimal amtToReturn) {
		// Calculate the number of quarters to return
		// updates amtToReturn
		while (amtToReturn.compareTo(quarter) >= 0) {
			numOfQuarters = amtToReturn.divideToIntegralValue(quarter);
			amtToReturn = amtToReturn.subtract(numOfQuarters.multiply(quarter));
		}
		// Calculate the number of dimes to return
		// updates amtToReturn
		while (amtToReturn.compareTo(dime) >= 0) {
			numOfDimes = amtToReturn.divideToIntegralValue(dime);
			amtToReturn = amtToReturn.subtract(numOfDimes.multiply(dime));
		}
		// Calculate the number of nickels to return
		// updates amtToReturn
		while (amtToReturn.compareTo(nickel) >= 0) {
			numOfNickels = amtToReturn.divideToIntegralValue(nickel);
			amtToReturn = amtToReturn.subtract(numOfNickels.multiply(nickel));
		}

		// Message that will print to customer
		return "You will receive: " + numOfQuarters + " Quarters " + numOfDimes + " Dimes and " + numOfNickels
				+ " Nickels.";
	}

}
