package learn.com.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.lang.model.type.ExecutableType;

public class ThreadingByRunnable2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		service.schedule(new Task() , 10, TimeUnit.SECONDS);
		service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);
		
			for(int i =0 ; i< 100 ; i++) {
			service.execute(new Task());
		}
		System.out.println("Thread name: "+Thread.currentThread().getName());
		
	}


}
