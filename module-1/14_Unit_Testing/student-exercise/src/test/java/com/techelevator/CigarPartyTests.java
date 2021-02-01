package com.techelevator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;
public class CigarPartyTests {

	private CigarParty cigarParty;
	
	@Before
	public void setup() {
		
		cigarParty = new CigarParty();
		
	}
	
	@After
	public void cleanup() {
		
	}
	
	@Test
	public void is_weekend() {
		
		
		boolean result = cigarParty.haveParty(80, true);
		
		
		
		Assert.assertTrue(result);		
	}
	
	@Test
	public void is_not_weekend_over_max_cigars() {
		
		
		boolean result = cigarParty.haveParty(80, false);
		
		
		
		Assert.assertFalse(result);		
	}
	
	@Test
	public void is_not_weekend_not_over_max_cigars() {
		
		
		boolean result = cigarParty.haveParty(50, false);
		
		
		
		Assert.assertTrue(result);		
	}
	
	@Test
	public void is_not_weekend_under_min_cigars() {
		
		
		boolean result = cigarParty.haveParty(30, false);
		
		
		
		Assert.assertFalse(result);		
	}
	
	@Test
	public void is_not_weekend_with_max_cigars() {
		
		
		boolean result = cigarParty.haveParty(60, false);
		
		
		
		Assert.assertTrue(result);		
	}
	
	
	
	@Test
	public void is_not_weekend_with_min_cigars() {
		
		
		boolean result = cigarParty.haveParty(40, false);
		
		
		
		Assert.assertTrue(result);		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
