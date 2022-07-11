package com.learn.trees;

public class Tree {
	TreeNode root;

	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		} else
			root.insert(value);
	}
	
	public void traverseInOrder() {
		if(root!=null)
			root.traverseInOrder();
	}
}
