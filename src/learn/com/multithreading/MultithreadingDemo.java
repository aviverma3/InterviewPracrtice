package learn.com.multithreading;

public class MultithreadingDemo extends Thread {
	
	public void run() {
		System.out.println("its working");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultithreadingDemo obj = new MultithreadingDemo();
		obj.start();

	}

}
