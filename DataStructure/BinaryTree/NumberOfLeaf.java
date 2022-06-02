package BinaryTree;

public class NumberOfLeaf {
	
	public static int numOfLeaves(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null)
			return 1;
		
		return numOfLeaves(root.left) + numOfLeaves(root.right);
	}

	public static void main(String[] args) {

		BinaryTreeUse tree = new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		
		System.out.println("Number of leaves in tree :"+ numOfLeaves(root));
	}

}
