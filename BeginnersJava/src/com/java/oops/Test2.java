package com.java.oops;

class Test2 {
int fvar;
static int cvar;
public static void main(String[] args) {
	main("krishna");
	Car c1 = new Car();
	c1.CarAge = 10;
Test2 t = new Test2();
cvar = 400;

String cat1 = "procedura1";
String cat2 = "procedura1";
StringBuilder sb1 = new StringBuilder("procedura1");
StringBuilder sb2 = new StringBuilder("procedura1");

System.out.println("Strings using equals: " + cat1.equals(cat2));
System.out.println("String builders ==: " + (sb1 == sb2));
System.out.println("String builders using equals: " + sb1.equals(sb2));
System.out.println("String builders using tostring() equals: " + sb1.toString().equals(sb2.toString()));
System.out.println("String builders using tostring() ==: " + (sb1.toString() == sb2.toString()));
System.out.println("String builders using tostring() == constant: " + (sb1.toString() == "procedura1"));
System.out.println("String builders using tostring() equals constant: " + sb1.toString().equals("procedura1"));
System.out.println("String builders using tostring() equals string: " + sb1.toString().equals(cat1));

// insert code here to write field variables
}
public static void main(String args) {
	System.out.println(args);
	
}
static void main(int args) {
	
}


}