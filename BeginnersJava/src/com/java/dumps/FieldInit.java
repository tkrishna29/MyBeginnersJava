package com.java.dumps;

public class FieldInit 
{ 
char c;
boolean b;
float f;

void printAll() { 
	System.out.println("c = " + c); 
	System.out.println("c = " + b); 
	System.out.println("c = " + f);
}

public static void main(String[] args)
{
/*	FieldInit f = new FieldInit(); 
	f.printAll();	
*/	
String ta = "A ";
ta = ta.concat("B ");
String tb = "C ";
ta = ta.concat(tb);
ta.replace('C', 'D');
ta = ta.concat(tb);
System.out.println(ta);
	
	
	
}
}