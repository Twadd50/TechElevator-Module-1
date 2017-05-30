package com.techelevator;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.techelevator.view.Menu;
import com.techelevator.ProductImport;

//import com.techelevator.VendingMachine;
//import com.techelevator.TransactionLog;
public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_VIEW_ITEMS = "View Items";
	private static final String MAIN_MENU_OPTION_EXIT_PROGRAM = "Exit Program";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_VIEW_ITEMS, MAIN_MENU_OPTION_EXIT_PROGRAM };

	private static final String VIEW_ITEMS_MENU_OPTION_FEED_MONEY = "Feed Me & I'll Feed You!";
	private static final String VIEW_ITEMS_MENU_OPTION_MAKE_A_SELECTION = "Whatchu need?";
	private static final String VIEW_ITEMS_MENU_OPTION_CLOSE_TRANSACTION = "GOT IT NOW GO!";
	private static final String VIEW_ITEMS_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS2 = { VIEW_ITEMS_MENU_OPTION_FEED_MONEY,
			VIEW_ITEMS_MENU_OPTION_EXIT };
	private static final String[] MAIN_MENU_OPTIONS3 = { VIEW_ITEMS_MENU_OPTION_MAKE_A_SELECTION,
			VIEW_ITEMS_MENU_OPTION_EXIT };
	private static final String[] MAIN_MENU_OPTIONS4 = { VIEW_ITEMS_MENU_OPTION_CLOSE_TRANSACTION,
			VIEW_ITEMS_MENU_OPTION_EXIT };

	private static final String ONE_DOLLAR = "$1.00";
	private static final String TWO_DOLLAR = "$2.00";
	private static final String FIVE_DOLLAR = "$5.00";
	private static final String TEN_DOLLAR = "$10.00";
	private static final String[] MAIN_MENU_OPTIONS5 = { ONE_DOLLAR, TWO_DOLLAR, FIVE_DOLLAR, TEN_DOLLAR,
			VIEW_ITEMS_MENU_OPTION_EXIT };

	private Menu menu;
	private Map<String, List<VendingMachineItem>> listOfProducts;
	private VendingMachine vm;

	// if given $5 or $10 can machine return bills then change?
	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
		ProductImport pI = new ProductImport();
		listOfProducts = pI.readInventory(
				"/Users/antoinnemckinney/workspace/team2-java-module1-capstone/module1-capstone/vendingmachine.csv");
		vm = new VendingMachine(listOfProducts);
	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_VIEW_ITEMS)) {
				//Section Heading
				System.out.println("*************************");
				System.out.println("CHECH OUT OUR OPTIONS");
				System.out.println("*************************");
				
				/*
				 * This print out the list of item. Would like to sort them alphabetically
				 */
				for (String key : listOfProducts.keySet()) {
					List<VendingMachineItem> itemsList = listOfProducts.get(key);
					if (itemsList.isEmpty()) {
						System.out.println(listOfProducts.get(key) + " Sorry, We Just Ran Out!");
					} else {

						VendingMachineItem availableItem = itemsList.get(0);
						System.out.println(availableItem.getSlotName() + " | " + availableItem.getName() + " | "
								+ availableItem.getCost());
					}
				}//closes the forLoop

			} else if (choice.equals(MAIN_MENU_OPTION_EXIT_PROGRAM)) {
				break;
			}
			while (true) {
				String choice2 = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS2);
				/*
				 * At this point we are guiding the customer through purchasing process
				 */
				
				
				if (choice2.equals(VIEW_ITEMS_MENU_OPTION_FEED_MONEY)) {
					while (true) {
						String choice5 = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS5);
						
						/*
						 * The customer availableSpendingBalance is being calculated and stored on the VendingMachine.java file.
						 * With the balance on the vending machine set to "0.00", the customer is able to feed money to the
						 * vending machine to prepare for a purchase. The customer can only add $1, $2, $5, $10.
						 */
						
						if (choice5.equals(ONE_DOLLAR)) {
							BigDecimal customerFeed = new BigDecimal("1.00");
							//add $1 to the current balance
							vm.feedMoney(customerFeed);
						} else if (choice5.equals(TWO_DOLLAR)) {
							BigDecimal customerFeed = new BigDecimal("2.00");
							//add $2 to the current balance
							vm.feedMoney(customerFeed);
						} else if (choice5.equals(FIVE_DOLLAR)) {
							BigDecimal customerFeed = new BigDecimal("5.00");
							//add $5 to the current balance
							vm.feedMoney(customerFeed);
						} else if (choice5.equals(TEN_DOLLAR)) {
							BigDecimal customerFeed = new BigDecimal("10.00");
							//add $10 to the current balance
							vm.feedMoney(customerFeed);
						} else if (choice5.equals(VIEW_ITEMS_MENU_OPTION_EXIT)) {
							break;
						}
						
						System.out.println("\nYour Updated Spending Balance: $"+ vm.getAvailableSpendingBalance());
					}//closes whileLoop for customer money feed

				}//close if-statement for Feed Money
				while (true) {
					String choice3 = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS3);

					if (choice3.equals(VIEW_ITEMS_MENU_OPTION_MAKE_A_SELECTION)) {
						// UI for making purchase verify slot name
						// vm.IsSoldOut(slotName)
						// vm.customerMakesPurchase(slotName);
						
						
						//vm.customerMakesPurchase(slotName);
						
					} else if (choice3.equals(MAIN_MENU_OPTION_EXIT_PROGRAM)) {
						break;
					}
					while (true) {
						String choice4 = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS4);

						if (choice4.equals(VIEW_ITEMS_MENU_OPTION_CLOSE_TRANSACTION)) {
							System.out.println("Bye");
						} else if (choice4.equals(MAIN_MENU_OPTION_EXIT_PROGRAM)) {
							break;
						}

					}//Closes the whileLoop Menu 4
					
				}//Closes the whileLoop Menu 3
				

			}//Closes the whileLoop Menu 2
		}//Closes the whileLoop Menu 1
	}

	// This is the command line program
	public static void main(String[] args) {

		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
