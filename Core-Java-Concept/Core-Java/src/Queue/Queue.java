package Queue;

import java.util.Stack;

public class Queue {
	Stack<Integer>stack1=new Stack<Integer>();
	Stack<Integer>stack2=new Stack<Integer>();
	
	void enqueue(int data) {
		if(stack1.isEmpty()) {
			stack1.push(data);
		}
		else {
			while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
			}
			stack1.push(data);
			while(!stack2.isEmpty()) {
				stack1.push(stack2.pop());
				}
		}
	}
	
	int dequeue() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
			return -1;
		}
		return stack1.pop();
	}
	
	boolean isEmpty() {
		if(stack1.isEmpty())
			return true;
		else 
			return false;
	}
	
	void print() {
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		System.out.println(stack1.push(stack2.pop()));
	}
}
