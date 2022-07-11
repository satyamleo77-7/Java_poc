package multithreading;

class Print extends Thread {
	int reminder;
	static int number = 1;
	static Object obj = new Object();

	Print(int reminder, String name) {
		super(name);
		this.reminder = reminder;
	}

	@Override
	public void run() {
		while (number < 19) {//18
		synchronized (obj) {
				while (number % 3 != reminder) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
					}
				}
				System.out.println(Thread.currentThread().getName()+" "+number++);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				obj.notifyAll();
			}
		}
	}
}

public class Print3ConsecutiveNumber {

	public static void main(String[] args) {
		Printing t1 = new Printing(1, "Thread 1");
		Printing t2 = new Printing(2, "Thread 2");
		Printing t3 = new Printing(0, "Thread 3");
		t1.start();
		t2.start();
		t3.start();
	}

}
