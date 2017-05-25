package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductImport {
	// "module1-capstone/vendingmachine.csv"
	public Map<String, List<VendingMachineItem>> readInventory(String filePath) {
		Map<String, List<VendingMachineItem>> productMap = new HashMap<>();

		// Import data from csv file to put into Map
		File importFile = new File(filePath);
		try (Scanner importScanner = new Scanner(importFile)) {
			while (importScanner.hasNextLine()) {
				String readLine = importScanner.nextLine();
				String[] productInfo = readLine.split("\\|");
				String slotName = productInfo[0];
				String productName = productInfo[1];
				BigDecimal productCost = new BigDecimal(productInfo[2]);
				
				List<VendingMachineItem> items = new ArrayList<>();
				if(slotName.startsWith("A")){
					for(int i = 0; i <5; i++){
						items.add(new ChipItem(productName, productCost));
					}
					productMap.put(slotName, items);
				} else if(slotName.startsWith("B")){
					for(int i = 0; i <5; i++){
						items.add(new CandyItem(productName, productCost));
					}
					productMap.put(slotName, items);
				}else if(slotName.startsWith("C")){
					for(int i = 0; i <5; i++){
						items.add(new DrinkItem(productName, productCost));
					}
					productMap.put(slotName, items);
				}else if(slotName.startsWith("D")){
					for(int i = 0; i <5; i++){
						items.add(new GumItem(productName, productCost));
					}
					productMap.put(slotName, items);
				}
				
			}
			
		}catch (FileNotFoundException e){
			e.getMessage();
		}

		return productMap;
	}

}
