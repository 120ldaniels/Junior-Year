package binarysearchtrees;

public class TreeNode {

	double value;
	TreeNode left;
	TreeNode right;

	TreeNode() {
		value = 0;
		left = null;
		right = null;
	}

	TreeNode(double d) {
		value = d;
		left = null;
		right = null;
	}

	public double getValue() {
		return value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public TreeNode getRight() {
		return right;
	}

	public boolean hasLeft() {
		return (left != null);
	}

	public boolean hasRight() {
		return (right != null);
	}

	public void setValue(double newValue) {
		value = newValue;
	}

	public void setLeft(TreeNode newLeft) {
		left = newLeft;
	}

	public void setRight(TreeNode newRight) {
		right = newRight;
	}

	public String toString() {
		return value + "";
	}
}