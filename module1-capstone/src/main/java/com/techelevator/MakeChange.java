package com.techelevator;

public class MakeChange {

	int numOfQuarters = 0;
	int numOfDimes = 0;
	int numOfNickels = 0;

	public MakeChange() {

	}
														//can this machine return bills before change if given bigger bills
	public void changeAmount(int amtInCents) {

		while (amtInCents >= 25) {
			numOfQuarters = amtInCents % 25;
			amtInCents -= (numOfQuarters * 25);
		}
		while (amtInCents >= 10) {
			numOfDimes = amtInCents % 10;
			amtInCents -= (numOfDimes * 10);
		}
		while (amtInCents >= 5) {
			numOfNickels = amtInCents % 5;
			amtInCents -= (numOfNickels * 5);
		}
		System.out.println("You will receive: " + numOfQuarters + " Quarters " + numOfDimes + " Dimes and "
				+ numOfNickels + " Nickels.");
	}

}
