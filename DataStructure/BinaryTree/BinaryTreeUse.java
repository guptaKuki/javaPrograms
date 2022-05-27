package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {
	
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

	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {

		if (root == null)
			return;

		System.out.print(root.data + ":");
		if (root.left != null)
			System.out.print(" L" + root.left.data + " ,");
		if (root.right != null) {
			System.out.print(" R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {

		if (root == null)
			return;

		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {

//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//		root.left = rootLeft;
//		root.right = rootRight;
//
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
//		rootLeft.right = twoRight;
//		rootRight.left = threeLeft;
		
		//BinaryTreeNode<Integer> root=takeInput();
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,true);
		printTreeDetailed(root);
	}

}
