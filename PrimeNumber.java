package week1.day1;

import lombok.experimental.var;

public class PrimeNumber {

	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int input = 13;

		// Declare a boolean variable flag as false
		boolean variableFlag = false;

		// Iterate from 2 to half of the input
		for (int i = 2; i < input/2; i++) {
			// condition for nonprime number
		      if (input % i == 0) {
		    	  variableFlag = true;
		        break;
		      }
			
		}

		// Divide the input with each for loop variable and check the remainder
		// Set the flag as true when there is no remainder
		// break the iterator
		// Check the flag (Provide a condition)
		// Print 'Prime' when the condition matches
		// Print 'Not a Prime' when the condition doesn't match
		if (!variableFlag)
		      System.out.println(input + " is a prime number.");
		    else
		      System.out.println(input + " is not a prime number.");
		  }
	}


