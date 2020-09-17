package com.aksonenko;

import java.lang.Character;

public class Roman2Decimal {
	public static void main(String[] args) {
		int x = 2;
		String s = "II";
		//decimal2Roman(x);
		roman2Decimal(s);
	}
	public static String decimal2Roman(int x) {	
		String s = "";
		return s;		
	}
	public static int roman2Decimal(String s) {
		int x = 0;
		int y = 0;
		char ch;
		String[] romanNumbers = {"I","V","X","L","C"};
		for(int i = 0 ; i < s.length() ; i++) {
			ch = s.charAt(i);
			System.out.println(ch);
			for(int j = 0 ; j < romanNumbers.length; j++) {
				if(Character.isLetter(ch)) {
					if(ch == romanNumbers[j].indexOf(0)) y = 1;
					if(ch == romanNumbers[j].indexOf(1)) y = 5;
					if(ch == romanNumbers[j].indexOf(2)) y = 10;
					if(ch == romanNumbers[j].indexOf(3)) y = 50;
					if(ch == romanNumbers[j].indexOf(4)) y = 100;
					x = x + y;
					System.out.println(x);
				}
			}
		}
		System.out.println("result: " + x);
		return x;	
	}
}
