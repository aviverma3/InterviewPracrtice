package learn.com;

interface PI1{
	default void show() {
		System.out.println("its PI1");
	}
}

interface PI2{
	default void show() {
		System.out.println("its PI2");
	}
}
public class MultipleInheritance implements PI1, PI2 {

	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		PI1.super.show();
		PI2.super.show();
	}

}
