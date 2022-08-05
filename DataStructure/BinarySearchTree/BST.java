package BinarySearchTree;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.data= data;
	}
}

class DeleteReturn{
	TreeNode newRoot;
	boolean deleted;
	
	DeleteReturn(){
	}
	
	DeleteReturn (TreeNode root , boolean deleted){
		this.newRoot=root;
		this.deleted=deleted;
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
	
	private static DeleteReturn deletehelper(TreeNode root , int x) {
		
		if(root == null)
			return new DeleteReturn(null,false);
		
		if(root.data > x) {
			DeleteReturn newleft=deletehelper(root.left,x);
			root.left=newleft.newRoot;
			newleft.newRoot=root;
			return newleft;
		}
		if(root.data < x) {
			DeleteReturn newright=deletehelper(root.right,x);
			root.right=newright.newRoot;
			newright.newRoot=root;
			return newright;
		}
		//0 Children
		if(root.left == null && root.right == null)
			return new DeleteReturn(null,true);
		//only left children present
		if(root.left != null && root.right == null)
			return new DeleteReturn(root.left,true);
		//only Right children present
		if(root.left == null && root.right != null)
			return new DeleteReturn(root.right,true);
		// both children present
		int rightmax=minimum(root.right);
		root.data=rightmax;
		DeleteReturn outputRight=deletehelper(root.right,rightmax);
		root.right=  outputRight.newRoot;
		return new DeleteReturn(root,true);
		
	}
	
	private static int minimum(TreeNode root) {
		if(root == null)
			return Integer.MAX_VALUE;
		int right=minimum(root.right);
		int left=minimum(root.left);
		return Math.min(root.data , Math.min(right, left));
	}

	public boolean delete(int x) {
		 DeleteReturn ans= deletehelper(root,x);
		 root=ans.newRoot;
		 if(ans.deleted)
			 size--;
		 return ans.deleted;
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
