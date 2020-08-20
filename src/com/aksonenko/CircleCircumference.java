package com.aksonenko;

import java.util.Scanner;

public class CircleCircumference {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		
		// Get circle radius
		System.out.print("Please enter circle radius: ");
		int radius = sc.nextInt();
		System.out.println("Circle radius is " + radius);
		System.out.println();
		sc.close();
		
		// Calculates circle circumference
		int diameter = radius * 2;
		double result = Math.PI * diameter;
		System.out.println("Circle circumference is " + result);
	}
}
