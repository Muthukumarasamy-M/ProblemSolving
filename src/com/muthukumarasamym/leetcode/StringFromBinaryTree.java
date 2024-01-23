package com.muthukumarasamym.leetcode;

class TreeNode {
	int key;
	TreeNode left, right;

	TreeNode(int item) {
		this.key = item;
	}

	TreeNode(int key, TreeNode left, TreeNode right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}

}

public class StringFromBinaryTree {
	TreeNode root;

	StringFromBinaryTree() {
		root = null;
	}

	public String tree2str(TreeNode root) {

		StringBuilder s = new StringBuilder();
		DFS(s, root);
		return s.toString();

	}

	private void DFS(StringBuilder s, TreeNode root2) {

		if (root2 == null) {
			return;
		}
		s.append(root2.key);
		if (root2.left != null || root2.right != null) {
			s.append("(");
			DFS(s, root2.left);
			s.append(")");
		}

		if (root2.right != null) {
			s.append("(");
			DFS(s, root2.right);
			s.append(")");
		}

	}

	public static void main(String args[]) {
		StringFromBinaryTree tree = new StringFromBinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.right = new TreeNode(4);

		StringFromBinaryTree s = new StringFromBinaryTree();
		System.out.println(s.tree2str(tree.root));
	}
}
