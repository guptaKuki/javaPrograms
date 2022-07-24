package BinaryTree;

import java.util.Scanner;

public class ReplaceNodeWithDepth {
	
	public static void replace(BinaryTreeNode<Integer> root , int c) {
		if (root == null)
			return;
		
		replace(root.left,c+1);
		System.out.print(c+" ");
		replace(root.right,c+1);
	}

	public static void main(String[] args) {

		BinaryTreeUse tree = new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		replace(root,0);
		
		
	}

}
