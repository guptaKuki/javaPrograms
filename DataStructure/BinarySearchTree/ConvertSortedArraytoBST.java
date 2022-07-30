package BinarySearchTree;

import BinaryTree.BinaryTreeNode;
import BinaryTree.BinaryTreeUse;

public class ConvertSortedArraytoBST {

	public static BinaryTreeNode<Integer> convert(int array[],int si , int ei){
		if(si>ei)
			return null;
		
		int mid= (si+ei)/2;
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>(array[mid]);
		BinaryTreeNode<Integer> leftchild= convert(array,si,mid-1);
		BinaryTreeNode<Integer> rightchild= convert(array,mid+1,ei);
		root.left=leftchild;
		root.right=rightchild;
		
		return root;
	}
	
	public static void main(String[] args) {
		
		//int array[]= {1,2,3,4,5,6,7};
		int array[]= {10,20,30,40,50,60,70,80};
		BinaryTreeNode<Integer> root= convert(array,0,array.length-1);
		BinaryTreeUse tree = new BinaryTreeUse();
		tree.printTreeDetailed(root);
		
	}

}
