package BinaryTree;

public class IsBinaryTreeBalanced {
	
	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		
		return 1+Math.max(height(root.left) , height(root.right));
	}
	
	public static boolean balanced(BinaryTreeNode<Integer> root) {
		if(root == null)
			return true;
		
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		
		if(Math.abs(leftHeight - rightHeight) >1)
			return false;
		return balanced(root.left) && balanced(root.right);
	}

	public static void main(String[] args) {
		BinaryTreeUse tree= new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		boolean flag= balanced(root);
		System.out.println("Is Binary Tree balanced :"+flag);
	}

}
