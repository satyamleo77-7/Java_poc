package com.learn.customSingleLinkedList;

public class Runner {
	public static void main(String[] args) {
		Employee satyam = new Employee("Satyam", 1);
		Employee mukul = new Employee("Mukul", 2);
		Employee annie = new Employee("Annie", 3);
		Employee biplav = new Employee("Biplav", 4);
		EmployeeSingleLinkedList list = new EmployeeSingleLinkedList();
		System.out.println(list.isEmpty());
		list.addToFront(satyam);
		list.addToFront(mukul);
		list.addToFront(annie);
		list.addToFront(biplav);
		System.out.println(list.getSize());
		list.printList();
		list.deleteFromFront();
		System.out.println(list.getSize());
		list.printList();

	}
}
