package com.aksonenko;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Methods7 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers separated by space: ");
		String twoNumbers = sc.nextLine();
		
		StringTokenizer strToken = new StringTokenizer(twoNumbers);
	    int count = strToken.countTokens();
	    int[] arr = new int[count];
	    for(int i = 0; i < count; i++){
	        arr[i] = Integer.parseInt((String)strToken.nextElement());
	    }
	    
	    int firstNumber = arr[0];
	    int secondNumber = arr[1];
	    
	    System.out.println("First number is " + firstNumber + "\n" 
	    		+ "Second number is " + secondNumber + "\n");
	    System.out.println("Greatest common divisor is " 
	    		+ gcdRecursive(firstNumber, secondNumber));
	    
		
	}
	public static int gcdRecursive (int firstNumber, int secondNumber) {
		
		if (secondNumber == 0)
			return firstNumber;
		return gcdRecursive(secondNumber, firstNumber % secondNumber);
		
	}

}
