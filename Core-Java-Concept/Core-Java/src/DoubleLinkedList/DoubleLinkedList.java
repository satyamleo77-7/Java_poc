package DoubleLinkedList;

public class DoubleLinkedList {
	Node head;

	void insert(int data) {
		Node node = new Node(data);
		node.setNext(head);
		if(head!=null)
		head.previous = node;
		head = node;
	}

	void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(" " + temp.data);
			temp = temp.next;
		}
	}
	void insertAfter(Node previousNode, int data) {
		if(previousNode==null) {
			System.out.println("previous can't be null");
			return;
		}
		Node node=new Node(data);
		node.setPrevious(previousNode);
		node.setNext(previousNode.next);
		previousNode.setNext(node);
	}
}
