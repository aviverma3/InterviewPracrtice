package learn.com;

class Animal{
	String color = "white";
	void eat() {
		System.out.println("Eating grass");
	}
}

class Dog extends Animal{
	String color = "Black";
	public void show() {
		System.out.println(color);
		System.out.println(super.color);
	}
	void eat() {
		System.out.println("eating bread");
	}
	void work() {
		super.eat();
		eat();
	}
}
public class Test_Super {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.work();
	}

}
