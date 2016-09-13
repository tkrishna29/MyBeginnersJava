package practice;

public class Dog extends Animal{

Dog () {
	
}
	Dog(String name) {
		this.name = name;
	}

	public static void stDrink() {
		System.out.println("Dog drinking");
	}

	
	public void eat() {
		System.out.println(name);
		System.out.println("Dog eating");
	}
	public void sleep() {
		System.out.println("Dog sleeping");
	}
	public void bark() {
		System.out.println("Dog barking");
	}
	
}
