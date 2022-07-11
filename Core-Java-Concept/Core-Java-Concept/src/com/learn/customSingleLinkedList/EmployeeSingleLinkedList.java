package com.learn.customSingleLinkedList;

public class EmployeeSingleLinkedList {
	private EmployeeNode head;
	private int size;

	public void addToFront(Employee employee) {
		EmployeeNode newNode = new EmployeeNode(employee);
		newNode.setNext(head);
		head = newNode;
		size++;
	}
	public EmployeeNode deleteFromFront() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode deletedNode=head;
		head=head.getNext();
		size--;
		return deletedNode;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public int getSize() {
		return size;
	}
	public void printList() {
		EmployeeNode current=head;
		System.out.println("HEAD -> ");
		while(current!=null) {
			System.out.print("  "+current+"=>");
			current=current.getNext();
		}
		System.out.println("null");
	}
}
