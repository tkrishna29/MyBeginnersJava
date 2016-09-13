package practice;

public class Animal {
	public String name = "myAnimal";
	Animal() {
		
	}
Animal(String name) {
	this.name = name;
}
	public static void stDrink() {
		System.out.println("Animal drinking");
	}

	public void eat() {
		System.out.println("Animal eating");
	}
	public void sleep() {
		System.out.println("Animal sleeping");
	}
}
