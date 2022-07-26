package BinaryTree;

public class RemoveLeafNode {
	
	public static BinaryTreeNode<Integer>  remove(BinaryTreeNode<Integer> root) {
		if(root == null)
			return null;
		
		if(root.left==null && root.right== null)
			return null;
		
		root.left=remove(root.left);
		root.right=remove(root.right);
		return root;
	}

	public static void main(String[] args) {
		
		BinaryTreeUse tree = new BinaryTreeUse();
		
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		tree.printTreeDetailed(root);
		BinaryTreeNode<Integer>newRoot=remove(root);
		tree.printTreeDetailed(newRoot);
	}

}
