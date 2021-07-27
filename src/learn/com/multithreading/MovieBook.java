package learn.com.multithreading;

public class MovieBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TotalEarning te = new TotalEarning();
		te.start();
		//System.out.println("total: "+te.total);
		
		synchronized (te) {
			te.wait();
			System.out.println("total: "+te.total);
		}
	}

}
