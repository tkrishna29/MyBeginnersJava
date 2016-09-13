package com.java.beginner;
import static com.java.beginner.Car.*;
public class ExceptionSample extends Car{
int [] arr2 = {1,2,3,4};
public void myMethod(){
	System.out.println(this.findArea(2, 3));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		try {*/
			String s1 = null;
			int [] arr1 = {1,2,3,4};
			new ExceptionSample().myMethod();
			
			//System.out.println("Tyre Count is" + TyreCount + "  " + this.findArea(3,4)); // CANNOT USE THIS IN A STATIC CONTEXT
			ExceptionSample es1 = new ExceptionSample();
			es1.method1(2);


			
			
			//System.out.println(s1.length());
//		}

/*		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Array element not found");
		}
		catch(NullPointerException e) {
			System.out.println("nullpointer reference");
		}
		catch (Exception e1){
			e1.printStackTrace();
		}

		finally {
			System.out.println("Program ended");
		}*/
		
	} // End of MAIN method

void method1(int a){
	System.out.println("in method1" + "   " + a);
	method2(3);
}

void method2(int a){
	System.out.println("in method2" + "   " + a);
	method3(0,4);
	
}
void method3(int a, int b) {

	System.out.println("in method3" + "  " + a + "  " + b);
//	System.out.println(arr2[6]);
    // Method implementation
	if (a == 0)
    throw new NullPointerException();

}

}
