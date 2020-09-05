package com.aksonenko.oop;

public class PaymentDemo {
	
	public static void main(String [] args) {

		Payment yourPurchase = new Payment("Your Purchase"); 
		yourPurchase.setPayment();
		yourPurchase.printCheque();

	}
}
