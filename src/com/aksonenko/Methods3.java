package com.aksonenko;

import java.util.Scanner;

public class Methods3 {
	
	public static void main(String[]args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter text: ");
		String text = sc.nextLine();
		System.out.println("Amount of words in the text is: " + getWordsAmount(text));
		
	}
	public static int getWordsAmount(String text) {
		
		int words = 0;
		for (@SuppressWarnings("unused") String splitUnusedText : text.split("\\s+", -1)) {
	         words = words + 1;
	    }
		return words;
	    
	}

}
