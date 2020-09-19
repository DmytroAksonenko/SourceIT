package com.aksonenko;

import java.util.Scanner;

public class RomanNumbersDemo {
	public static void main(String[] args) {
		String[] romanNumbers = {"I","V","X","L","C"};
		int[] numbers = { 1, 5, 10, 50, 100 };
		String s = "";
		int choice = 0;
		int x = 0;
		System.out.println("What numbers do you want to enter?\r\n" + 
				"\r\n" + 
				"Roman - 1;\r\n" + 
				"Decimal - 2; ");
		
		Scanner sc = new Scanner(System.in);
		do	{
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("Please enter roman numerals: ");
				s = sc.next();
//				Roman2Decimal.roman2Decimal(s,romanNumbers,numbers);
				System.out.println("Result: " + Roman2Decimal.roman2Decimal(s,romanNumbers,numbers));
			}
			else if(choice == 2) {
				System.out.println("Please enter decimal numerals: ");
				x = sc.nextInt();
//				Roman2Decimal.decimal2Roman(x);
				System.out.println("Result: " + Roman2Decimal.decimal2Roman(x));
			}
			else {
				System.out.println("Incorrect Input");
			}
		} while (choice != 1 && choice != 2);
		sc.close();
		
	}

}
