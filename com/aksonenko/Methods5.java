package com.aksonenko;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Methods5 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please specify matrix size: ");
		int size = sc.nextInt();
		double matrix[][] = new double[size][size];
		
		BigDecimal number = new BigDecimal(0.0);
		BigDecimal pointOne = new BigDecimal(0.1);
		BigDecimal one = new BigDecimal(1.0);
		 
		
		for (int i = 0; i < matrix.length; i++) {
			
	        for (int j = 0; j < matrix[i].length; j++) { 
	        	
	        	number = number.add(pointOne);
	        	number = number
	    		        .round(new MathContext(3, RoundingMode.HALF_EVEN));
	        	double d = number.doubleValue();
	        	matrix[i][j] = d;			
	        	
	        }
	        number = number.add(one);
	        
	    }
		
		System.out.println("Program generated next matrix:\n");
		
		for (int i = 0; i < matrix.length; i++) {			
            System.out.println(Arrays.toString(matrix[i]));
        }
		
		System.out.println("\n" + "How much do you want to rotate matrix?\r\n\n" +
				"-Press 1 to rotate matrix to 90 degrees\r\n" + 
				"-Press 2 to rotate matrix to 180 degrees\r\n" + 
				"-Press 3 to rotate matrix to 270 degrees");
		
		int choice = sc.nextInt();
		
		//Rotate matrix to 90 degrees
		if(choice == 1) {
			rotate90(matrix);
			for (int i = 0; i < matrix.length; i++) {			
	            System.out.println(Arrays.toString(matrix[i]));
	        }
		}
		
		//Rotate matrix to 180 degrees
		else if(choice == 2) {
			rotate180(matrix);
			for (int i = 0; i < matrix.length; i++) {			
	            System.out.println(Arrays.toString(matrix[i]));
	        }
		}
		
		//Rotate matrix to 270 degrees	
		else if(choice == 3) {
			rotate270(matrix);
			for (int i = 0; i < matrix.length; i++) {			
	            System.out.println(Arrays.toString(matrix[i]));
	        }
		}
		
		else {
			System.out.println("-Press 1 to rotate matrix to 90 degrees\r\n" + 
					"-Press 2 to rotate matrix to 180 degrees\r\n" + 
					"-Press 3 to rotate matrix to 270 degrees");
		}
		
	}

	public static void rotate90(double[][] matrix) {
		double temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
			
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}
		
	}

	public static void rotate180(double[][] matrix) {
		double temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = 0; j < matrix.length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length - 1 - i][j];
				matrix[matrix.length - 1 - i][j] = temp;
			}
		}
	}

	public static void rotate270(double[][] matrix) {
		double temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = 0; j < matrix.length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length - 1 - i][j];
				matrix[matrix.length - 1 - i][j] = temp;
			}
		}
	}

}
