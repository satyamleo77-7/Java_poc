package com.learn.stackusingarray;

import java.util.EmptyStackException;
import java.util.Iterator;

public class ArrayStack {
	private Employee[] stack;
	private int top;

	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}

	public void push(Employee emp) {
		if (top == stack.length) {
			Employee[] employeeArray = new Employee[2 * stack.length];
			System.arraycopy(stack, 0, employeeArray, 0, stack.length);
			stack = employeeArray;
		}
		stack[top++] = emp;
	}

	public Employee pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		Employee employee = stack[--top];
		stack[top] = null;
		return employee;
	}

	public Employee peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top - 1];
	}

	private boolean isEmpty() {
		return top == 0;
	}

	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
