package BinaryTree;

public class MirrorBinaryTree {
	
	public static void mirror(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		
		mirror(root.left);
		mirror(root.right);
		
		BinaryTreeNode<Integer> temp= root.left;
		root.left=root.right;
		root.right=temp;
		return ;
		
	}
	
	public static void main(String[] args) {
		
		BinaryTreeUse tree = new BinaryTreeUse();
		
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		mirror(root);
		tree.printTreeDetailed(root);
	}
}
