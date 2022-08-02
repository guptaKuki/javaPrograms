package BinarySearchTree;

import java.util.LinkedList;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

class LLNode{
	LinkedList<Integer> head;
	LinkedList<Integer> tail;
	
	LLNode(){
		head=null;
		tail=null;
	}
}


public class BST_to_LL {
/*	
	public static LLNode convertBSTtoLL(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return new LLNode();
		
		LinkedList<Integer> help=new LinkedList<>(root.data);
		LLNode left=convertBSTtoLL(root.left);
		LLNode right=convertBSTtoLL(root.right);
		
		if()
	}
*/
	public static void main(String[] args) {
		TakeInputLevelWise input=new TakeInputLevelWise();
		BinaryTreeNode<Integer> root = input.levelWise();
		
	}

}
