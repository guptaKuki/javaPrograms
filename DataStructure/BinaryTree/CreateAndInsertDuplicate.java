package BinaryTree;

public class CreateAndInsertDuplicate {

	public static void duplicate(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return ;
		
		BinaryTreeNode<Integer> newNode=new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> leftChild=root.left;
		
		root.left=newNode;
		newNode.left=leftChild;
		
		duplicate(newNode.left);
		duplicate(root.right);
	}

	public static void main(String[] args) {
		
		BinaryTreeUse tree= new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		
		duplicate(root);
		tree.printTreeDetailed(root);
	}

}
