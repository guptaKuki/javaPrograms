package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {
	
	public static BinaryTreeNode<Integer> levelWise(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the root data :");
		int rootData= sc.nextInt();
		
		if(rootData == -1)
			return null;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> child= new LinkedList<BinaryTreeNode<Integer>>();
		
		child.add(root);
		while(!child.isEmpty()) {
			BinaryTreeNode<Integer> next=child.remove();
			System.out.println("Enter the left child of "+next.data);
			int left= sc.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(left);
				next.left=leftChild;
				child.add(leftChild);
			}
			
			System.out.println("Enter the right child of "+next.data);
			int right= sc.nextInt();
			if(right != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(right);
				next.right=rightChild;
				child.add(rightChild);
			}
		}
		
		return root;
	}

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root=levelWise();
		BinaryTreeUse tree= new BinaryTreeUse();
		tree.printTreeDetailed(root);
		
	}

}
