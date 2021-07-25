package learn.com.misc;

interface Chunnu{
	default void show() {
		System.out.println("its chunnu's interface");
	}
}

interface Munnu{
	default void show() {
		System.out.println("its munnu's interface");
	}
}
public class MultipleInheritance implements Chunnu, Munnu {

	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Chunnu.super.show();
		Munnu.super.show();
	}

}
