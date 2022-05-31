package BinaryTree;

import java.util.Scanner;

public class SumOfNodes {
	
	public static int sum(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return 0;
		
		int leftSum=sum(root.left);
		int rightSum=sum(root.right);
		
		return leftSum + rightSum + root.data;
	}

	public static BinaryTreeNode<Integer> takeInput(){
		System.out.println("Enter the root data :");
		Scanner sc= new Scanner(System.in);
		int data= sc.nextInt();
		
		if(data == -1)
			return null;
		
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>(data);
		BinaryTreeNode<Integer> leftChild= takeInput();
		BinaryTreeNode<Integer> rightchild= takeInput();
		
		root.left=leftChild;
		root.right=rightchild;
		return root;
	}
	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root= takeInput();
		
		int resultSum = sum(root);
		System.out.println("Result :"+resultSum);
	}

}
