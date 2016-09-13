package com.java.beginner;

public class ScopeTest
{
int z;
int [] [] array2d  = { { 0, 1, 2, 4}, {5, 6}};
int [] [] [] array3D1 = {{ {0,1,2},{2,3,4}, {4, 5,6}} ,{ {0,1,2},{2,3,4}, {4, 5,6}} ,{ {0,1,2},{2,3,4}, {4, 5,6}} };



public static void main(String[] args){
ScopeTest myScope = new ScopeTest();
int z = 6;
//System.out.println(z);
//myScope.doStuff();
/*System.out.println(z);
System.out.println(myScope.z);*/
String s1 = "0";
String s2 = s1;          
s1 = "1";
/*System.out.println(s1);
System.out.println(s2);*/
int b = 4;
b -- ;
/*System.out.println (b--);
System.out.println(b);
*/
String[] table = {"aa", "bb", "cc"};
for (String ss: table) {
int ii = 0;
System.out.println(table.length);
while (ii < table.length) {
System.out.println(ss + ", " + ii);
ii++;
}
}

int[][] array2D[][] ;

String message1 = "Wham bam!";
String message3 = new String("Wham bam!");
String message2 = new String("Wham bam!");
if (message2 == message3)
System.out.println("They match");
if (message1.equals(message2))
System.out.println("They really match");

}

void doStuff() {
int z = 5;
doStuff2();
System.out.println(z);
}

void doStuff2()
{
z = 4;
}
}
