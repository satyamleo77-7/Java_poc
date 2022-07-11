package multithreading;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		// MyThread t=new MyThread(); t.setPriority(9); t.start();

		Runnable r = () -> {
			for (int j = 0; j < 5; j++) {
				//Thread.yield();
				System.out.println("Runnable ->" + Thread.currentThread().getName());
			}
		};
		Thread ty = new Thread(r);
		ty.setPriority(9);
		ty.start();
		ty.join();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main wala  -->" + Thread.currentThread().getName());
		}
	}

}




/*
 * class MyThread extends Thread{ public void run() { //try { for(int
 * i=0;i<5;i++) { // Thread.sleep(1000);
 * System.out.println("In child Thread  ->"+Thread.currentThread().getName()); }
 * // } catch (InterruptedException e) { // // TODO Auto-generated catch block
 * // e.printStackTrace(); // }
 */		
	//}
//}