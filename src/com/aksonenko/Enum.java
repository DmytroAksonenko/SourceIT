package com.aksonenko;

import java.util.Scanner;

public class Enum {
	
	public enum Priority {
		
		HIGH, MEDIUM, LOW;
		
	}
	
	public enum MessageType{
		
		A(Priority.HIGH), B(Priority.MEDIUM), C(Priority.LOW), D(Priority.LOW);	
		
		private Priority priority;
		
		private MessageType(Priority priority) {
			this.priority = priority;
		}
		
		public Priority getPriority() {
			return this.priority;
		}
	}
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter message type: ‘A’, ‘B’, ‘C’ or ‘D’");
		String type = sc.next();
		String index;
		
		if(type.contains("A") || type.contains("B") || type.contains("C") || type.contains("D")) {
			index = "1";
		}	
		else if(type.contains("a") || type.contains("b") || type.contains("c") || type.contains("d")) {
			index = "1";
		}
		else
			index = "0";
			
		switch (index) {
	        case "1":
	        	MessageType messageType = MessageType.valueOf(type.toUpperCase());
				System.out.println("Priority is: " + messageType.getPriority()); 
	            break;
	
	        default:
	        	System.out.println("Only ‘A’, ‘B’, ‘C’ or ‘D’ message types are allowed");
	            break;
		}
		
		
	}
	
	
	
}

