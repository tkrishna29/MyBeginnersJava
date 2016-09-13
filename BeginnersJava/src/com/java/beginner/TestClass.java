package com.java.beginner;

public class TestClass {
    public static void main(String[] args) throws Exception {
        try{
            doTest();
        }
        catch(ArrayIndexOutOfBoundsException me){
            System.out.println(me);
        }
    }
    
    static void doTest() throws Exception{
        int[] array = new int[10];
        array[9] = 1000;
        int x = 10/0;
        doAnotherTest();
    }
    
    static void doAnotherTest() throws Exception{
        throw new Exception("Exception from doAnotherTest");
    }
}
