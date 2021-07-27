package learn.com.exceptionHandling;


public class B {

	public static void main(String[] args) {
		try {
			Integer a = new Integer("avinash");
			NumberFormatException ex = new NumberFormatException();
			throw ex;
			
		}
			catch(NumberFormatException e) {
				System.out.println("handled");
			}
	}

}
