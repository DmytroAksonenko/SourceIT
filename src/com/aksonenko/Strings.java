package com.aksonenko;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Strings {
	public static void main (String[]args) {
		
		//1
		System.out.println("Math.PI contains only one fraction digit:");
		double pi = Math.PI;
		BigDecimal bd = new BigDecimal(pi);
		BigDecimal result = bd
		        .round(new MathContext(2, RoundingMode.HALF_EVEN));
		System.out.println(result);
		System.out.println();
		
		//2
		System.out.println("Math.PI contains two fraction digits:");
		BigDecimal result2 = bd
		        .round(new MathContext(3, RoundingMode.HALF_EVEN));
		System.out.println(result2);
		System.out.println();
		
		//3
		System.out.println("Math.PI contains three fraction digits:");
		BigDecimal result3 = bd
				.round(new MathContext(4, RoundingMode.HALF_EVEN));
		System.out.println(result3);
		System.out.println();
				
		//4
		System.out.println("Math.PI contains four fraction digits:");
		BigDecimal result4 = bd
				.round(new MathContext(5, RoundingMode.HALF_EVEN));
		System.out.println(result4);
		System.out.println();
				
		//5
		System.out.println("Math.PI contains five fraction digits:");
		BigDecimal result5 = bd
				.round(new MathContext(6, RoundingMode.HALF_EVEN));
		System.out.println(result5);
	}

}
