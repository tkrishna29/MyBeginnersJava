package com.java.dumps;

public class Ebook extends Book{

	public void readBook() { }
	public void setBookMark() {
		
	}
	
	public static void main(String[] args) {

				String ta = "A "; 
				ta = ta.concat ("B ");
				String tb = "C ";
				ta = ta.concat(tb);
				ta. replace ('C', 'D');
				ta = ta.concat(tb);
				System.out.println(ta);
				
				int a[] = {1,2,3,4,5};
				for(int e = 0; e<5;e+=2) {
					System.out.println(a[e]);
				}
				
				
	}
}
