package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;

public class WordCountTests {

	private WordCount wordCount;
	
	
	@Before
	public void setup() {
		
		wordCount = new WordCount();
	}
	
	@After
	public void cleanup() {
		
	}
	
	@Test
	public void get_count_for_black_sheep() {
		
		// Arrange - create and populate the map to use as input
				Map<String, Integer> expected = new HashMap<String, Integer>();
				expected.put("ba", 2);
				expected.put("black", 1);
				expected.put("sheep", 1);
				
				String[] sheep = {"ba", "ba", "black", "sheep"};
				
				// Act
				Map<String, Integer> result = wordCount.getCount(sheep);
				
				// Assert
			
		Assert.assertEquals(expected, result);
				
	}
	
			

	@Test
	public void get_count_for_null_string() {
		
		// Arrange - create and populate the map to use as input
				Map<String, Integer> expected = new HashMap<String, Integer>();
				
				
				String[] sheep = null;
				
				// Act
				Map<String, Integer> result = wordCount.getCount(sheep);
				
				// Assert
			
		Assert.assertEquals(expected, result);
				
	}
	
	
	
	
	
	
	
}
