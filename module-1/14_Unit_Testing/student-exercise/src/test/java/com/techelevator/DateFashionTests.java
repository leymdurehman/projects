package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;





public class DateFashionTests {

	
	private DateFashion dateFashion;
	
	
	
	@Before  
	public void setup() {
		dateFashion = new DateFashion();	
	}
	
	@After
	public void cleanup() {
	
	}
	
	@Test
	public void you_and_date_style_8_and_2() {
		
	int result = dateFashion.getATable(8, 2);
	
	Assert.assertEquals(0, result);
		
	}
	
	
	@Test
	public void you_8_date_2 () {
		
	int result = dateFashion.getATable(8, 4);
	
	Assert.assertEquals(2, result);
		
	}
	

	@Test
	public void you_and_date_not_2_or_8 () {
		
	int result = dateFashion.getATable(3, 7);
	
	Assert.assertEquals(1, result);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
