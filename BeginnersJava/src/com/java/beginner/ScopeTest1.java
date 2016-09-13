package com.java.beginner;

import java.util.ArrayList;

public class ScopeTest1 {

public static void main(String[] args) {
	StringBuilder sb = new StringBuilder ();
	ArrayList a1 = new ArrayList();
	a1.add("C");
	

	
	String h1 = "HelloWorld";
	sb.append("Hello").append ("world");
	if (h1 == sb.toString()) {
	System.out.println("They match");
	}
	if (h1.equals(sb.toString())) {
	System.out.println("They really match");
	}

}
}