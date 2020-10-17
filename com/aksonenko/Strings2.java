package com.aksonenko;

import java.util.Scanner;

public class Strings2 {
	public static void main(String[]args) {
		System.out.println("Please enter text:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String array1 = sc.nextLine();
		String array2 = array1.replaceAll("\\s+","");
		System.out.println(array2);
	}
}
