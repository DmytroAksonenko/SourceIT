package com.aksonenko;

import java.lang.Character;

public class Roman2Decimal {
	public static int roman2Decimal(String s, String[] romanNumbers, int[] numbers) {
		int x = 0;
		int y = 0;
		int z = 0;
		String ch;
		for(int i = 0 ; i < s.length() ; i++) {
			ch = Character.toString(s.charAt(i));
			for(int j = 0 ; j < romanNumbers.length ; j++ ) {
				if(y >= numbers[j] & ch.equals(romanNumbers[j])) {
					if(z >= numbers[j]) {
						z = numbers[j];
						y += numbers[j];
						x = y;
					}else {
						y = y - (z*2) + numbers[j];
						z = numbers[j];
						x = y;
					}													
				}
				if(y < numbers[j] & ch.equals(romanNumbers[j])) {
						z = numbers[j];
						y = numbers[j] - y;
						x = y;											
				}
				if(y == 0 & ch.equals(romanNumbers[j])) {
					z = numbers[j];
					y = numbers[j];
					x += y;									
				}			
			}
		}
		return x;	
	}
	public static String decimal2Roman(int x) {	
		String s = "";
		for( ; x >= 1 ; ) {
			if(x >= 100) {
				s = s + "C";
				x -= 100;
			}
			if(x >= 90 & x < 100) {
				s = s + "XC";
				x -= 90;
			}
			if(x >= 50 & x < 90) {
				s = s + "L";
				x -= 50;
			}
			if(x >= 40 & x < 50) {
				s = s + "XL";
				x -= 40;
			}
			if(x >= 10 & x < 40) {
				s = s + "X";
				x -= 10;
			}
			if(x >= 5 & x < 10) {
				if(x != 9) {
					s = s + "V";
					x -= 5;
				}
				else {
					s = s + "IX";
					x -= 9;
				}
				
			}
			if(x >= 1 & x < 5) {
				if (x != 4) {
					s = s + "I";
					x -= 1;
				}
				else {
					s = s + "IV";
					x -= 4;
				}
			}		
		}
		return s;		
	}
}
