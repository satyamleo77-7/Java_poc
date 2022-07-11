package Queue;

public class QueueUsing2Stack {
	public static void main(String[] args) {
		Queue queue = new Queue();
		System.out.println(queue.isEmpty());
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		System.out.println(queue.isEmpty());
		queue.print();
		System.out.println();
		queue.dequeue();
		queue.print();
	}
}