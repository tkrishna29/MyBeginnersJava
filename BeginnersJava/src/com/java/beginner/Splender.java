package com.java.beginner;

public class Splender extends Bike
{
void run(){
	System.out.println("running Splender");
}
void run1(int b){
	System.out.println("In running Splender");   
}
public static void main(String args[]) {
	Bike b = new Splender(); //upcasting  
    b.run1(3); 
 //   Bike.tyreCount = 3;
    System.out.println(Bike.tyreCount);
}
}
