package findCousins;

public class Tree {
	Node root;

	boolean isSibling(Node node, Node a, Node b) {
		if (node == null)
			return false;
		return (node.left == a && node.right == b) || (node.left == b && node.right == a)
				|| (isSibling(node.left, a, b)) || (isSibling(node.right, a, b));
	}

	public int getLevelOfNode(Node node, int val, int level) {
		if (node == null)
			return 0;
		if (node.value == val)
			return level;
		int l = getLevelOfNode(node.left, val, level + 1);
		if (l != 0)
			return l;
		l = getLevelOfNode(node.right, val, level + 1);
		return l;
	}

	public boolean checkIfCousin(Node node, Node a, Node b) {
		if (isSibling(node, a, b))
			return false;
		if(getLevelOfNode(node, a.value, 1)!=getLevelOfNode(node, b.value, 1))
			return false;
		return !isSibling(node, a, b);
			
	}
}
