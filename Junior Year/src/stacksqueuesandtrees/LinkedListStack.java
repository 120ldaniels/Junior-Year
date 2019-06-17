package stacksqueuesandtrees;

public class LinkedListStack<Type> {

	private int size = 0;
	Node<Type> first;

	LinkedListStack() {
	}

	Type pop() {
		Type e = get(1);
		Node<Type> position = first;
		for (int j = 1; j < 1; j++)
			position = position.getNext();
		for (int i = 0; i < (size - 1); i++) {
			position.setValue(get(i + 1));
			position = position.getNext();
		}
		position.setValue(null);
		size--;
		return e;
	}

	boolean push(Type t) {
		if (first == null) {
			Node<Type> newNode;
			newNode = new Node<Type>(t, first);
			first = newNode;
			size++;
			return true;
		}

		Node<Type> last = first;

		while (last.getNext() != null) {
			last = last.getNext();
		}

		Node<Type> newnode = new Node<Type>(t, null);
		newnode.next = last.next;
		last.next = newnode;

		size++;
		return true;
	}

	public Type get(int i) {
		if (i >= (size) || i < 0)
			throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
		Node<Type> last = first;
		for (int j = 0; j < i; j++) {
			last = last.getNext();
		}
		return last.getValue();
	}

	public int size() {
		return size;
	}
}