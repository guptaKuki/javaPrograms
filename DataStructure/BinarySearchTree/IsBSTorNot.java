package BinarySearchTree;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

public class IsBSTorNot {

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return true;
		
		int leftmax=largest(root.left);
		int rightmin=minimum(root.right);
		
		if(root.data<=leftmax)
			return false;
		if(root.data >rightmin)
			return false;
		
		return isBST(root.left) && isBST(root.right);
	}
	
	private static int minimum(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return Integer.MAX_VALUE;
		
		
		int leftmin=minimum(root.left);
		int rightmin=minimum(root.right);
		
		return Math.min(root.data, Math.min(leftmin, rightmin));
	}

	private static int largest(BinaryTreeNode<Integer> root) {
		if(root == null)
			return Integer.MIN_VALUE;
		
		int leftmax=largest(root.left);
		int rightmax=largest(root.right);
		
		return Math.max(root.data, Math.max(leftmax, rightmax));
	}

	public static void main(String[] args) {
		TakeInputLevelWise input=new TakeInputLevelWise();
		BinaryTreeNode<Integer> root = input.levelWise();
		
		boolean ans= isBST(root);
		System.out.println("Given tree is BST :"+ans);
	}

}
