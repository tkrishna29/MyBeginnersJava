package com.java.dumps;

public class DerivedB extends DerivedA{
	public void test() {
		System.out.println("Derived B ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1 = new DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new DerivedB();
		b1 = (Base)b3;
		Base b4 = (DerivedA) b3;
		b1.test();
		b4.test();
	}

}
