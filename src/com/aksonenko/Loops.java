package com.aksonenko;

import java.util.Scanner;

public class Loops {
	
	public static void main(String[]args){
	
		System.out.println("Please enter integer number: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
			for (String splitNumber : number.split("", -1)) {
		         System.out.println(splitNumber);
		    }
	}
}
