package com.aksonenko;

import java.util.Scanner;

public class Loops2 {
	
	public static void main(String[]args){
		
			System.out.println("Please enter the height of the pyramid: ");
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			Integer number = sc.nextInt();
			
			for (int i = 1;i < number; i++) {
				System.out.println("*");
				for (int j = 0;j < i; j++) {
					System.out.print("*");
				}
				
			}
			for (int i = number;i >= 1; i--) {
				System.out.println("*");
				for (int j = 3;j <= i; j++) {
					System.out.print("*");
				}
				
			}
	}
	
}
