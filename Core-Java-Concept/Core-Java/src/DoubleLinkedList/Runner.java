package DoubleLinkedList;

public class Runner {
	public static void main(String[] args) {
		DoubleLinkedList dls = new DoubleLinkedList();
		dls.insert(4);
		dls.insert(3);
		dls.insert(2);
		dls.insert(1);
		dls.insertAfter(dls.head.next, 23);
		dls.print();
	}
}
