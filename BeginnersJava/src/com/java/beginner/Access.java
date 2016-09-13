package com.java.beginner;
import com.java.oops.*;
public class Access {
int sum = 0;
public void doCheck(int number) {
if (number %2 == 0) {
} else {
for (int i = 0; i < number; i++) {
sum +=i;
}
}
}
public static void main(String[] args) {
	Access obj = new Access();
System.out.print("Red " + obj.sum);
obj.doCheck(2);
System.out.print("Orange " + obj.sum);
obj.doCheck(3);
System.out.print("Green " + obj.sum);

CarApp c1 = new CarApp();
c1.activities();
String s1 = c1.getName();


}
}
