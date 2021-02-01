package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;



public class MaxEnd3Tests {

	
	
	private MaxEnd3 maxEnd3;	
	
	


	@Before
	public void setup() {
		
		maxEnd3 = new MaxEnd3();	

	}

	@After
	public void cleanup() {}

	
	
	@Test
	public void array_with_last_num_greater() {

		int[] nums = {1,2,3};
		int[] expectedResult = {3,3,3};	
	
		int[] result = maxEnd3.makeArray(nums);
	
		Assert.assertArrayEquals(expectedResult, result);
	}	
	

	@Test
	public void array_with_first_num_greater() {

		int[] nums = {8,2,3};
		int[] expectedResult = {8,8,8};	
	
		int[] result = maxEnd3.makeArray(nums);
	
		Assert.assertArrayEquals(expectedResult, result);
	}	
	

	@Test
	public void array_with_middle_num_greater() {

		int[] nums = {1,50,3};
		int[] expectedResult = {3,3,3};	
	
		int[] result = maxEnd3.makeArray(nums);
	
		Assert.assertArrayEquals(expectedResult, result);
	}	
	
		
	
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
