package com.techelevator;

	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import org.junit.*;
	
public class NonStartTests {

	
	
	
	



		
		
		private NonStart nonStart;	
		
		


		@Before
		public void setup() {
			
			nonStart = new NonStart();	

		}

		@After
		public void cleanup() {}

		
		
		@Test
		public void two_strings_concatenation() {
		
			String string1 = "Hello";
			String string2 = "There";
		
			String result = nonStart.getPartialString(string1, string2);
		
			Assert.assertEquals("ellohere", result);
		}		
		
		

		@Test
		public void string1_is_empty() {
		
			String string1 = "";
			String string2 = "There";
		
			String result = nonStart.getPartialString(string1, string2);
		
			Assert.assertEquals("here", result);
		}		
		
		@Test
		public void string2_is_empty() {
		
			String string1 = "Hello";
			String string2 = "";
		
			String result = nonStart.getPartialString(string1, string2);
		
			Assert.assertEquals("ello", result);
		}		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	

