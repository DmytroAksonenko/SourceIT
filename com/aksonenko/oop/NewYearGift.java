package com.aksonenko.oop;

import java.util.Arrays;
import java.util.Objects;

public class NewYearGift {
		/*
		2. Новогодний подарок. Определить иерархию конфет и прочих сладостей.
		Создать несколько объектов-конфет. Собрать детский подарок с определе-
		нием его веса. Провести сортировку конфет в подарке на основе одного
		из параметров. Найти конфету в подарке, соответствующую заданному ди-
		апазону содержания сахара.
		 */
	
	private static final int DEFAULT_NEWYEARGIFT_CAPACITY = 10;
	private double weight;
	private String type;
	private Sweet[] sweets;
	private int lengthIndex;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void addSweet(Sweet sweet) {
		if(sweet == null)
			return;
		if(sweets == null)
			sweets = new Sweet[DEFAULT_NEWYEARGIFT_CAPACITY];
		if(sweets.length < lengthIndex + 1)
			sweets = Arrays.copyOf(sweets, sweets.length * 2);
		sweets[lengthIndex++] = sweet;
	}
	public double calculateSweetWeight() {
		double giftSumWeight = 0;
		for (Sweet sweet : sweets) {
			if(sweet != null) {
			giftSumWeight += sweet.getWeight();
	
			}
		}
		return giftSumWeight;

	}
	public Sweet[] sugarFilter(double minSugarContent, double maxSugarContent) {
		return Arrays.stream(sweets)
								.filter(Objects::nonNull)
								.filter( (sweet) -> {
									if(sweet.getSugarContent() >= minSugarContent &&
											sweet.getSugarContent() <= maxSugarContent) {
										return true;
									}else {
										return false;
									}
								})
								.toArray(Sweet[]::new);
	}
	

	
	public static void main(String[] args) {
		
		Sweet lollipop = new Candy();
		lollipop.setType("Lollipop");
		lollipop.setWeight(0.018);
		lollipop.setSugarContent(0.015);
		
		Sweet jellyCandy = new Candy();
		jellyCandy.setType("Jelly Candy");
		jellyCandy.setWeight(0.025);
		jellyCandy.setSugarContent(0.016);
		
		Sweet viennaWaffle = new Waffle();
		viennaWaffle.setType("Vienna Waffle");
		viennaWaffle.setWeight(0.02);
		viennaWaffle.setSugarContent(0.004);
		
		NewYearGift smallGift = new NewYearGift();
		smallGift.setType("Small Gift");
		smallGift.addSweet(lollipop);
		smallGift.addSweet(jellyCandy);
		smallGift.addSweet(viennaWaffle);
		
		double calculatedGift = smallGift.calculateSweetWeight();
		System.out.println("The weight of " + smallGift.getType() + " is: " + calculatedGift);
		
		Sweet[] filteredBySugarSweets = smallGift.sugarFilter(0, 0.015);
		System.out.println(Arrays.toString(filteredBySugarSweets));
		
	}


}

