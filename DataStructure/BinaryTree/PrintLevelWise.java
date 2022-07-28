package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise {
	
	public static void printLevel(BinaryTreeNode<Integer> root) {
			
		Queue<BinaryTreeNode<Integer>> child= new LinkedList<BinaryTreeNode<Integer>>();
		
		if(root == null)
			return;
		
		child.add(root);
		
		while(!child.isEmpty()) {
			BinaryTreeNode<Integer> next= child.remove();
			System.out.print(next.data + ":");
			if(next.left != null) {
				System.out.print("L"+next.left.data);
				child.add(next.left);
			}
				
			if(next.right != null) {
				System.out.print(" , R"+next.right.data);
				child.add(next.right);
			}
			System.out.println();
		}
		
	}


	public static void main(String[] args) {
		
		TakeInputLevelWise tree= new TakeInputLevelWise();
		BinaryTreeNode<Integer> root=tree.levelWise();
		printLevel(root);
	}

	

}
