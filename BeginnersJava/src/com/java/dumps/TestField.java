package com.java.dumps;

public class TestField {
int x,y;
public void doStuff(int x, int y) {
	this.x = x;
	y = this.y;
}
public void display() throws RuntimeException{
	System.out.println(x + " " + y + ":");
}
public int[] subArray(int[]src, int start, int end) {
	return src;
}

	public static void main(String[] args) {
boolean bool = true;

		TestField m1 = new TestField();
		m1.x = 100;
		m1.y  = 200;
		TestField m2 = new TestField();
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();

int[] arr = new int[10];
arr = m1.subArray(arr,0,2);

	String x = "XXXX-XXXX-XXXX-";
	StringBuilder sb1 = new StringBuilder("1234-5678-9101-1121");

System.out.println(sb1 + x);
	
		
	}

}
