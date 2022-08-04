package BinarySearchTree;

public class BSTuse {

	public static void main(String[] args) {
		
		BST b= new BST();
		
		b.insert(5);
		b.insert(2);
		b.insert(7);
		b.insert(1);
		b.insert(3);
		b.insert(6);
		b.insert(8);
		
		b.printTree();
		
		System.out.println("Is present :"+b.isPresent(2));
		b.delete(2);
		System.out.println("Is present :s"+b.isPresent(2));
	}

}
