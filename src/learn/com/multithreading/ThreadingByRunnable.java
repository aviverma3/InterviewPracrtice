package learn.com.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.lang.model.type.ExecutableType;

public class ThreadingByRunnable {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int coreCount = Runtime.getRuntime().availableProcessors();
		ExecutorService  service = Executors.newFixedThreadPool(coreCount);
		for(int i =0 ; i< 100 ; i++) {
			service.execute(new Task());
		}
		System.out.println("Thread name: "+Thread.currentThread().getName());
		
	}


}
