package binarysearchtrees;

import java.util.LinkedList;

import stacksqueuesandtrees.BinaryTree;

public class BinarySearchTree {
	TreeNode root;

	BinarySearchTree() {
		root = null;
	}

	int height() {
		return height(root);
	}

	int height(TreeNode t) {
		if (t == null)
			return 0;
		else {
			int heightLeft = height(t.getLeft());
			int heightRight = height(t.getRight());

			if (heightLeft > heightRight)
				return (heightLeft + 1);
			else
				return (heightRight + 1);
		}
	}

	void insert(double d) {
		insert(root, d);
	}

	TreeNode insert(TreeNode t, double d) {
		TreeNode temp = root;

		if (temp == null) {
			temp = new TreeNode(d);
			return temp;
		}

		else {
			if (d < temp.getValue())
				temp.left = insert(temp.getLeft(), d);
			else if (d > temp.getValue())
				temp.right = insert(temp.getRight(), d);

			return temp;
		}
	}

	boolean search(double d) {
		if (search(root, d) == null)
			return false;

		else
			return true;
	}

	TreeNode search(TreeNode t, double d) {

		if (t == null || t.getValue() == d)
			return t;

		if (t.getValue() > d)
			return search(t.getLeft(), d);

		else
			return search(t.getRight(), d);
	}

	void delete(double d) {
		delete(root, d);
	}

	TreeNode delete(TreeNode t, double d) {
		if (t == null)
			return t;

		if (d < t.getValue())
			t.left = delete(t.getLeft(), d);
		else if (d > t.getValue())
			t.right = delete(t.getRight(), d);

		else {
			if (t.left == null)
				return t.right;
			else if (t.right == null)
				return t.left;

			double min = root.getValue();
			while (root.getLeft() != null) {
				min = (root.getLeft()).getValue();
				root = root.getLeft();
			}
			t.value = min;

			t.right = delete(t.right, root.getValue());
		}

		return root;
	}

	static BinarySearchTree convert(BinaryTree<Double> bt) {
		BinarySearchTree bst = new BinarySearchTree();
		return bst;		
	}
	
	static BinarySearchTree convert(LinkedList<Double> ll) {
		
		BinarySearchTree bst = new BinarySearchTree();
		for (Double d : ll)
			bst.insert(d.doubleValue());
		
		return bst;
	}

	static BinarySearchTree convert(double[] arr) {

		BinarySearchTree bst = new BinarySearchTree();
		for (double d : arr)
			bst.insert(d);
		
		return bst;
	}

	void printInorder(TreeNode t) {
		if (t.hasLeft()) {
			printInorder(t.getLeft());
		}
		System.out.println(t.getValue());
		if (t.hasRight()) {
			printInorder(t.getRight());
		}
	}

	void printInorder() {
		printInorder(root);
	}

	void printPreorder(TreeNode t) {
		System.out.println(t.getValue());
		if (t.hasLeft()) {
			printPreorder(t.getLeft());
		}
		if (t.hasRight()) {
			printPreorder(t.getRight());
		}
	}

	void printPreorder() {
		printPreorder(root);
	}

	void printPostorder(TreeNode t) {
		if (t.hasLeft()) {
			printPostorder(t.getLeft());
		}
		if (t.hasRight()) {
			printPostorder(t.getRight());
		}
		System.out.println(t.getValue());
	}

	void printPostorder() {
		printPostorder(root);
	}

	void printBreadthFirst() {
		for (int i = 1; i <= height(); i++)
			printRow(i);
	}

	void printRow(int row) {
		printRow(root, row);
	}

	void printRow(TreeNode t, int row) {

		if (row == 1)
			System.out.println(t.getValue());

		if (row > 1) {
			if (t.hasLeft())
				printRow(t.getLeft(), row - 1);
			if (t.hasRight())
				printRow(t.getRight(), row - 1);
		}
	}
}