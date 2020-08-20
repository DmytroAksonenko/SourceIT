package com.aksonenko;

public class AddIntegers {
	public static void main (String[]args) {
		// task "a. Program is started with 2 input arguments."
		System.out.println("Task \"a\"");
		System.out.println("Your first argument is: " + args[0]);
		System.out.println("Your second argument is: " + args[1]);
		System.out.println();
		
		// task "b. Program parses arguments to Integer."
		System.out.println("Task \"b\"");
		System.out.println("String arguments to int");
		int arg1 = Integer.parseInt(args[0]);
		int arg2 = Integer.parseInt(args[1]);

		System.out.println();
		// task "c. Program prints sum of integers to console"
		System.out.println("Task \"c\"");
		int result = arg1 + arg2;
		System.out.println("Sum of integers: " + result);
	}
}
