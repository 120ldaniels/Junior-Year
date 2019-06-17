package stacksqueuesandtrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<Type> {
	TreeNode<Type> root;

	BinaryTree() {
		root = null;
	}

	int height() {
		return height(root);
	}

	int height(TreeNode<Type> t) {
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

	void printInorder(TreeNode<Type> t) {
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

	void printPreorder(TreeNode<Type> t) {
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

	void printPostorder(TreeNode<Type> t) {
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

	void printBreadthFirstQ() {
		Queue<TreeNode<Type>> queue = new LinkedList<TreeNode<Type>>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode<Type> temp = queue.poll();
			System.out.println(temp.getValue() + " ");

			if (temp.hasLeft())
				queue.add(temp.getLeft());

			if (temp.hasRight())
				queue.add(temp.getRight());
		}
	}

	void printRow(int row) {
		printRow(root, row);
	}

	void printRow(TreeNode<Type> t, int row) {

		if (row == 1)
			System.out.println(t.getValue());

		if (row > 1) {
			if (t.hasLeft())
				printRow(t.getLeft(), row - 1);
			if (t.hasRight())
				printRow(t.getRight(), row - 1);
		}
	}

	void insert(Type data) {

		TreeNode<Type> temp = new TreeNode<Type>(data);

		Queue<TreeNode<Type>> q = new LinkedList<TreeNode<Type>>();
		q.add(root);
		if (root == null) {
			root = new TreeNode<Type>(data);
		} else {
			while (!q.isEmpty()) {
				temp = q.peek();
				q.remove();

				if (!temp.hasLeft()) {
					temp.left = new TreeNode<Type>(data);
					break;
				} else
					q.add(temp.left);
				if (!temp.hasRight()) {
					temp.right = new TreeNode<Type>(data);
					break;
				} else
					q.add(temp.right);

			}
		}

	}
}