package learn.com.multithreading;

public class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Name:"+Thread.currentThread().getName());
	}

}
