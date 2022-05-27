package BinaryTree;

import java.util.Scanner;

public class NumberOfNodes {

	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot , int parentData , boolean isLeft){
		if(isRoot) {
		System.out.println("Enter the root data :");
		}else {
			if(isLeft) {
				System.out.println("Enter the left child of "+parentData);
			}else {
				System.out.println("Enter the right child of "+parentData);
			}
		}
		Scanner sc= new Scanner(System.in);
		int data= sc.nextInt();
		
		if(data == -1)
			return null;
		
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>(data);
		BinaryTreeNode<Integer> leftChild= takeInputBetter(false , data , true);
		BinaryTreeNode<Integer> rightchild= takeInputBetter(false , data , false);
		
		root.left=leftChild;
		root.right=rightchild;
		return root;
	}
	
	public static int numNodes(BinaryTreeNode<Integer> root) {
		
		if (root == null)
			return 0;
		
		int leftnode=numNodes(root.left);
		int rightnode=numNodes(root.right);
		return 1 + leftnode + rightnode ;
	}
	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,true);
		int number= numNodes(root);
		System.out.println("Number of nodes "+number);
	}

}
