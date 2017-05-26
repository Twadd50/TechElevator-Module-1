package com.techelevator;

import java.util.List;
import java.util.Map;

import com.techelevator.view.Menu;
import com.techelevator.ProductImport;
//import com.techelevator.VendingMachine;
//import com.techelevator.TransactionLog;
public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_VIEW_ITEMS 	   =  "View Items";
	private static final String MAIN_MENU_OPTION_EXIT_PROGRAM      =  "Exit Program";
	private static final String[] MAIN_MENU_OPTIONS			       = { MAIN_MENU_OPTION_VIEW_ITEMS,
																	   MAIN_MENU_OPTION_EXIT_PROGRAM };
	
	private static final String ITEMS_ITEMS_MENU_OPTION_MAKE_A_PURCHASE = "Make a purchase";
	private static final String VIEW_ITEMS_MENU_OPTION_EXIT  		    = "Exit";
	private static final String[] MAIN_MENU_OPTIONS2			       = { MAIN_MENU_OPTION_VIEW_ITEMS,
			   MAIN_MENU_OPTION_EXIT_PROGRAM };
	private Menu menu;
	
	private Map<String, List<VendingMachineItem>> listOfProducts = com.techelevator.ProductImport.productMap;

			// if given $5 or $10 can machine return bills then change?
	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}
	
	public void run() {
		while(true) {
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			
			if(choice.equals(MAIN_MENU_OPTION_VIEW_ITEMS)) {	
				System.out.println("Whatchu need?");
				//This should print list of items
				for(String key : listOfProducts.keySet()){
					List<VendingMachineItem> itemsList = listOfProducts.get(key);
						if(itemsList.isEmpty()){
							System.out.println(listOfProducts.get(key) + " Sorry, We Just Ran Out!");
						}else {
							VendingMachineItem availableItem = itemsList.get(0);
								System.out.println(availableItem.getName() +" " +
								availableItem.getCost());
						}
				}
				while(true) {
					String choice2 = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS2);
					//This should guide customer through purchasing process
					if(choice2.equals(ITEMS_ITEMS_MENU_OPTION_MAKE_A_PURCHASE)) {	
						System.out.println("Feed Me & I'll Feed You!");
						System.out.println("Whatchu need?");
						System.out.println("GOT IT NOW GO!");
						
					} else if(choice2.equals(MAIN_MENU_OPTION_EXIT_PROGRAM)) {
						break;
						}
					}
				

			} else if(choice.equals(MAIN_MENU_OPTION_EXIT_PROGRAM)) {
				break;
				}
			}
		}
	
	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}












