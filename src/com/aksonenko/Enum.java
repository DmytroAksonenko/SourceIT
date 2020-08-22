package com.aksonenko;

import java.util.Scanner;

public class Enum {
	
	public enum Priority{
			
			HIGH,
			MEDIUM,
			LOW;	
		
		//WTF?
		
		//private String typePriority;
		
		//public Priority getPriority(String typePriority) {
		//	this.typePriority = typePriority;
		//}
		//public String getTypePriority() {
		//	return this.typePriority;
		//}
	}

	
	Priority priority;

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter message type: ‘A’, ‘B’, ‘C’ or ‘D’");
		String type = sc.next();
		
		switch (type) {
	        case "A":
	        	//getPriority();
	        	Priority typeA = Priority.HIGH; 
	            System.out.println("Priority is: " + typeA); 
	            break;
	
	        case "B":
	        	Priority typeB = Priority.MEDIUM; 
	            System.out.println("Priority is: " + typeB); 
	            break;
	
	        case "C":
	        	Priority typeC = Priority.LOW; 
	            System.out.println("Priority is: " + typeC); 
	            break;
	            
	        case "D":
	        	Priority typeD = Priority.LOW; 
	            System.out.println("Priority is: " + typeD); 
	            break;
	
	        default:
	        	System.out.println("Only ‘A’, ‘B’, ‘C’ or ‘D’ message types are allowed");
	            break;
		}
		
		
	}
	
	
	
}

