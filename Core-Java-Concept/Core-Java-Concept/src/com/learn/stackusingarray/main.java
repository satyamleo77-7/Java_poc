package com.learn.stackusingarray;

public class main {
	public static void main(String[] args) {
		ArrayStack stack=new ArrayStack(10);
		stack.push(new Employee("Satyam", 0));
		stack.push(new Employee("Mukul",1));
		stack.push(new Employee("any", 2));
		stack.push(new Employee("many",3));
		stack.printStack();
		
		System.out.println("peek    "+stack.peek());
		stack.pop();
		System.out.println("pop");
		stack.printStack();
		stack.push(new Employee("John",5));
		System.out.println();
		stack.printStack();
		
	}


}
