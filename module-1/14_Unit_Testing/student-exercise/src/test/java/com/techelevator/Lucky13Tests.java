package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;


public class Lucky13Tests {

	
	
	
	
private Lucky13 lucky13Test;	
	
	


@Before
public void setup() {
	
	lucky13Test = new Lucky13();	

}

@After
public void cleanup() {}

@Test
public void array_with_1_and_3() {
	
int[] nums = {1,2,3};
	
	
	boolean result = lucky13Test.getLucky(nums);
	
	Assert.assertFalse(result);
	
	
}

@Test
public void array_with_3() {
	
int[] nums = {2,3,4};
	
	
	boolean result = lucky13Test.getLucky(nums);
	
	Assert.assertFalse(result);
	
	
}


@Test
public void array_with_1() {
	
int[] nums = {2,1,4};
	
	
	boolean result = lucky13Test.getLucky(nums);
	
	Assert.assertFalse(result);
	
	
}


@Test
public void array_with_no13() {
	
int[] nums = {2,4,6};
	
	
	boolean result = lucky13Test.getLucky(nums);
	
	Assert.assertTrue(result);
	
	
}



@Test
public void array_null() {
	
int[] nums = null;
	
	
	boolean result = lucky13Test.getLucky(nums);
	
	Assert.assertTrue(result);
	
	
}


	
	
}
