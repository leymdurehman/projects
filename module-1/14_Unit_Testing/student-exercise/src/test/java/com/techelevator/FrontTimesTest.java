package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;


public class FrontTimesTest {

	
	private FrontTimes frontTimes;
	
	
	
	@Before
	public void setup() {
	
	frontTimes = new FrontTimes();
	}
	
	@After
	public void cleanup() {

	}
	
	@Test
	public void if_str_less_than_3() {
		
		String result = frontTimes.generateString("ab", 3);
		
		Assert.assertEquals("ababab", result);
		
		
	}
	
	
	@Test
	public void if_n_is_0() {
		
		String result = frontTimes.generateString("abc", 0);
		
		Assert.assertEquals("", result);
		
		
	}
	
	
	

	@Test
	public void if_n_is_greater_than_3() {
		
		String result = frontTimes.generateString("abc", 5);
		
		Assert.assertEquals("abcabcabcabcabc", result);
		
		
	}
	

	@Test
	public void if_str_is_null() {
		
		String result = frontTimes.generateString(null, 0);
		
		Assert.assertEquals("", result);
		
		
	}
	
	@Test
	public void if_str_is_greater_than_3() {
		
		String result = frontTimes.generateString("TechElevator", 4);
		
		Assert.assertEquals("TecTecTecTec", result);
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
