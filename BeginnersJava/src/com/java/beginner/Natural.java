package com.java.beginner;

public class Natural {
public static void main (String[] args) {
if (doCheck()) {
System.out.print("square ");
}

String day = "1";
switch (day) {
case "7":
System.out.print("Uranus");
case "6":
System.out.print("Saturn");
case "1":
System.out.print("Mercury");
case "2":
System.out.print("Venus");
case "3":
System.out.print("Earth");
case "4":
System.out.print("Mars");
case "5":
System.out.print("Jupiter");
}
System.out.println("...");


}
public static boolean doCheck() {
return false;
}
}


