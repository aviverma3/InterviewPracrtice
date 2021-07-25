package learn.com.misc;

class Car extends Thread{
	public void run(){
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("Car");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class Bike  extends Thread{
	public void run(){
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("Bike");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}

public class DemoMultithreading {

	public static void main(String[] args) {
		Car obj = new Car();
		Bike obj1 = new Bike();
		obj.start();
		obj1.start();
		

	}

}
