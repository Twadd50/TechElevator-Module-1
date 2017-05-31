package com.techelevator;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class MakeChangeTest {

	MakeChange sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new MakeChange();
		
	}

	@Test
	public void testChangeAmount() {
		assertEquals("You will receive: 4 Quarters 0 Dimes and 0 Nickels.", sut.changeAmount(new BigDecimal("1.00")));
	}
	
	@Test
	public void testChangeAmountDollarFifteen() {
		assertEquals("You will receive: 4 Quarters 1 Dimes and 1 Nickels.", sut.changeAmount(new BigDecimal("1.15")));
	}

}
