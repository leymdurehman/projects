package com.techelevator;

import java.util.Scanner;

public class Fibonacci {
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		
	 int fibNumMax; 
	 int num1 = 0;
	 int num2 = 1;
		 
		 
		
	       
	        
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Enter the Fibonacci Number:");
	        
	        fibNumMax = input.nextInt();
	        
	        int i=1;
	 	       while(i <= fibNumMax && num1 < fibNumMax)
	 	      {
	 	          System.out.print(num1+" ");
	 	          
	 	          int sumOfPrevTwo = num1 + num2;
	 	          
	 	          num1 = num2;
	 	          
	 	         num2 = sumOfPrevTwo;
	 	         
	 	           i++;
	 	           if ( num1 == fibNumMax) {
	 	        	   
	 	        	   break;
	 	        	  
	 	           }
	 	       }
	 	    }
}
	        
	        
	    

	  //      int i=1;
	   //     while(i<=count)
	  //      {
	  //          System.out.print(num1+" ");
	  //          int sumOfPrevTwo = num1 + num2;
	   //         num1 = num2;
	   //         num2 = sumOfPrevTwo;
	   //         i++;
	//        }
	    
	