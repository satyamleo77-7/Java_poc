package multithreading;

import java.util.Arrays;
import java.util.LinkedList;

public class ProducerConsumer {

	public static void main(String[] args) {
		final Producer pc = new Producer();

		Runnable r = () -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Runnable r1 = () -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();
	}
}
	class Producer {
		LinkedList<Integer> linkedList = new LinkedList<>();
		int capacity = 2;
		int val = 0;

		public void produce() throws InterruptedException {
			while (true) {
				synchronized (this) {
					while (linkedList.size() == capacity) {
						wait();
					}
					System.out.println("Generated Value  " + val);
					linkedList.add(val++);
					notify();
					Thread.sleep(500);
				}
			}
		}

		public void consume() throws InterruptedException {

			while (true) {
				synchronized (this) {
					while (linkedList.size() == 0) {
						wait();
					}
					System.out.println("Consumed Value  " + linkedList.removeFirst());
					notify();
					Thread.sleep(500);
				}
			}

		}

	}
