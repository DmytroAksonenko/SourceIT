package com.aksonenko;

import java.util.Scanner;

public class AriaOfTriangle {
	public static void main(String[]args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// Get length of the side A
		System.out.print("Please enter length of the side A of triangle: ");
		double a = sc.nextInt();
	    System.out.println("A is "+ a);
	    System.out.println();
	    
	    // Get length of the side B
	    System.out.print("Please enter length of the side B of triangle: ");
	    double b = sc.nextInt();
	    System.out.println("B is "+ b);
	    System.out.println();
	    
	    // Get length of the side C
	    System.out.print("Please enter length of the side C of triangle: ");
	    double c = sc.nextInt();
	    System.out.println("C is "+ c);
	    System.out.println();
	    //sc.close();
	    
	    // Calculates area of triangle
	    double p = (a + b + c) / 2;
	    double area = (double) Math.sqrt(p * (p - a) * (p - b) * (p - c));
	    if(a> 1 & b> 1 & c > 1)System.out.println("Area of triangle is: "+ area);
	    else System.out.println("NaN");
	}

}
