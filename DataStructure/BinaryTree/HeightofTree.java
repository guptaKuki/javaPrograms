package BinaryTree;

public class HeightofTree {
	
	public static int treeHeight(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return 0;
		
		int leftHeight = treeHeight(root.left);
		int rightHeight = treeHeight(root.right);
		
		return 1 + Math.max(leftHeight, rightHeight);
	}

	public static void main(String[] args) {
		
		BinaryTreeUse tree= new BinaryTreeUse();
		BinaryTreeNode<Integer> root= tree.takeInputBetter(true, 0, true);
		
		int result = treeHeight(root);
		System.out.println("Height of Tree :"+result);
	}

}
