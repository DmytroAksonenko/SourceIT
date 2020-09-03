package com.aksonenko.oop;

import java.util.ArrayList;

public class OOP2 {
	/*
	Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
	Методы: ехать, заправляться, менять колесо, вывести на консоль марку ав-
	томобиля.
	*/
	public static void main(String[] args) {
		
		String model = new String("Opel Astra G");
		
		ArrayList<Wheel> wheelsList = new ArrayList<>();
		Car car = new Car (model, wheelsList);
		System.out.println("Your car is: [" + car.getModel() + "]");		
		car.moveCar();
		car.fillUp(20);
		car.replaceTheWeel(3);
		car.stopCar();
		car.fillUp(20);
		car.replaceTheWeel(3);
		car.moveCar();
		
	}
}

abstract class Vehicle {
	abstract void moveCar();
	abstract void fillUp(int liters);
}

class Wheel{
}

class Engine{
	public void isRunning (boolean isRunningTrue) {
		
	}
}
class Car extends Vehicle{
	
	private Engine carEngine;
	private ArrayList<Wheel> wheelsList;
	private boolean isMove = false;
	private int fillUp;
	private String model;
	
	Car(String model, ArrayList<Wheel> wheelsList) {
		carEngine = new Engine();
		this.model = model;
		this.wheelsList = wheelsList;		
	}
	
	public void stopCar() {
		this.isMove = false;
		System.out.println("Car stopped");
	}
	
	@Override
	public void moveCar() {
		this.isMove = true;
		System.out.println("The car is moving");
	}
	
	@Override
	public void fillUp(int liters) {
		if(!isMove) {
			this.fillUp = liters;
			System.out.println("The car is filled with " + liters + " liters");
		}
		else {
			System.out.println("Please refuel the car");
		}
	}
	
	public void replaceTheWeel(int number) {
		if(!isMove) {
			System.out.println("Wheel " + number + " replaced");
		}
		else {
			System.out.println("Please replace the wheel " + number + " on your car");
		}
	}
	
	public String getModel() {
		return this.model;
	}


}

