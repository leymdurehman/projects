package com.techelevator;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.*;


public class StringBitsTests {



	
	private StringBits stringBits;	
	
	


	@Before
	public void setup() {
		
		stringBits = new StringBits();	

	}

	@After
	public void cleanup() {}

	
	
	@Test
	public void get_bits() {
	
		String str = "Hello";
		String expected = "Hlo";
	
		String result = stringBits.getBits(str);
	
		
		Assert.assertEquals(expected, result);
	
	}		
	
	@Test
	public void string_null() {
	
		String str = null;
		String expected = "";
	
		String result = stringBits.getBits(str);
	
		
		Assert.assertEquals(expected, result);
	
	}	
	
	@Test
	public void get_bits_for_jumbled_word() {
	
		String str = "Heeololeo";
		String expected = "Hello";
	
		String result = stringBits.getBits(str);
	
		
		Assert.assertEquals(expected, result);
	
	}	
	
	@Test
	public void get_bits_for_two_letter() {
	
		String str = "Hi";
		String expected = "H";
	
		String result = stringBits.getBits(str);
	
		
		Assert.assertEquals(expected, result);
	
	}	
	
	@Test
	public void get_bits_for_one_letter() {
	
		String str = "H";
		String expected = "H";
	
		String result = stringBits.getBits(str);
	
		
		Assert.assertEquals(expected, result);
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
