package com.java.dumps;

import java.util.ArrayList;
import java.util.List;
public class Employee {
	String name, msg;
	boolean contract;
	double salary;
	static int count = 0;
	int i = 0;
	Employee () {
		
	}
	Employee (String msg) {
		this();
		this.msg = msg;
	}
	public void changeCount() {
		while (i <5) {
			i++;
			count++;
		}
	}
	

/*public static String maskCC(String creditCard) {
	String x = "XXXX-XXXX-XXXX-";
	StringBuilder sb = new StringBuilder(x);
	sb.append(creditCard, 15,19);
	return sb.toString();
}

public static void doSum(Integer x, Integer y) {
	System.out.println("Integer sum is" + (x+y));
}
public static void doSum(double x, double y) {
	System.out.println("double sum is" + (x+y));
}
public static void doSum(float x, float y) {
	System.out.println("float sum is" + (x+y));
}
public static void doSum(int x, int y) {
	System.out.println("int sum is" + (x+y));
}
	*/

/*	public String toString() {
		return name + ":" + contract + ":" + salary;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {15, 30, 45, 60, 75};

		for(int i:intArr) {
			//System.out.println(i);
			System.out.println(intArr[i]);
		}
		
	System.out.println("Hello " + new StringBuilder("Java SE 8"));
	System.out.println("Hello  " + new Employee("Java"));
	System.out.println();
/*		doSum(10,20);
		doSum(10.0,20.0);*/
		Employee e = new Employee();
		
		//Q42
/*		System.out.println(maskCC("1234-5678-9011-1121"));
		
		e.name = "x";
		e.contract = true;
		e.salary = 100;
		System.out.println(e);
		
		double disc = 0;
		int qty = 85;
		
		disc = (qty >=90) ? 0.5 : (qty > 80)?0.2:0;

		System.out.println(disc);
		
		String str = "Hello";
		if (str.equals("Hello")?false:true) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}*/
		
		//Q41
/*		String[] planets = {"Mercury","Venus","Earth","Mars"};
		System.out.println(planets.length);
		System.out.println(planets[1].length());*/
		
		//Q45
/*		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while (true) {
				myList.add("My String");
			}
		}
		catch (Exception ex) {
			System.out.println("Caught an exception");
		}*/
		
/*		System.out.println("5 + 2 = " + 3+ 4);
		System.out.println("5 + 2 = " + (3+ 4));*/
		/*String str1 = " ";
		str1 = str1.trim();
		System.out.println(str1.isEmpty());*/
		
/*String[] strs = new String[2];
String s1 = null;
s1.concat("hello");
System.out.println(s1);
int idx = 0;
for (String s:strs) {
	//strs[idx].concat("element " + idx);
	idx++;
	System.out.println(idx);
}
for(idx = 0; idx <strs.length;idx++) {
	System.out.println(strs[idx]);
}*/
		


	}

}
