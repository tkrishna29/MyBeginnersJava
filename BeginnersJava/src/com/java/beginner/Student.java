package com.java.beginner;

public class Student {
public String name = "";
public int age = 0;
public String major = "Undeclared";
public boolean fulltime = true;
public Student(int a, int b){
	System.out.println("abc");
}
public Student() {
	// TODO Auto-generated constructor stub
}
public void display() {
System.out.println("Name: " + name + " Major: " + major);
}
public boolean isFullTime() {
return fulltime;
}
}

