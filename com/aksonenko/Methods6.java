package com.aksonenko;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Methods6 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter length of an array: ");
		int number = sc.nextInt();
		
		int[] arr = generateRandomArray(number);	
		System.out.println("Program generated next matrix:\n");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		int[] secondArray = extendArray(arr);
		System.out.println("And matrix with x2 size:\n");
		System.out.println(Arrays.toString(secondArray));
		
	}
	
	public static int[] generateRandomArray(int amountOfElements) {
		
		Random random = new Random();
		int[] randomArray = new int[amountOfElements];
		for (int i = 0; i < amountOfElements; i++) {
			randomArray[i] = random.nextInt(100) + 1;
		}
		return randomArray;
		
	}
	
	public static int[] extendArray(int[] arr) {
		
		int secondArray = arr.length * 2;
		int[] randomArray = Arrays.copyOf(arr, secondArray);
		
		for (int i = arr.length; i < secondArray; i++) {
			randomArray[i] = arr[i - arr.length] * 2;
		}	
		return randomArray;
		
	}
}
