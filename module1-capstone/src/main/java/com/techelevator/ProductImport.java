package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductImport {
	// "module1-capstone/vendingmachine.csv"

	public Map<String, List<VendingMachineItem>> readInventory(String filePath) {
		Map<String, List<VendingMachineItem>> productMap = new TreeMap<>();

		/*
		 * Import data from a CSV file into a Map by using a Scanner to read
		 * each line of the imported file. (Line 25-28) The data on each line is
		 * separated by the pipe delimiter ("|"). (Line 29) Once separate the
		 * data is stored in an array and assigned to individual variables.
		 * (Line 30-32) (i.e. String[] productInfo = {slotName, productName,
		 * productCost}) The variable assignments are explicit by assigning the
		 * array index to the appropriate variable name and data type.
		 */

		/*
		 * Because this is in a while() loop, there will only be one array
		 * created and new data will be entered in each index of the array for a
		 * total of 16 iterations or until the document has no more lines to
		 * extract data.
		 */

		File importFile = new File(filePath);
		try (Scanner importScanner = new Scanner(importFile)) {
			while (importScanner.hasNextLine()) {
				String readLine = importScanner.nextLine();
				String[] productInfo = readLine.split("\\|");
				String slotName = productInfo[0];
				String productName = productInfo[1];
				BigDecimal productCost = new BigDecimal(productInfo[2]);

				/*
				 * Organizes the products by adding each product to an
				 * ArrayList, which is considered our inventory, and associates
				 * the slotName to their corresponding item type (i.e A1-4:
				 * ChipItem, B1-4: CandyItem, C1-4: DrinkItem, D1-4). A forLoop
				 * is used to add five iterations of each product in their
				 * corresponding vending machine slots. (i.e. slot A1 will have
				 * five bags of Potato Crisps) (Lines 43, 48, 53, 58) In
				 * addition, as we add the item to the list we are setting the
				 * name and cost of the product for each new VendingMachineItem.
				 * (Lines 46, 51, 56, 61)
				 */
				List<VendingMachineItem> items = new ArrayList<>();
				if (slotName.startsWith("A")) {
					for (int i = 0; i < 5; i++) {
						items.add(new ChipItem(slotName, productName, productCost));
					}
				} else if (slotName.startsWith("B")) {
					for (int i = 0; i < 5; i++) {
						items.add(new CandyItem(slotName, productName, productCost));
					}
				} else if (slotName.startsWith("C")) {
					for (int i = 0; i < 5; i++) {
						items.add(new DrinkItem(slotName, productName, productCost));
					}
				} else if (slotName.startsWith("D")) {
					for (int i = 0; i < 5; i++) {
						items.add(new GumItem(slotName, productName, productCost));
					}
				}
				productMap.put(slotName, items);

			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		return productMap;
	}

}
