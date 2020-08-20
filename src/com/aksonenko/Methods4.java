package com.aksonenko;

import java.util.Arrays;
import java.util.Scanner;

public class Methods4 {

	public static void main(String[]args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter text: ");
		String text = sc.nextLine();
		System.out.println("Please enter minimum length of string to filter words: ");
		Integer minLength = sc.nextInt();
		String words[] = text.split("\\s+");
		String filteredArray[] = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredArray));
		
	}
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		
		String array[] = new String[words.length];
		for(int i = 0 ; i < words.length; i++) {
			if (words[i].length() >= minLength) {
				array[i] = words[i];						
			}
		}
		
		int size = 0;
		for (String word : array) {
			if (word != null) {
				size++;
			}
		}
		
		String nullArray[] = new String[size];
		int currentIndex = 0;
		for (String word : array) {
			if (word != null) {
				nullArray[currentIndex++] = word;
			}
		}
		return nullArray;
		
	}
	
}
