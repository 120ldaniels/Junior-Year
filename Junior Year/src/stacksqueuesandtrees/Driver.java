package stacksqueuesandtrees;

public class Driver {
	public static void main(String[] args) {
		
		BinaryTree<String> tree = new BinaryTree<>();
		
		//Row 1
		tree.insert("Top");
		//Row 2
		tree.insert("LeftOne");
		tree.insert("RightOne");
		//Row 3
		tree.insert("CoolNode");
		tree.insert("CoolerNode");
		tree.insert("WeAreStrings");
		tree.insert("TwoMoreNodes");
		//Row 4
		tree.insert("INeededMoreRows");
		tree.insert("ForThisTree");
		tree.insert("I just realized I could use spaces");
		
		System.out.println("Height");
		System.out.println(tree.height());
		
		System.out.println();
		System.out.println("Print Breadth First:");
		tree.printBreadthFirst();
		
		System.out.println();
		System.out.println("Print Breadth First Queue:");
		tree.printBreadthFirstQ();
		
		System.out.println();
		System.out.println("Print Inorder:");
		tree.printInorder();
		
		System.out.println();
		System.out.println("Print Preorder:");
		tree.printPreorder();
		
		System.out.println();
		System.out.println("Print Postorder:");
		tree.printPostorder();
		
		

	}
}