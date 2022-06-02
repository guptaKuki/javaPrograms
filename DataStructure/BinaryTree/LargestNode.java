package BinaryTree;

import java.util.Scanner;

public class LargestNode {
	
	public static int largest(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return -1;
		int largestLeft=largest(root.left);
		int largestRight=largest(root.right);
		
		return Math.max(root.data , Math.max(largestLeft, largestRight));
	}
	
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot , int parentData , boolean isLeft){
		Scanner sc= new Scanner(System.in);
		if(isRoot) {
			System.out.println("Enter the root data :");
		}else {
			if(isLeft)
				System.out.println("Enter the left child of :"+parentData);
			else
				System.out.println("Enter the right child of :"+parentData);
		}
		int data= sc.nextInt();
		if( data == -1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(data);
		BinaryTreeNode<Integer> leftChild=takeInputBetter(false , data ,true);
		BinaryTreeNode<Integer> rightChild=takeInputBetter(false , data , false);
		root.left=leftChild;
		root.right=rightChild;
		return root;
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root= takeInputBetter(true, 0 , true);
		int largestResult=largest(root);
		System.out.println("Largest number in tree :"+largestResult);
	}

}
