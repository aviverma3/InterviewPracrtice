package learn.com.multithreading;

public class ThreadingByRunnable implements Runnable {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadingByRunnable th = new ThreadingByRunnable();
	
		Thread obj = new Thread(th);
		
		obj.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Its working");
	}

}
