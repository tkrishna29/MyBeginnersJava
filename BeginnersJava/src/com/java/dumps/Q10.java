package com.java.dumps;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cat1 = "procedural";
		String cat2 = "procedura1";
		StringBuilder sb1 = new StringBuilder("procedura1");
		StringBuilder sb2 = new StringBuilder("procedura1");

		System.out.println("String builders using tostring() equals constant: " + sb1.toString().equals("procedura1"));

		
			StringBuilder sb = new StringBuilder(5);
			String s = "5";
			if (sb.equals(s)) {
				System.out.println("Match 1");	
			}
			else if (sb.toString().equals(s.toString())) {
				System.out.println("Match 2");	
			}
			else {
			System.out.println("No Match");
			}

}

}