package BinaryTree;

class BinaryTreeBalanced{
	int height;
	boolean isBalanced;
	
	public BinaryTreeBalanced(int height,boolean isBal) {
		
		this.height=height;
		this.isBalanced=isBal;
	}
}

public class CheckBalancedImproved {
	
	public static BinaryTreeBalanced balanced(BinaryTreeNode<Integer> root) {
		
		if( root == null) {
			BinaryTreeBalanced ans= new BinaryTreeBalanced(0, true);
			return ans;
		}
		
		BinaryTreeBalanced leftOutput=balanced(root.left);
		BinaryTreeBalanced rightOutput =balanced(root.right);
		
		int height=1+Math.max(leftOutput.height ,rightOutput.height);
		BinaryTreeBalanced res= new BinaryTreeBalanced(height, true);
		
		if(Math.abs(leftOutput.height - rightOutput.height) > 1)
			res.isBalanced= false;
		
		if(!leftOutput.isBalanced || !rightOutput.isBalanced)
			res.isBalanced=false;
		
		return res;
		
	}
	
	public static void main(String[] args) {
		BinaryTreeUse tree= new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		
		System.out.println("Is balanced :"+balanced(root).isBalanced);
	}

	
}
