package BinarySearchTree;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

public class LCA_of_BST {
	
	public static BinaryTreeNode<Integer> lca(BinaryTreeNode<Integer> root , BinaryTreeNode<Integer> p,BinaryTreeNode<Integer> q){
		
		if(root == null)
			return null;
		
		if(root.data >p.data && root.data >q.data)
			return lca(root.left,p,q);
		if(root.data < p.data && root.data <q.data)
		    return lca(root.right,p,q);
		
		return root;
	}

	public static void main(String[] args) {
		TakeInputLevelWise input=new TakeInputLevelWise();
		BinaryTreeNode<Integer> root = input.levelWise();
		BinaryTreeNode<Integer> p=new BinaryTreeNode<Integer>(5);
		BinaryTreeNode<Integer> q=new BinaryTreeNode<Integer>(9);
		BinaryTreeNode<Integer> ans= lca(root,p,q);
		System.out.println("LCA Node :"+ans.data);
	}
}
