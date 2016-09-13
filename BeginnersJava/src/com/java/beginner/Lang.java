package com.java.beginner;

class Lang {
private String category = "procedura1";

public static void main (String[] args) {
Lang obj1 = new Lang();
Lang obj2 = new Lang();
String cat1 = "procedura1";
String cat2 = "procedura1";
if (cat1 == cat2)
	System.out.println("Equal");
	

if (obj1.category == obj2.category) {
System.out.println("Equal");
} else {
System.out.println("Not equal");
}
if (obj1.category.equals(obj2.category)) {
System.out.println("Equal");
} else {
System.out.println("Not equal");
}
}
}
