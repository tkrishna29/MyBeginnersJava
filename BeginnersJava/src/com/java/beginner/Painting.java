package com.java.beginner;

public class Painting {
private String type;
public String getType() {
return type;
}
public void setType(String type) {
System.out.println(type);
	this.type = type;
}
public static void main (String[] args) {
Painting obj1 = new Painting();
Painting obj2 = new Painting();
obj1.setType("null");
obj2.setType("Fresco");
System.out.println(obj1.getType() + " : " + obj2.getType()); 

System.out.println( "Output is" + 28 + 5 + 29*2 );

}
}