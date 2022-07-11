package com.learn.trees;

public class CheckSibling {
	static class Node {
		int data;
		Node left, right;
	};

	static Node newNode(int data) {
		Node node = new Node();
		node.left = node.right = null;
		node.data = data;
		return node;
	}

	static Node root = null;

	static boolean checkSiblings(Node root, int data_one, int data_two) {
		if (root == null)
			return false;
		if (root.left != null && root.right != null) {
			int left = root.left.data;
			int right = root.right.data;
			if (left == data_one && right == data_two)
				return true;
			if (right == data_one && left == data_two)
				return true;
		}
		return true;
	}

	public static void main(String[] args) {
		root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(4);
		root.right.left = newNode(5);
		root.right.right = newNode(6);
		root.left.left.right = newNode(7);

		int data_one = 5;
		int data_two = 6;

		if (checkSiblings(root, data_one, data_two))
			System.out.print("YES");
		else
			System.out.print("NO");

	}
}
