package learn.com.misc;

class NegativeRadiusException extends Exception{
	
	public String toString() {
		return "radius can not be negative";
	}
	public String getMessage() {
		return "Radius can not be negative";
	}
}

public class Practise_Exception_Handling {
	
	public static double area(int r) throws NegativeRadiusException{
		if(r<0) {
			throw new NegativeRadiusException();
		}
		double result = Math.PI*r*r;
		return result;
	}

	public static void devide(int a , int b) throws ArithmeticException {
		int c = a/b;
	}
	public static void main(String[] args) {
		System.out.println("Lets explore the exception handling");
		try{
			//Practise_Exception_Handling.devide(3, 0);
			double ar =  area(6);
			System.out.println(ar);
		}
		catch(Exception e ) {
			System.out.println("its handled");
		}
		
		
	}

}
