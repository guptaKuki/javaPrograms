package BinaryTree;

public class NodesWithoutSibilings {
	
	public static void printLeaf(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		
		if(root.left == null && root.right != null) {
			System.out.print(root.data+" ");
			return;
		}
		
		if(root.left != null && root.right == null) {
			System.out.print(root.data+" ");
			return;
		}
		
		printLeaf(root.left);
		printLeaf(root.right);
	}
	
	public static void main(String[] args) {
		
		BinaryTreeUse tree = new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		printLeaf(root);
		
	}
}
