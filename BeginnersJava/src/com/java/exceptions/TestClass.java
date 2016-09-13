package com.java.exceptions;

class MyException extends Exception {}
public class TestClass{
 public static void main(String[] args){
    TestClass tc = new TestClass();
  try { 
    try{
       tc.m1();
    }
    catch (MyException e){
       tc.m1();
    }
    finally{
       tc.m2();
    }
  }
  catch(MyException e) {
	  
  }
 }
 public void m1() throws MyException{
    throw new MyException();
 }
 public void m2() throws RuntimeException{
    throw new NullPointerException();
 }
}

