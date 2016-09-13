package com.java.beginner;

class StaticMethods {
static void one() 
{
	two();
	StaticMethods.two();
	//three();
	//StaticMethods.four();
}
static void two() { }
void three() {
 one();
 StaticMethods.two();
 four();
// StaticMethods.four();
 }
 void four() { }
 }