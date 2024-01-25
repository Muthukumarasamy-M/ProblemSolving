
package com.muthukumarasamym.recursion;

class TNode {

	int data;
	Node left;
	Node right;

	public TNode(int item) {
		data = item;
		left = right = null;
	}
}

public class BreadthFirstSearch {

	Node root;

	public BreadthFirstSearch() {
		root = null;
	}

	void printLevelOrder() {

		int h = height(root);
		for (int i = 1; i <= h; i++) {
			printcurrentLevel(root, i);
		}

	}

	private void printcurrentLevel(Node root, int i) {
		
		if (i == 0)
			return;
		if (i == 1)
			System.out.println(root.data+" ");
		else if (i > 1) {
			printcurrentLevel(root.left, i - 1);
			printcurrentLevel(root.right, i - 1);
		}

	}

	public int height(Node root) {

		if (root == null)
			return 0;

		int leftheight = height(root.left);
		int rightheight = height(root.right);

		if (leftheight < rightheight)
			return leftheight + 1;
		else
			return rightheight + 1;

	}

	public static void main(String[] args) {

		BreadthFirstSearch bfs = new BreadthFirstSearch();

		bfs.root = new Node(4);
		bfs.root.left = new Node(5);
		bfs.root.right = new Node(6);
		bfs.root.left.left = new Node(7);
		bfs.root.left.right = new Node(17);
		bfs.root.right.left = new Node(16);
		bfs.root.right.right = new Node(23);

		bfs.printLevelOrder();
	}

}
