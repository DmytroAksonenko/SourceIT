package com.aksonenko.oop;

public abstract class Sweet {

	private double sugarContent;
	private double weight;
	private String type;
	
	public double getSugarContent() {
		return sugarContent;
	}
	public void setSugarContent(double sugarContent) {
		this.sugarContent = sugarContent;
	}
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
	
	public String toString () {
		return "Sweet: " + type + " (weight " + weight + "kg," +  " sugar content " + sugarContent + "kg)";
	}
}

