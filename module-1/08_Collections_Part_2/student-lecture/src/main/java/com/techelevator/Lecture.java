package com.techelevator;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lecture {

	public static void main(String[] args) {


		System.out.println();		
		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();

		/* DECLARE AND INSTANTIATE A SET */

		//setting order
		
		//Set<Integer> setOfNumbers = new t<Integer>();
		
		
		
		/* ADD ITEMS TO THE SET */

		
		/* LOOP OVER A SET */


		
		/*USE CASE:  USE A SET TO REMOVE DUPLICATES AND ORDER THE ARRAY */
		String[] instructorWorkLog = {"Rachelle", "John", "Matt", "Kevin", "Rachelle", "Steve", "John", "Rachelle" };
		
		Set<String> workSet = new TreeSet<String>();
		
		for (String contributor : instructorWorkLog) {
			
			workSet.add(contributor);
			
		}

		for (String name: workSet) {
			
			System.out.println(name);
			
		}
		
		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();
		
		/* DECLARING AND INSTANTIATING A MAP */

		// Map<KeyDataT
		Map<String, String> animalNoises = new HashMap<String, String>();
		
		
		
		
		
		/* ADDING ITEMS TO A MAP */

		
		
		animalNoises.put("Cow", "Moo");
		animalNoises.put("Chicken", "Cluck");
		// Keys myst be unique, but the values do not
		animalNoises.put("Lion", "Roar");
		animalNoises.put("Duck", "Roar");
		
		/* UPDATING AN ITEM IN A MAP */
				
		// use put with an existing key
			animalNoises.put("Duck", "Quack");

				
				
		/* RETRIEVING AN ITEM FROM A MAP */
			//retrieve an item using get(key)
			
			String catNoise = animalNoises.get("Cat");
				//System.out
			
			// if key doesnt exist, then get() returns null
			
			
		/* REMOVING AN ITEM FROM A MAP */
				// remove a key value pair using.remove
		
				
				String lionNoise = animalNoises.remove("Lion");
				// now (null, "Roar"
				
				
		// If the key does not exists, the null returned

		
		
		/* CHECK IF AN ITEM EXISTS */
		// containsKey(key) returns TRUE if the KEY exists in the Map

				boolean catExists = animalNoises.containsKey("Cat");
				
				boolean wolfExists = animalNoises.containsKey("Wolf");
				
				
		// containsValue(value) returns TRUE if the VALUE exists in the Map

				boolean mewoExists = animalNoises.containsValue("Meow");
				boolean baaExists = animalNoises.containsValue("Baa");
				
				
				
				
				
				
		System.out.println();
		
		
		/* LOOPING OVER A MAP */
		// Loop through a map by looping through the Keys
		// Then using the keys to get the value
				
				
				for (String key : animalNoises.keySet()) {
					System.out.println("Key:" + key);
					System.out.println("Value:" + animalNoises.get(key));				}
	
				
				
				//LOOPING THRU A MAP THRU LOOPING THROUGH THE ENTRY SET
				
				for (Entry<String,String> entry : animalNoises.entrySet()); {
					
			
				Entry<String, String> entry;
				System.out.println("Key:" + entry.getKey());
				System.out.println("Value:" + entry.getValue());				}
				
				
				
				


		System.out.println();
		
		/* THE MAP KEY AND VALUE DATA TYPES */
		// Key and Value do not need to be the same type, but both must be Reference Types
		Map<Integer, Double> accounts = new HashMap<Integer, Double>();
		accounts.put(12345, 100d);
		accounts.put(56789, 200d);
		
		// Transfer half of Map 12345's money to account 56789
		

		
		
		System.out.println();
		System.out.println("####################");
		System.out.println("      MAP ORDER     ");
		System.out.println("####################");
		System.out.println();
	
		/*
		 * The Order that a Map stores the keys is dependent on the Implementation class used.
		 * 
		 * HashMap - does not retain order
		 * LinkedHashMap - retains the order of insertion
		 * TreeMap - maintains Natural Order for the Data Type of the key
		 */
		
		System.out.println("The values where inserted in the following order: 2, 10, 25, 1");
		
		System.out.println();
		System.out.println("  HASHMAP");
		System.out.println("Does not retain any order.  Instead it uses it's own internal ordering");
		
		Map<Integer, String> hashMapNumbersToWords = new HashMap<Integer, String>();
		
		hashMapNumbersToWords.put(2,  "Two");
		hashMapNumbersToWords.put(10, "Ten");
		hashMapNumbersToWords.put(25, "Twenty-Five");
		hashMapNumbersToWords.put(1,  "One");
		
		for (Integer number : hashMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + hashMapNumbersToWords.get(number));
		}		
		
		
		System.out.println();
		System.out.println("  LINKED HASHMAP");
		System.out.println("Retains the Order of Insertion");

		Map<Integer, String> linkedHashMapNumbersToWords = new LinkedHashMap<Integer, String>();
		
		linkedHashMapNumbersToWords.put(2,  "Two");
		linkedHashMapNumbersToWords.put(10, "Ten");
		linkedHashMapNumbersToWords.put(25, "Twenty-Five");
		linkedHashMapNumbersToWords.put(1,  "One");
		
		for (Integer number : linkedHashMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + linkedHashMapNumbersToWords.get(number));
		}	
		
		
		System.out.println();
		System.out.println("  TREEMAP");
		System.out.println("Maintains the Natural Order of the Data Type");
		System.out.println();
		System.out.println("Natural Order when numbers are Integer");
		
		Map<Integer, String> treeMapNumbersToWords = new TreeMap<Integer, String>();
		
		treeMapNumbersToWords.put(2,  "Two");
		treeMapNumbersToWords.put(10, "Ten");
		treeMapNumbersToWords.put(25, "Twenty-Five");
		treeMapNumbersToWords.put(1,  "One");
		
		for (Integer number : treeMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + treeMapNumbersToWords.get(number));
		}	


		System.out.println();
		System.out.println("TreeMap Natural Order when numbers are String");

		Map<String, String> treeMapNumbersAsStrings = new TreeMap<String, String>();
		
		treeMapNumbersAsStrings.put("2",  "Two");
		treeMapNumbersAsStrings.put("10", "Ten");
		treeMapNumbersAsStrings.put("25", "Twenty-Five");
		treeMapNumbersAsStrings.put("1",  "One");
		
		for (String number : treeMapNumbersAsStrings.keySet()) {
			System.out.println(number + " is " + treeMapNumbersAsStrings.get(number));
		}	


	}

}
