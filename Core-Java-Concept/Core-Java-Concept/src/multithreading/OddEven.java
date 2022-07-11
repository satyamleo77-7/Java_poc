package multithreading;

public class OddEven {
	static int num=1;
	static int num1 = 10;
	Object obj = new Object();

	void printOdd() {
		synchronized (this.obj) {
			while ((num1 > num)) {
				while (num % 2 == 0) {
					try {
						this.obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd"+Thread.currentThread().getName() + " " + num);
				num++;
				this.obj.notify();

			}
		}

	}

	void printEven() {
		synchronized (this.obj) {
			while ((num1 > num)) {
				while (num % 2 != 0) {
					try {
						this.obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + num);
				num++;
				this.obj.notify();

			}
		}
	}

	public static void main(String[] args) {

		OddEven oe = new OddEven();
		Runnable r1 = () -> {
			oe.printEven();
		};
		Runnable r2 = () -> {
			oe.printOdd();
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}