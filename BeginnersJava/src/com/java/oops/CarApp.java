package com.java.oops;
import java.util.ArrayList;
import java.util.Arrays;

import com.java.beginner.*;

public class CarApp {
final int y = 2;
private String name;
boolean flag;
static private int y2;
static String name2;
static boolean flag2;

public String getName(){
	return name;
}

private void eat(){
	System.out.println("I'm eating");
}
private void drink(){
	System.out.println("drinking");
}
static public void Car(){
	System.out.println("Car");
	//eat();
}

public void activities(){
	eat();
	drink();
	Car();
}


public static void main(String[] args) {


//Car c1 = new Car();
Car c2 = new Car("Krishna",3);



	}

}

