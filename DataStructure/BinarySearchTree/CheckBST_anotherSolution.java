package BinarySearchTree;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

public class CheckBST_anotherSolution {

	public static void main(String[] args) {
		TakeInputLevelWise input=new TakeInputLevelWise();
		BinaryTreeNode<Integer> root = input.levelWise();
		
		boolean ans= isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println("Given tree is BST :"+ans);
	}

	private static boolean isBST(BinaryTreeNode<Integer> root , int minRange , int maxRange) {
		if(root == null)
			return true;
		
		if(root.data < minRange || root.data > maxRange)
			return false;
		boolean leftWithinRange=isBST(root.left , minRange , root.data-1);
		boolean rightWithinRange=isBST(root.right , root.data , maxRange);
		
		return leftWithinRange && rightWithinRange;
	}
}
