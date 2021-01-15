package com.techelevator;

public class ArraysAndLoops {
	
	public static void main(String[] args) {
		/* Declaring a variable of the data type String Array (String[]
		 * named instructors
		 * new creates a new array of the type String ( new String[] )
		 * the size is set to 5 ([5])
		 * = assigns the new array to the variable named instructors
		 * 
		 */
		
		String [] instructors = new String[5];
		
		instructors[0] = "John";
		instructors[1] = "Rachelle";
		instructors[2] = "Steve";
		instructors[3] = "Matt";
		instructors[4] = "Kevin";
		
		System.out.println( instructors[1]) ;
		
		instructors[0] = instructors[0] + "Fulton" ;
		
		int [] nums = new int[] {1,2,3,4,5,6,7,8,9,10};
		
	
			//this is the code that will execute
			//pt1: incrementer (optional) - a varible to hold a to change
			//pt2: a boolean condition using the incrementer. That starts 
			//pt3: an iterator expression (change that occurs after each look that changes the incrementer)
			for (int i = 0; i < 10 ; i = i +1 ) {
				//this is the code that will execute
			System.out.println(i);
			
			
			
		}
			int sum = 0;
			
			for ( int i = 1 ; i < 101; i++) {
				sum += i;
				
			}
		
		System.out.println( sum);
		
		int evenSum = 0;
		for ( int i = 0; i < 101; i++ ) {
			if (i % 2 ==0) {
				evenSum += i;
			}
			
			int evenSum2 = 0;
					for ( int i1 = 0; i1 < 101; i1+=2 ) {
					 if (i1 % 2 ==0) {
							evenSum2 += i1;
						}
					}
			
			for (int x =100 ; x >= 0; x--) {
				System.out.print(x + " ");
			}
		}	
	}
}
		
		
	