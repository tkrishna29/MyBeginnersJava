package com.java.beginner;

import java.util.Arrays;

public class TestStudent {
public static void main(String[] args) {
Student bob = new Student ();
Student jian = new Student();
Student kc = new Student();
bob.name = "Bob";
bob.age = 19;
jian.name = "Jian";
jian.age = 25;
//jian = bob;
bob = jian;
kc = bob;
kc.name = "kc";
jian = bob;
/*System.out.println( bob.name + bob.age);
System.out.println( jian.name + bob.age);
System.out.println( kc.name + kc.age);*/
//System.out.println( jian.name + jian.age);

StringBuilder sb = new StringBuilder();

int [] array = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(array));
System.arraycopy (array, 2, array, 1, 2);
System.out.println(Arrays.toString(array));

int [] xx = null;
System.out.println(xx);
String name = "Mothi";
int age = 4;
//sb.append("My dog " + name + " is " + age);
//System.out.println(sb.toString());

//System.out.println("sb is" + sb );
//System.out.println();

int [] ages = new int[4];
ages[0] = 17;
sb.append("World");
sb.insert(0, "Hello");

System.out.println(sb);

char[] arr = {98, '\t', 'e', '\n', 'i', '\t', 'o'};
for (char var: arr) {
System.out.print(var);
}
System.out.print("\nThe length is :" + arr.length);
String url = "http://www.domain.com/index.html";
System.out.println("index is " + url.indexOf("zzz"));
/*if (XXXX) {
System.out.println("Found");
}*/
}
}