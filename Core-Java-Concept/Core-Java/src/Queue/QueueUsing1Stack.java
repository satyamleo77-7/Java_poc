package Queue;

import java.util.Stack;

public class QueueUsing1Stack {
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
	static class Queue{
	Stack<Integer> stack1=new Stack<Integer>();
	int enqueue(int data) {
		return stack1.push(data);
	}
	int dequeue() {
		if(stack1.size()==0) {
			System.out.println("Queue is Empty Now");
			return -1;
		}
		else if(stack1.size()==1)
			return stack1.pop();
		else {
			int res;
			int item=stack1.pop();
			res=dequeue();
			stack1.push(item);
			return res;
		}
	}
	}
}
