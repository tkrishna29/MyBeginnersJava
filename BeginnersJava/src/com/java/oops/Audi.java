package com.java.oops;

public class Audi extends Car {
public int height, weight;
public String name;
static final int tyreCount = 4;
public int x;
private static int doorCount = 2;
public Audi(){
	System.out.println("Audi Created");
}
public void start() throws RuntimeException{
		System.out.println("Audi started");
	}
	
	public void changeDoorCnt(){
		
		
		doorCount = 4;
	}
	
	public int stop(){
		System.out.println("Audi stopped");
		return 1;
		
	}
	public void move() throws RuntimeException{
		System.out.println("Audi moved");
	}
	public void AudiSpecs(){
		System.out.println("Audi specs");
	}
	public int findArea(int a, int b) {
		return a * b;
	}
	
	public float findArea(float a, float b) {
		return a*b;
	}
	
}
