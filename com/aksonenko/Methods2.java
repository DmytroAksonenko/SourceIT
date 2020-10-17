package com.aksonenko;

import java.util.Scanner;

public class Methods2 {
	
	public static void main(String[]args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter height of the rectangle: ");
		Integer height = sc.nextInt();
		System.out.println("Please enter width of the rectangle: ");
		Integer width = sc.nextInt();
		drawRectangle(height, width);
		
	}
	
	public static void drawRectangle (int height, int width) {
		
		String space = " ";
		String spaces = space;
		for(int i = 0 ; i < (width-3) ; i++) {
			spaces = spaces + space; 
		}
		for(int i = 0 ; i < (width-1) ; i++) {
			System.out.print("+");
		}
		System.out.println("+");
		for(int i = 0 ; i < (height-2) ;i++) {
			System.out.println("+" + spaces + "+");
		}
		for(int i = 0 ; i < (width-1) ; i++) {
			System.out.print("+");
		}
		System.out.println("+");
		
	}

}
