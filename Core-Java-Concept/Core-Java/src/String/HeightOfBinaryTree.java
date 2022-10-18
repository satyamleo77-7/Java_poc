package String;

public class HeightOfBinaryTree {
	public static void main(String[] args) {
		int[] num = {10,7,5,9,15,12,16};
		Node root = BinarySearchTree.createBst(num);
		System.out.println(root.toString());
		int height = findHeight(root);
		System.out.println("Height of binary tree : " + height);
	}

	private static int findHeight(Node root) {
		int h;
		if (root == null) {
			return -1;
		}
		int left = findHeight(root.left);
		int right = findHeight(root.right);
		return h=left > right ? left+1: right+1;
	}

}
