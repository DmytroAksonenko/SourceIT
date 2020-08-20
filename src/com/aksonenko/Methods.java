package com.aksonenko;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {

	public static void main(String[]args) {
		
		System.out.println("Please enter integer numbers separated by space: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		String stringArray[] = number.split("\\s+");
		int intArray[] = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
		System.out.println("Array object with entered numbers: ");
		System.out.println(Arrays.toString(intArray));
		
		//Find maxInt in Array
		int maxInt = findMaxIntInArray(intArray);
		System.out.println("Max value from the array:");
		System.out.println(maxInt);
				
	}

	public static int findMaxIntInArray (int intArray[]) {
		int maxInt = intArray[0];
		for (int i : intArray) {
			if (i > maxInt) {
				maxInt = i;
			}
		}
		return maxInt;
	}
	
}
