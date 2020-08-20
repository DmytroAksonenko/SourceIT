package com.aksonenko;

public class IfElse {
	public static void main(String[]args) {
		
		String choice = String.join("", args);
		
		if(choice.contains("--admin") &! choice.contains("--guest")) {
			System.out.println("Hello, Admin!");
		}
		else if(choice.contains("--guest") &! choice.contains("--admin")) {
			System.out.println("Hello, Guest!");
		}
		else{
			System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		}

	}

}
