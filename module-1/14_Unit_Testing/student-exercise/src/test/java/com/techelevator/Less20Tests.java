package com.techelevator;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;


public class Less20Tests {

	
	
	
	private Less20 less20Test;
	
	
	
	
	
	
	@Before
	public void setup() {
	
		less20Test = new Less20();
		
	}
	
	
	@After
	public void cleanup() {
		
	}
	
	
	
	
	
	@Test
	public void multiple_of_20() {
		
		boolean result = less20Test.isLessThanMultipleOf20(40);
		
		Assert.assertFalse(result);
		
		
	}
	
	
	
	@Test
	public void multiple_of_20_is20() {
		
		boolean result = less20Test.isLessThanMultipleOf20(20);
		
		Assert.assertFalse(result);
		
		
	}
	
	@Test
	public void not_multiple_of_20() {
		
		boolean result = less20Test.isLessThanMultipleOf20(19);
		
		Assert.assertTrue(result);
		
		
	}
	@Test
	public void not_multiple_of_20_or_less_than_1_or_2() {
		
		boolean result = less20Test.isLessThanMultipleOf20(17);
		
		Assert.assertFalse(result);
		
		
	}
	
	@Test
	public void not_multiple_of_20_minus_2() {
		
		boolean result = less20Test.isLessThanMultipleOf20(18);
		
		Assert.assertTrue(result);
		
		
	}
	
	
	
	
	
	
	
	
}
