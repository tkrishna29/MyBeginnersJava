package enthuware;

public class MultipleInterfaces implements I1{
public static int x;
static int VALUE = 10;


	public static void main(String[] args) {
		
		MultipleInterfaces MI1 = new MultipleInterfaces();
		System.out.println(MI1.VALUE);
		
		I1 MI2 = new MultipleInterfaces();
		System.out.println(MI2.VALUE);
		
		System.out.println(MultipleInterfaces.VALUE);
		// TODO Auto-generated method stub
		
/*		int a = 'a';
		int b = 10;
		float f = 10.5f;
		System.out.println(b==(int)f);
		char c = 67;
		System.out.println(c);
		System.out.println(MultipleInterfaces.x);
		
		String cat1 = "procedura1";
		String cat2 = "procedura1";
		StringBuilder sb1 = new StringBuilder("procedura1");
		StringBuilder sb2 = new StringBuilder("procedura1");
		*/
		
/*		I2 obj1 = new MultipleInterfaces();
		System.out.println(obj1.VALUE);*/

		
/*		System.out.println(cat1 == cat2);
		
		System.out.println("Strings using equals: " + cat1.equals(cat2));
		System.out.println("Strings using equals: " + "procedural".equals(cat2));
*/		


		
	}


	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}



/*	public int m1() {
		// TODO Auto-generated method stub
		return 0;
	}*/




}
