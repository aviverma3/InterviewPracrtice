package learn.com;

interface Car1{
	public default void show() {
		System.out.println("its a car");
	}
}
interface Bike1{
	public default void show() {
		System.out.println("its a bike");
	}
}
public class Practise_Interface implements Car1, Bike1 {
	
	public static void main(String[] args) {
		Practise_Interface obj =  new Practise_Interface();
		obj.show();
	}

	@Override
	public void show() {
		Car1.super.show();
		Bike1.super.show();
	}

}
