package com.java.beginner;


class TestClass2 implements I1, I2{
   public void m1() { System.out.println("Hello"); }
   public static void main(String[] args){
      TestClass tc = new TestClass();
      ((I1) tc).m1();
   }
}
