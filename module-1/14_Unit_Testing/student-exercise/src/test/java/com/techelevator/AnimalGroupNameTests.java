package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;
public class AnimalGroupNameTests {

	private AnimalGroupName animalGroupName;
	
	
	
	@Before
	public void setup() {
		
		animalGroupName = new AnimalGroupName();
		
	}
	
	@After
	public void cleanup() {
		
		
		
	}
	
	@Test
	public void animal_name_not_found() {
		 
		
	String herdName = animalGroupName.getHerd("");
	Assert.assertEquals("unknown", herdName);	
		
	}

	@Test
	public void animal_name_null() {
		 
		
	String herdName = animalGroupName.getHerd(null);
	Assert.assertEquals("unknown", herdName);	
		
	}
	
	@Test
	public void animal_name_not_in_group() {
		 
		
	String herdName = animalGroupName.getHerd("walrus");
	Assert.assertEquals("unknown", herdName);	
		
	}
	
	@Test
	public void animal_name_in_group() {
		 
		
	String herdName = animalGroupName.getHerd("Flamingo");
	Assert.assertEquals("Pat", herdName);	
		
	}
	
	
	
	
}
