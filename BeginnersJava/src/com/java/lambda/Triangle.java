package com.java.lambda;

class Triangle{
    public char c;
	public int base;
    public int height;
    public final double ANGLE;
    public Triangle() {
    	ANGLE = 10;
    }
//    public  void setAngle(double a){  ANGLE = a;  }
    
    public static void main(String[] args) {
        
    	Triangle t = new Triangle();
    	int x = t.c;
    	System.out.println(x);
        System.out.println(t.ANGLE);
  //      t.setAngle(90);
    }
}
