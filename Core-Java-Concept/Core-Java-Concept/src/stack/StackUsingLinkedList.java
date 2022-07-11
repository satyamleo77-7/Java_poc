package stack;

public class StackUsingLinkedList {
	Node head;
	class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) throws Exception {
		StackUsingLinkedList s = new StackUsingLinkedList();
		for (int i = 1; i <= 10; i++) {
			s.push(i);
		}
		System.out.println("---------------------------");
		System.out.println(s.peek());
		System.out.println("---------------------------");
		for (int i = 1; i <= 10; i++) {
			int d = s.pop();
			System.out.println(d);
		}
		System.out.println("---------------------------");
		System.out.println(s.isEmpty());
	}
	
	public boolean push(int data) {
		Node temp=new Node(data);
			temp.next=head;
			head=temp;
			return true;
	}
	
	public int pop() {
		int res = 0;
		if(head==null)
			System.out.println("Underflow");
		else {
			 res=head.data;
			head=head.next;}
		return res;
	}
	public int peek() throws Exception {
		if(head!=null)
			return head.data;
		else throw new Exception("");
	}
	public boolean isEmpty() {
		return head==null ? true : false;
	}
}
