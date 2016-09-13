package com.java.beginner;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		X x1 = new X();
		X x2 = new X();
		Y y1 = new Y();
		x2.do1();
		((Y)x2).do2();
*/
/*String s1 = "Spring ";
String s2 = "Winter" ;
s1 = s2;

System.out.println(s2);*/
		
	String[] horses = new String[5];
	horses[4] = null;
	System.out.println(horses.length);
	
	for (int i =0; i < horses.length; i ++){
		if (i< args.length){
			horses[i] = args[i];
				
		}
		System.out.println(horses[i].toUpperCase());
			
	}
		
	}

}
