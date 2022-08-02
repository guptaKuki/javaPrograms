package BinarySearchTree;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

class minMaxBST {
	int min;
	int max;
	boolean isBST;
	
	minMaxBST(){
		min=Integer.MAX_VALUE;
		max=Integer.MIN_VALUE;
		isBST=true;
	}
}

public class IsBST_Improvedsolution {
	
	public static minMaxBST checkBST(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return new minMaxBST();
		
		minMaxBST left=checkBST(root.left);
		minMaxBST right= checkBST(root.right);
		
		minMaxBST ans= new minMaxBST();
		ans.max =Math.max(root.data, Math.max(left.max, right.max));
		ans.min= Math.min(root.data,Math.min(right.min, left.min));
		
		if(left.max > root.data || right.min < root.data)
			ans.isBST=false;
		if(!left.isBST  || ! right.isBST)
			ans.isBST=false;
		
		return ans;
	}


	public static void main(String[] args) {
		TakeInputLevelWise input=new TakeInputLevelWise();
		BinaryTreeNode<Integer> root = input.levelWise();
		
		minMaxBST res= checkBST(root);
		System.out.println("Min :"+res.min +" Max :"+res.max);
		System.out.println("Given tree is BST :"+res.isBST);
	}
}
