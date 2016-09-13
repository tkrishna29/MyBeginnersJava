package com.java.dumps;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer iObj = new Integer(10);
int iVar = 10;
doubling(iObj++,iVar++);
System.out.println(iObj + "," + iVar) ;

	}
static void doubling (Integer ref, int pv) {
	ref = 20;
	pv = 20;
}
}
