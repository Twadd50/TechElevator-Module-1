package com.techelevator;

import java.math.BigDecimal;

public class MakeChange {
	
	int quarters	   = 0;
	int dimes		   = 0;
	int nickels 	   = 0;
	int currentBalance = 0; 

	public void changeAmount(int change) {
	
		while (change >= 25) {
			quarters = quarters + 1;
			change = change - 25;
		}
		while (change >= 10) {
			nickels = dimes + 1;
			change = change - 10;
			while (change >= 5) {
				nickels = nickels + 1;
				change = change - 5;
			}
			
			public returnChange (BigDecimal amountInCents) {
				
			}
			System.out.printf("\nHere's your change!:\n%d quarters, %d dimes, %d nickels "+ "and %d pennies!", quarters,
					dimes, nickels);
		}
	}
	public int endBalance(int currentBalance) {
		return currentBalance;
	}
	
}
