package com.java.oops;

public class Car {
	private static int carCount = 0;
	private String carName = "kc";

	protected int CarAge;
	public Car(){
		System.out.println("Car Created");
	}
	
	public Car(String carName) {
		this();
		System.out.println("Car with name created");
		this.carName = carName;
	}
	public Car(String carName, int numCars) {
		this("Krishna");
		System.out.println("Car with name , numCars created");
		this.carName = carName;
	}
	
	public int getCount() {
		return carCount;
	}
	public void start() throws RuntimeException{
		System.out.println("Car started");
	}
	public int stop(){
		System.out.println("Car stopped");
		return 1;
	}
	public void move() throws RuntimeException{
		System.out.println("Car moved");
	}
	public void CarSpecs(){
		System.out.println("Car specs");
	}
	public int findArea(int a, int b) {
		return a + b;
	}
}
 class Car2 {
	
}