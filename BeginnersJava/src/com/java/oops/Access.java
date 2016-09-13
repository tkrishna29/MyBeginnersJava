package com.java.oops;

public class Access {
private int x = 0;
private int y = 0;
public static void main(String[] args) {
	double[] array = {10, 20.23, 'c', 300.00f};
	for (double d : array) {
		d = d + 10;
		System.out.print(d + " ");
		}

Access accApp = new Access();
accApp.printThis(1, 2);
accApp.printThat(3, 4);
}
public void printThis(int x, int y) {
x = x;
y = y;
System.out.println("x:" + this.x + " y:" + this.y);
}
public void printThat(int x, int y) {
this.x = x;
this.y = y;
System.out.println("x:" + this.x + " y:" + this.y);
}
}
