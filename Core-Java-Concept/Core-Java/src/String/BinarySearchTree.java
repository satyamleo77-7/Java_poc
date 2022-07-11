package String;
import java.util.Stack;
public class BinarySearchTree {
	public static void main(String[] args) {
		int[] num = { 8, 3, 6, 10, 4, 7, 1, 14, 13 };
		Node root = createBst(num);
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println();

		// iterative
		inorderIterative(root);
		System.out.println();
		preOrderTraversal(root);
		
		//depth first search
		int[] c = { 8, 3, 6, 10, 4, 7, 1, 14, 13 };
		System.out.println();
		dfs(root);
		
		
	}
	//dfs
	private static void dfs(Node root) {
		if(root != null) {
			System.out.print(root.data+" ");
		}if(root.left != null) {
			dfs(root.left);
		}if(root.right != null) {
			dfs(root.right);
		}
	}
	/**
	 * Push current node and get the left child until node is null
	 * break condition: check whether stack is empty or not
	 * pop the node and print it
	 * Initialize the node as right child of node
	 * @param root
	 */
	private static void inorderIterative(Node root) {
		Stack<Node> s = new Stack<Node>();
		while (true) {
			while (root != null) {
				s.push(root);
				root = root.left;
			}
			if (s.isEmpty())
				break;
			root = s.pop();
			System.out.print(root.data+" ");
			root = root.right;
		}
	}
	
	private static void preOrderTraversal(Node root) {
		Stack<Node> s = new Stack<Node>();
		while(true) {
			while(root!= null) {
				System.out.print(root.data+" ");
				s.push(root);
				root = root.left;
			}
			if(s.isEmpty())
				break;
			root = s.pop();
			root = root.right;
		
		}
	}

	private static void postorder(Node root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}

	private static void preorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	private static void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static Node createBst(int[] num) {
		Node root = null;
		for (int data : num) {
			root = insert(root, data);
		}
		return root;
	}

	private static Node add(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else if (data < root.data) {
			root.left = add(root.left, data);
		} else if (data > root.data) {
			root.right = add(root.right, data);
		}
		return root;
	}

	private static Node insert(Node root, int data) {

		Node curr = root;
		Node parent = null;
		// means tree is empty
		if (root == null) {
			return new Node(data);
		}
		while (curr != null) {
			parent = curr;
			if (data < parent.data) {
				curr = parent.left;
			} else {
				curr = parent.right;
			}
		}

		if (data < parent.data) {
			parent.left = new Node(data);
		} else {
			parent.right = new Node(data);
		}
		return root;
	}
}
