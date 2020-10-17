package com.aksonenko;

public class IfElse2 {
	
	public static void main(String[]args) {
		
		String arg1 = args[0];
		String arg2 = args[1];
		
		if (arg1.contains(".") | arg2.contains(".")){
			double x = Double.parseDouble(arg1);
			double y = Double.parseDouble(arg2);
			double sum = x + y;
			System.out.println("The result of addition is floating-point number: " + sum);
		}
		
		else {
			int x = Integer.parseInt(arg1);
			int y = Integer.parseInt(arg2);
			int sum = x + y;
			System.out.println("The result of addition is integer: " + sum);
		}
		
	}

}
