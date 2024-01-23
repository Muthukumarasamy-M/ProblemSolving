package com.muthukumarasamym.recursion;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BinaryTreeTraversal {
	Node root;

	BinaryTreeTraversal() {
		root = null;
	}

	public void inorder(Node node) {
		if (node == null) {
			return;
		}
		inorder(node.left);

		System.out.print(node.key + " ");

		inorder(node.right);
	}

	public void preOrder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key + " ");

	}

	public static void main(String[] args) {

		BinaryTreeTraversal tree = new BinaryTreeTraversal();
		tree.root = new Node(4);
		tree.root.left = new Node(5);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(1);
		tree.root.right.left = new Node(9);
		tree.root.right.right = new Node(10);

		System.out.println("inorder ");
		tree.inorder(tree.root);
		System.out.println("\nPreorder ");
		tree.preOrder(tree.root);
		System.out.println("\nPostOrder");
		tree.postOrder(tree.root);

	}

}
