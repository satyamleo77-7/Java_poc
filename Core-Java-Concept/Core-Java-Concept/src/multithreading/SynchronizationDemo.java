package multithreading;

class Display1 {

	public  void wish(String name) {
		synchronized(Display1.class) {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}}
}

class MyThread extends Thread {
	Display1 d;
	String name;

	public MyThread(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizationDemo{
	public static void main(String[] args) {
		Display1 d1=new Display1();
		Display1 d2=new Display1();
		MyThread t1=new MyThread(d1, "satyam");
		MyThread t2=new MyThread(d1, "mukul");
		t1.start();
		t2.start();
	}
}