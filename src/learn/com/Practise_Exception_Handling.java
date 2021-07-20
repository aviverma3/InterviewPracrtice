package learn.com;

public class Practise_Exception_Handling {

	public static void devide(int a , int b) throws ArithmeticException {
		int c = a/b;
	}
	public static void main(String[] args) {
		System.out.println("Lets explore the exception handling");
		try{
			Practise_Exception_Handling.devide(3, 0);
		}
		catch(Exception e ) {
			System.out.println("its handled");
		}
		
	}

}
