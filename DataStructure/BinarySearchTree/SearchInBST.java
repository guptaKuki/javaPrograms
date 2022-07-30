package BinarySearchTree;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

public class SearchInBST {

	public static boolean isPresent(BinaryTreeNode<Integer> root , int x) {
		
		if(root == null)
			return false;
		
		if(x == root.data)
			return true;
		
		 if(x > root.data)
			return isPresent(root.right, x);
		else
			return isPresent(root.left, x);
		
	}
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		TakeInputLevelWise input=new TakeInputLevelWise();
		BinaryTreeNode<Integer> root = input.levelWise();
		
		System.out.println("Enter the data x :");
		int x= s.nextInt();
		boolean ans = isPresent(root,x);
		System.out.println("Data is present :"+ans);
	}

}
