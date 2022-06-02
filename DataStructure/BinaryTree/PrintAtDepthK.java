package BinaryTree;

import java.util.Scanner;

public class PrintAtDepthK {
	
	public static void printNode(BinaryTreeNode<Integer> root , int  k) {
		
		if (root == null)
			return;
		
		if(k == 0) {
			System.out.print(root.data+" ");
			return;
		}
		
		printNode(root.left , k-1);
		printNode(root.right , k-1);
			
	}

	public static void main(String[] args) {
		
		BinaryTreeUse tree = new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the depth Value :");
		int k= s.nextInt();
		printNode(root,k);
	}

}
