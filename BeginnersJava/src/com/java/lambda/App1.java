package com.java.lambda;
//Using Anonymous Inner Classes
public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal OA1 = new Animal(){
			public void eat(){
				System.out.println("Overrided Animal eating");
			}
		};
		OA1.eat();
		OA1.drink();
		Dog OD1 = new Dog() {
			public void eat(){
				System.out.println("Overrided Dog eating");
			}
		};
		OD1.eat();
		
		Jumpable AJ1 = new Jumpable(){
			public void jump(){
				System.out.println("Animal is jumping");
			}
		};
		AJ1.jump();
	}

}
