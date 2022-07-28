package BinaryTree;

public class ConstructTreeUsingInorderAndPreorder {
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int []preOrder , int preStart , int preEnd , int []inOrder , int inStart , int inEnd){
		
		if(inStart>inEnd || preStart>preEnd)
			return null;
		
		int val=preOrder[preStart];
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>(val);
		
		int index=-1;
		for( int i=inStart;i<=inEnd;i++) {
			if(val == inOrder[i]) {
				index=i;
				break;
			}
		}
		
		int inStartright=index+1;
		int inEndright=inEnd;
		int inStartleft=inStart;
		int inEndleft=index-1;
	
		
		int preEndright=preEnd;
		int preStartleft=preStart+1;
		
		int leftSubTree=inEndleft-inStartleft+1;
		int preEndleft=preStartleft+leftSubTree-1;
		int preStartright=preEndleft+1;
		
		BinaryTreeNode<Integer> leftchild= buildTreeHelper(preOrder, preStartleft, preEndleft, inOrder, inStartleft, inEndleft);
		BinaryTreeNode<Integer> rightchild=buildTreeHelper(preOrder, preStartright, preEndright, inOrder, inStartright, inEndright);
		
		root.left=leftchild;
		root.right=rightchild;
		
		return root;
	}
	public static BinaryTreeNode<Integer> buildTree(int []preOrder , int []inOrder){
		BinaryTreeNode<Integer> root = buildTreeHelper(preOrder,0,preOrder.length-1 , inOrder ,0,inOrder.length-1);
		return root;
	}

	public static void main(String[] args) {
		
		BinaryTreeUse tree= new BinaryTreeUse();
		int []inOrder= {4,2,5,1,6,3,7};
		int []preOrder= {1,2,4,5,3,6,7};
		
		BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder);
		tree.printTreeDetailed(root);
		
	}

}
