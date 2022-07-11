package com.learn.customDoubleLinkedList;

public class EmployeeDoubleLinkedList {
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	public void addToFront(Employee employee) {
		EmployeeNode newNode = new EmployeeNode(employee);
		if (head == null) {
			tail = newNode;
		} else {
			head.setPrevious(newNode);
			newNode.setNext(head);
		}

		head = newNode;
		size++;
	}

	public void addToEnd(Employee employee) {
		EmployeeNode newNode = new EmployeeNode(employee);
		if (tail == null) {
			head = newNode;
		} else {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
		}
		tail = newNode;
		size++;
	}

	public EmployeeNode deleteFromFront() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode deletedNode = head;
		if (head.getNext() == null) {
			tail = null;
		} else
			head.getNext().setPrevious(null);
		head = head.getNext();
		size--;
		deletedNode.setNext(null);
		return deletedNode;
	}

	public EmployeeNode deleteFromEnd() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = tail;
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		return removedNode;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		return size;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.println("HEAD -> ");
		while (current != null) {
			System.out.print("  " + current + "<=>");
			current = current.getNext();
		}
		System.out.println("Tail");
	}
}
