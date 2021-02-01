package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;

public class SameFirstLastTests {


	
	
	private SameFirstLast sameFirstLast;	
	
	


	@Before
	public void setup() {
		
		sameFirstLast = new SameFirstLast();	

	}

	@After
	public void cleanup() {}

	
	
	@Test
	public void array_with_diff_elements() {

		int[] nums = {1,2,3};
	
	
		boolean result = sameFirstLast.isItTheSame(nums);
	
		Assert.assertFalse(result);
	}	
	
	@Test
	public void array_is_null() {

		int[] nums = null;
	
	
		boolean result = sameFirstLast.isItTheSame(nums);
	
		Assert.assertFalse(result);
	}	
	

	
	@Test
	public void array_with_same_first_and_last() {

		int[] nums = {6,2,3,7,6};
	
	
		boolean result = sameFirstLast.isItTheSame(nums);
	
		Assert.assertTrue(result);
	}	
	
	@Test
	public void array_with_one_element() {

		int[] nums = {1};
	
	
		boolean result = sameFirstLast.isItTheSame(nums);
	
		Assert.assertTrue(result);
	}	
	
	@Test
	public void array_with_zero() {

		int[] nums = {0};
	
	
		boolean result = sameFirstLast.isItTheSame(nums);
	
		Assert.assertTrue(result);
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}