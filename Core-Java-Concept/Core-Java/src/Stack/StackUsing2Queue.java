package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue {
	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();
	
	int push(int data) {
		if(queue1.isEmpty()) {
			queue1.add(data);
			queue1.addAll(queue2);
			queue2.clear();
			return data;
		}
		else if(queue2.isEmpty()) {
			queue2.add(data);
			queue2.addAll(queue1);
			queue1.clear();
			return data;
		}
		return -1;
	}
	int pushUsingSingleQueue(int data) {
		if(queue1.size()==0) {
			queue1.add(data);
			return data;
		}
		else {
			int item=queue1.remove();
			int res=pushUsingSingleQueue(data);
			queue1.add(item);
			return res;
		}
	}
	int popUsingSingleQueue() {
		if(!queue1.isEmpty())
		return queue1.remove();
		else {
			System.out.println("Gaand mein ghus jao bc");
			return -1;
		}
	}
	int pop() {
		if(!queue1.isEmpty()) {
			return queue1.remove();
		}
		else if(!queue2.isEmpty()) {
			return queue2.remove();
		}
		else {
			System.out.println("Gaand mein ghus jao bc");
			return -1;
		}
	}
	
}
