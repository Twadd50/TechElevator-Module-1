package com.techelevator;

import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class productImport {
	
	//Import data from csv file to put into Map
	File importFile = new File("/module1-capstone/vendingmachine.csv");
	Scanner importItems = new Scanner(importFile)
		while(importFile.hasNextLine()){
			String readLine = importItems.nextLine();
			String[] productInfo = readLine.split("\\|");
			String slotName = productInfo[0];
			String productName = productInfo[1];
			BigDecimal productCost = (BigDecimal) decimalFormat.parse(productInfo[2]);
		}
	
	//Map that will store the slotName as Key and productName as Value
	Map<String, VendingMachineItem> itemMap = new HashMap<>();
		for(VendingMachineItem item : vendingMachineItems){
			itemMap.put(slotName, new VendingMachineItem(productName, productCost, 5); 
		}
	
	
	
}
