package LinkedList;

public class Runner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertHead(40);
		list.insertHead(15);
		list.insertHead(10);
		list.insertHead(5);
		LinkedList list1 = new LinkedList();
		list1.insertHead(82);
		list1.insertHead(81);
		list1.insertHead(80);
		list1.insertHead(20);
		list1.insertHead(18);
		list1.insertHead(7);
		list1.insertHead(3);
		list1.display();

		/*
		 * Node n = mergeAndSort(list.head, list1.head);
		 * System.out.println("----------------"); while (n != null) {
		 * System.out.print("  " + n.data); n = n.next; }
		 */
		
	//	System.out.println("-------->"+list1.getMiddle());
	//	System.out.println("-------->"+list1.getMiddleOptimized());
		System.out.println("-------->"+list1.findMiddle());

		/*
		 * list.insertAtIndex(3, 6); list.display();
		 * 
		 * System.out.println("----------------");
		 * 
		 * list.insertAtEnd(9); list.display(); System.out.println("----------------");
		 * 
		 * list.deleteHead(); list.display();
		 * System.out.println("-------deleteHead---------");
		 * 
		 * list.deleteAtIndex(3); list.display();
		 * System.out.println("------deleteAtIndex---------");
		 * 
		 * list.deleteAtEnd(); list.display();
		 * System.out.println("------deleteAtEnd---------");
		 * 
		 * //list.convertToCircularList(); //list.display();
		 * //System.out.println("------convertToCircularList---------");
		 * 
		 * list.reverseList(); list.display();
		 */

	}

	private static Node mergeAndSort(Node head1, Node head2) {
		Node temp=new Node(0);
		Node curr_Node=temp;
		while(head1!=null && head2!=null) {
			if(head1.data>head2.data) {
				curr_Node.next=head2;
				head2=head2.next;
			}
			else {
				curr_Node.next=head1;
				head1=head1.next;
			}
			curr_Node=curr_Node.next;
		}
		if(head1!=null) {
			curr_Node.next=head1;
		}
		if(head2!=null) {
			curr_Node.next=head2;
		}
		return temp.next;
	}

}
