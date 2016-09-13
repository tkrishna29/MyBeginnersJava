package com.java.dumps;

import java.util.ArrayList;

public class MainTest {

	char c;
	boolean b;
	float f;

	void printAll() { 
		System.out.println("c = " + c); System.out.println("c = " + b); System.out.println("c = " + f);
	}
	
	
static int doCalc(int var1) {
	var1 = var1 * 2;
	return var1;
}

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	new MainTest().printAll();
	
/*Boolean[] bool = new Boolean[2];
bool[0] = new Boolean(Boolean.parseBoolean("true"));
bool[1] = new Boolean(null);
System.out.println(bool[0] + " " + bool[1]);
int nums1[] = new int[3];
int nums2[] = {1,2,3,4,5};
nums1 = nums2;
for (int x:nums1) {
	System.out.println(x);
}
	*/
	
	
	}

}
