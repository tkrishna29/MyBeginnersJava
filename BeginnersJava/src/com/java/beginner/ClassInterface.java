package com.java.beginner;

import java.util.ArrayList;

class ClassInterface
{
public static void main(String[] args)
{
	System.out.println("test");
SampleClass sc = new SampleClass();
AnotherSampleClass asc = new AnotherSampleClass();

System.out.println("sc: " + sc.getClass());
System.out.println("asc: " + asc.getClass());

sc = asc;

System.out.println("sc: " + sc.getClass());
System.out.println("asc: " + asc.getClass());

/*int b =1;
while (b <10){
	System.out.println(b);
	b++;
		
}
*/System.out.println(args);
int [][] array2d = new int[4][3];
System.out.println(array2d[0].length);
}




}