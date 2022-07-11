package com.tree;

public class TreeNode {

	Node root;

	public TreeNode() {
		super();
		this.root = null;
	}

	public TreeNode(int value) {
		super();
		this.root = new Node(value);
	}

	public void insert(int value) {
		root = insertRecord(root, value);
	}

	private static Node insertRecord(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (value < root.data)
			root.left = insertRecord(root.left, value);
		else if (value > root.data)
			root.right = insertRecord(root.right, value);
		return root;
	}

	public void inOrder() {
		inOrderTraversal(root);
	}

	public void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.println(root.data);
			inOrderTraversal(root.right);
		}

	}

	public int height() {
		return heightOfTree(root);

	}

	private int heightOfTree(Node root) {
		if (root == null)
			return 0;
		int left = heightOfTree(root.left);
		int right = heightOfTree(root.right);
		return Math.max(left, right) + 1;
		/*
		 * For each step it compares the left and right node/subtree height and adds 1
		 * to max of it and returns the height int height=Math.max(left, right) + 1;
		 * return height;
		 */
	}

	private static boolean checkIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;
		else if (root1 != null && root2 != null) {
			if (root1.data == root2.data && checkIdentical(root1.left, root2.left)
					&& checkIdentical(root1.right, root2.right))
				return true;
		}
		return false;

	}

	public static void main(String[] args) {
		TreeNode binarySearchTree = new TreeNode();
		binarySearchTree.insert(50);
		binarySearchTree.insert(30);
		binarySearchTree.insert(20);
		binarySearchTree.insert(40);
		binarySearchTree.insert(70);
		binarySearchTree.insert(60);
		binarySearchTree.insert(80);
		binarySearchTree.inOrder();
		TreeNode binarySearchTree1 = new TreeNode();
		binarySearchTree1.insert(50);
		binarySearchTree1.insert(30);
		binarySearchTree1.insert(20);
		binarySearchTree1.insert(40);
		binarySearchTree1.insert(70);
		binarySearchTree1.insert(60);
		binarySearchTree1.insert(80);
		System.out.println(checkIdentical(binarySearchTree.root, binarySearchTree1.root));

	}

}
