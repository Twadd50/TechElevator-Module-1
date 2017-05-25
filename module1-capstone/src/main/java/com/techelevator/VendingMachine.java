package com.techelevator;


import java.io.File;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
	
	
	
	DecimalFormat decimalFormat = new DecimalFormat();
	private BigDecimal 					moneyFedBalance;
	private List<String>				vendingMachineItems;
	private Map<String, List<String>>   items;
	

				

	public BigDecimal FeedMoney(BigDecimal dollars) {
		moneyFedBalance = dollars;
		return moneyFedBalance; 	
	}

	public boolean IsSoldOut(String slot) {
		return false;
		}

	
	public String Purchase(String slot, int feedMoney) {
		
		return "hi";
	}

	public BigDecimal CompleteTransaction( BigDecimal change) {
		return moneyFedBalance;
		
	}
	
	
}

