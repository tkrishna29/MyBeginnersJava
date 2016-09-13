package com.java.oops;

public class StaticCode {

	static String result = "X";
	{ result += "c"; 	}
	StaticCode() {
		result+="P";
	}
	static
	{
		result += "u";
	}
	{ result += "r"; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StaticCode.result);
		System.out.println(StaticCode.result);
		new StaticCode();
		System.out.println(StaticCode.result);
		new StaticCode();
		System.out.println(StaticCode.result);
	}

}
