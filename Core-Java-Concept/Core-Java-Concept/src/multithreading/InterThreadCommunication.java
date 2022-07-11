package multithreading;

public class InterThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
	Display d = new Display();
	d.start();
	d.start();
	d.start();
	Thread.sleep(50);
	synchronized (d) {
		System.out.println("Main calling wait");
		d.wait(50);
		System.out.println("Total printing by main thread: "+d.total);
	}
}
}

class Display extends Thread{
int total = 0;
@Override
public void run() {
	synchronized (this) {
		System.out.println("child start execution");
		System.out.println(this.getClass().getName());
		for (int i = 1; i <= 100; i++) {
			total = total + i;
		}
		System.out.println("child giving notification");
		this.notify();
	}
}
}
