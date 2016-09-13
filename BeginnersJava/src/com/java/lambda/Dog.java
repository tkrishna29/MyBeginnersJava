package com.java.lambda;

public class Dog extends Animal{
private int j;
	public String name = "dog";

public void eat(){
	for (int j=1; j<10;j++);
	System.out.println(j);
	System.out.println(super.name);
	System.out.println(super.age);
	System.out.println("Dog eating");
}
public static int sleep() {
	System.out.println("Dog Sleeping");
	return 5;
}


public static void main(String[] args){
	
	
/*	String str2;
	int[] arr = new int[0];
		System.out.println(arr.length);
		System.out.println(Integer.toBinaryString(55));
		*/

String s = "helloo";
System.out.println(s.substring(1));
	Animal a1 = new Dog();
	a1.sleep();
	Dog d1 = new Dog();
	d1.sleep();
int[] arr1 = {1,2,3,4,5,6};
int[] arr2 = new int[10];
System.arraycopy(arr1, 2, arr2, 1, 3);
	for(int i:arr2) {
		System.out.print(i + " ");
	}
System.out.println( 28 + 5 <= 4 + 29 );




	

}
}
