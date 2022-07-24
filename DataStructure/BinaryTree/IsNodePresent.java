package BinaryTree;

import java.util.Scanner;

public class IsNodePresent {
	
	public static boolean present(BinaryTreeNode<Integer> root , int n) {
		if(root == null)
			return false;
		
		if(root.data == n)
			return true;
		
		return(present(root.left,n)||present(root.right,n));
		 
	}
	
	public static void main(String[] args) {
		
		BinaryTreeUse tree = new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Node Value :");
		int n= s.nextInt();
		System.out.println("Is node is present :"+present(root,n));
		s.close();
		
	}
}
