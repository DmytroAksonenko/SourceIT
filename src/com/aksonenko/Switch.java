package com.aksonenko;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[]args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter one of possible events:\nI.\tlogin\nII.\t"
				+ "sign_up\nIII.\tterminate_program\nIV.\tmain_menu\nV.\tabout_app");
		for(;;) {
			String choice = sc.next();
			
			 switch (choice) {
				case "login":
					System.out.println("Please, enter your username");
					break;
				case "sign_up":
					System.out.println("Welcome!");
					break;
				case "terminate_program":
					System.out.println("Thank you! Good bye!");
					break;
				case "main_menu":
					System.out.println("Main menu");
					break;
				case "about_app":
					System.out.println("This app is created by me with support of ®IT-Bulls.com");
					break;
				default:
					System.out.println("Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app");
			}
		}
	}

}
