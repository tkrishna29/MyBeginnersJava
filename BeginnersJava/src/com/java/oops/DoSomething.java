package com.java.oops;

public class DoSomething {
	public void go() {
		System.out.println("A");
		try {
			System.out.println("B");
			System.out.println(5/0);
		}
/*		catch (ArithmeticException e) {
			System.out.println("X");
		}
*/		finally {
			System.out.println("C");
		}
		System.out.println("D");
	}
	static void m (int[] i) {
		i[0] += 7;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new DoSomething().go();
		int[] j = new int[1];
		j[0] = 12;
		m(j);
		System.out.println(j[0]);

		Shape sp = null;
		Square sq = null;
		sp = (Shape) new Square();
		sq = (Square) new Shape();
		
		
	}

}
