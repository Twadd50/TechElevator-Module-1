package com.techelevator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ProductImportTest {

	ProductImport sut;
	
	@Before
	public void setUp() throws Exception {
		
		sut = new ProductImport();
		
	}

	@Test
	public void testReadInventoryFileReader() {
		Map<String, List<VendingMachineItem>> testMap = new HashMap<>();
		
		assertEquals(testMap, sut.readInventory("/Users/antoinnemckinney/workspace/team2-java-module1-capstone/module1-capstone/vendingmachine.csv"));
	}

}
