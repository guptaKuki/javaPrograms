package BinarySearchTree;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.data= data;
	}
}
public class BST {
	
	private TreeNode root;
	private int size;
	
	public boolean isPresent( int x) {
		return isPresentHelper(root,x);
	}
	
	private  static boolean isPresentHelper(TreeNode root, int x) {
		if(root == null)
			return false;
		
		if(root.data == x)
			return true;
		
		if(x < root.data)
			return isPresentHelper(root.left,x);
		else
			return isPresentHelper(root.right, x);
	}

	public void insert(int x) {
		root=insertHelper(root,x);
		size++;
	}
	
	private TreeNode insertHelper(TreeNode node, int x) {
		if(node == null)
			return new TreeNode(x);
		
		if(x < node.data)
			node.left=insertHelper(node.left, x);
		else
			node.right=insertHelper(node.right, x);
		
		return node;
	}

	public boolean delete(int x) {
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public void printTree() {
		printTreeHelper(root);
	}

	private static void  printTreeHelper(TreeNode root) {
		if(root == null)
			return;
		
		System.out.print(root.data + ":");
		if (root.left != null)
			System.out.print(" L" + root.left.data + " ,");
		if (root.right != null) {
			System.out.print(" R" + root.right.data);
		}
		System.out.println();

		printTreeHelper(root.left);
		printTreeHelper(root.right);
	}
	
}
