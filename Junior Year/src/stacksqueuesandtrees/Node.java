package stacksqueuesandtrees;

//********************
//Logan Daniels
//9/12/17
//Creates nodes
//********************
public class Node<Type> {
	Type value;
	Node<Type> next;
	
	
	public Node() {
		value = null;
		next = null;
	}

	public Node(Type initValue, Node<Type> initNext) {
		value = initValue;
		next = initNext;
	}

	public Type getValue() {
		return value;
	}

	public Node<Type> getNext() {
		return next;
	}

	public void setValue(Type newValue) {
		value = newValue;
	}

	public void setNext(Node<Type> newNext) {
		next = newNext;
	}
}
