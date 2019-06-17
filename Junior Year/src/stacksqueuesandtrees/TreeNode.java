package stacksqueuesandtrees;

public class TreeNode<Type> {

	Type value;
	TreeNode<Type> left;
	TreeNode<Type> right;

	TreeNode() {
		value = null;
		left = null;
		right = null;
	}

	TreeNode(Type t) {
		value = t;
		left = null;
		right = null;
	}

	public Type getValue() {
		return value;
	}

	public TreeNode<Type> getLeft() {
		return left;
	}

	public TreeNode<Type> getRight() {
		return right;
	}

	public boolean hasLeft() {
		return (left != null);
	}
	
	public boolean hasRight() {
		return (right != null);
	}
	
	public void setValue(Type newValue) {
		value = newValue;
	}

	public void setLeft(TreeNode<Type> newLeft) {
		left = newLeft;
	}

	public void setRight(TreeNode<Type> newRight) {
		right = newRight;
	}

	public String toString()
	{
		return value.toString();
	}
	 
}
