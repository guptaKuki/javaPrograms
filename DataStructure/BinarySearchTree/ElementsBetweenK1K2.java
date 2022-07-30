package BinarySearchTree;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

public class ElementsBetweenK1K2 {
	
	public static void printBetweenK1K2(BinaryTreeNode<Integer> root , int k1 ,int k2) {
		if(root == null)
			return;
		
		if(k1>root.data)
			printBetweenK1K2(root.right, k1, k2);
		else if(k2<root.data)
			printBetweenK1K2(root.left, k1, k2);
		else {
			System.out.print(root.data+" ");
			printBetweenK1K2(root.left, k1, k2);
			printBetweenK1K2(root.right, k1, k2);
		}
	}

	public static void main(String []args) {
	Scanner sc= new Scanner(System.in);
	TakeInputLevelWise input=new TakeInputLevelWise();
	BinaryTreeNode<Integer> root = input.levelWise();
	
	System.out.println("Enter the value of k1 :");
	int k1=sc.nextInt();
	System.out.println("Enter the value of k2 :");
	int k2=sc.nextInt();
	
	printBetweenK1K2(root, k1, k2);
	}
	
}
