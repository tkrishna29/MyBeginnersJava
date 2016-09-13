package com.java.dumps;

public class Test {
void readCard(int cardNo) throws Exception {
System.out.println("Reading Card"); }

void checkCard(int cardNo) throws RuntimeException {
System.out.println("Checking Card");
}


public static void main(String[] args) throws Exception {
Test ex = new Test();

int x = 100;
int a = x++;
int b = ++x;
int c = x++;
int d = (a > b) ? (a < c) ? 10: (b <c )? 20	:30	:40;

System.out.println(a + "  " + b + "  " + c);
System.out.println(d);

int i = 3;
System.out.println(i % 2 == 0 ? i % 4 == 0 ? "even steven" : "even" : "odd");

int cardNo = 12344;
ex.checkCard(cardNo); 
ex.readCard(cardNo); 

}
}