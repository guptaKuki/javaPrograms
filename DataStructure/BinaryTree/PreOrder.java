package BinaryTree;

import java.util.Scanner;

public class PreOrder {
	
	public static void preorderPrint(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		
		System.out.print(root.data+" ");
		preorderPrint(root.left);
		preorderPrint(root.right);
		
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

		BinaryTreeNode<Integer> root = takeInputBetter(true , 0 , true);
		preorderPrint(root);
		}

}
