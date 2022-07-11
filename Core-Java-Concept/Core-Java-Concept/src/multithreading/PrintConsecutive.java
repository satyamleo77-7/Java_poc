package multithreading;
//This Program uses 3 threads to print consecutive numbers.

public class PrintConsecutive {

	public static void main(String[] args) {
		Print p1 = new Print(1, "Thread-1");
		Print p2 = new Print(2, "Thread-2");
		Print p3 = new Print(0, "Thread-3");
		p1.start();
		p2.start();
		p3.start();
	}
}

class Printing extends Thread {
	static int value = 0;
	static Object obj = new Object();
	int reminder;
	String name;

	public Printing(int reminder, String name) {
		super(name);
		this.reminder = reminder;
	}
	@Override
	public void run() {
		while (value < 19) {
			synchronized (obj) {
				while (value % 3 != reminder) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + value++);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					obj.notify();
				}
			}
		}
	}
}
