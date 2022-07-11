package LinkedList;

public class LinkedList {
	Node head;

	void insertHead(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}

	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ,");
			temp = temp.next;
		}
	}

	void insertAtIndex(int index, int data) {
		Node previousNode = head;
		for (int i = 0; i < index - 1; i++) {
			previousNode = previousNode.next;
		}
		Node insertNode = new Node(data);
		insertNode.next = previousNode.next;
		previousNode.next = insertNode;
	}

	void insertAtEnd(int data) {
		Node testNode = head;
		while (testNode.next != null) {
			testNode = testNode.next;
		}
		testNode.next = new Node(data);
	}

	void reverseList() {// 2,5,10
		Node previous = null, next;
		Node current = head;
		while (current != null) {
			next = current.next;// 5
			current.next = previous;// null
			previous = current;//
			current = next;
		}
		head = previous;
	}

	void deleteHead() {
		head = head.next;
	}

	void deleteAtIndex(int index) {
		Node previousNode = head;
		for (int i = 0; i < index - 1; i++) {
			previousNode = previousNode.next;
		}
		previousNode.next = previousNode.next.next;
	}

	void deleteAtEnd() {
		Node testNode = head;
		while (testNode.next.next != null) {
			testNode = testNode.next;
		}
		testNode.next = null;
	}

	void convertToCircularList() {
		Node testNode = head;
		while (testNode.next != null) {
			testNode = testNode.next;
		}
		testNode.next = head;
	}

	int getMiddle() {
		int count = 0;
		int flag = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		if (count % 2 == 0) {
			while (flag != (count / 2) + 1) {
				head = head.next;
				flag++;
			}
			return head.data;
		} else {
			while (flag != (int) (count / 2)) {
				head = head.next;
				flag++;
			}
			return head.data;
		}
	}

	int getMiddleOptimized() {

		int count = 0;
		int flag = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		while (flag != (count / 2)) {
			head = head.next;
			flag++;
		}
		return head.data;
	}
	
	int findMiddle() {
		Node fast_ptr=head;
		Node slow_ptr=head;
		while(fast_ptr.next!=null && slow_ptr.next!=null) {
			fast_ptr=fast_ptr.next.next;
			slow_ptr=slow_ptr.next;
		}
		return slow_ptr.data;
	}

}
