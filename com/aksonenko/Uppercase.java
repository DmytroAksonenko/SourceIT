package com.aksonenko;

import java.util.Arrays;
import java.lang.Character;

public class Uppercase {
	
	public static void main(String[] args) {
		String str = null;
		String text = "When I was younger\r\n" + 
				"I never needed\r\n";
		String[] array = text.split("\\s+");
		for(int i = 0 ; i < array.length ; i++) {
			if(Character.isLowerCase(array[i].charAt(0))) {
				char ch;
				ch = Character.toUpperCase(array[i].charAt(0));

//				Why is there no replacement?
//				array[i].replace(array[i].charAt(0), ch);
				
				array[i] = array[i].substring(0, 0) + ch + array[i].substring(0 + 1);
			}
		}
		str = Arrays.deepToString(array).replace(',', ' ')
				.replace('[', ' ').replace(']', ' ');
		System.out.println(str);   
	}
	

}
