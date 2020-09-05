package com.aksonenko.oop;

import java.util.Scanner;

public class Payment {
	/*
	 Создать класс Payment с внутренним классом, с помощью объектов кото-
	 рого можно сформировать покупку из нескольких товаров.
	 */
	private String name;
	private Product[] products;
	private int cost;
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private class Product {
		
		private String productName;
		private int productCost;
		
		@SuppressWarnings("unused")
		public Product() {			
			productName = ""; 
			productCost = 0;			
		}
		
		public Product(String productName, int productCost) {
			this.productName = productName; 
			this.productCost = productCost;			
		}
		
	}
	
	public Payment() {
		this.name = ""; 
		this.cost = 0;

	}
	public Payment(String name) {
		this.name = name;
	}
	
	public void setPayment() {


		this.cost = 0;

		System.out.print("Please enter the number of products you want to buy: ");

		Scanner sc = new Scanner(System.in); 
		{
			int number = sc.nextInt(); 
			products = new Product[number];

			for(int i = 0; i < number; i++) {

				System.out.println("Product " + (i+1) + ": "); 
				System.out.print("Name: ");
				String productName = sc.next(); 
				System.out.print("Cost: "); 
				int productCost = sc.nextInt();
				products[i] = new Product(productName, productCost); 
				this.cost = this.cost + products[i].productCost;
				
			}
			
		}
		sc.close();

	}
	
	public void printCheque() {
		
		if(this.products.length != 0) {
			
			System.out.println("****************************"); 
			System.out.println(" " + this.name); 
			System.out.println();
			
			for(int i = 0; i < this.products.length; i++) {
				
				System.out.printf("%3d", i+1); 
				System.out.printf("%15s",this.products[i].productName); 
				System.out.printf("%10d",this.products[i].productCost); 
				System.out.println();
				
			}

			System.out.println(); 
			System.out.print("Total cost: "); 
			System.out.printf("%11d", this.cost); 
			System.out.println(); 
			System.out.println("****************************");

		}

		else {
			System.out.println(); 
			System.out.println("Nothing");
		}
	}

}
