package com.java.beginner;

public class X1 extends X{
private X1() { 
	System.out.println("in X1 constructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	X x = new X();
		new X1();
	}

}
