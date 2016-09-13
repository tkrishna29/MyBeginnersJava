package com.java.beginner;

public class Test2 {
	private static String brand;
	private String brand2;
	
	private static int $;
	int si;
	 


public float parseFloat(String s){
   float f = 0.0f;
   try{
      f = Float.valueOf(s).floatValue();
      return f ;
   }
   catch(NumberFormatException nfe){
      System.out.println("Invalid input " + s);
      f = Float.NaN ;
      return f;
   }
   finally { System.out.println("finally");  }
   
}

	public static void main(String args[]) {
		float x = new Test2().parseFloat("hi");
		System.out.println(x);
		
		
		System.out.println('a' + 10);
/*		System.out.println(brand);
		System.out.println($);
Test2 t1 = new Test2();
System.out.println(t1.brand2);*/
		//		System.out.println(brand2);

/*	for (int i = 0;i<10; i++) {

		if (i%2 == 1)
			continue;
		System.out.println(i);
	}
	*/
	
/*	for (int i = 0; i<5; i++){
		
		for(char j = 'a'; j<'e';j++){
			if (j == 'b')
				break;
			for(int k = 0; k<3; k++){
				System.out.println("" + i + j + k);	
			}
			
		}
			
	}*/
		Top t1 = new Top();
int i = 1;
char c = (char)i;
System.out.println(c);
switch(i) {
case 'a': System.out.println("case a");
case '1': System.out.println("case 1");
}
		
	}
}
