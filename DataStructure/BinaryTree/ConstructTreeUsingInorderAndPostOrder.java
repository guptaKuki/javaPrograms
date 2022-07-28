package BinaryTree;

public class ConstructTreeUsingInorderAndPostOrder {
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int []postOrder , int postStart , int postEnd , int []inOrder , int inStart , int inEnd){
		
		if(inStart>inEnd || postStart>postEnd)
			return null;
		
		int val=postOrder[postEnd];
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>(val);
		
		int index=-1;
		for( int i=inStart;i<=inEnd;i++) {
			if(val == inOrder[i]) {
				index=i;
				break;
			}
		}
		
		int inStartright=index+1;;
		int inEndright=inEnd;
		int inStartleft=inStart;
		int inEndleft=index-1;
	
		
		int postEndright=postEnd-1;
		int postStartleft=postStart;
		
		int leftSubTree=inEndleft-inStartleft+1;
		int postEndleft=postStartleft+leftSubTree-1;
		int postStartright=postEndleft+1;
		
		BinaryTreeNode<Integer> leftchild= buildTreeHelper(postOrder, postStartleft, postEndleft, inOrder, inStartleft, inEndleft);
		BinaryTreeNode<Integer> rightchild=buildTreeHelper(postOrder, postStartright, postEndright, inOrder, inStartright, inEndright);
		
		root.left=leftchild;
		root.right=rightchild;
		
		return root;
	}
	public static BinaryTreeNode<Integer> buildTree(int []postOrder , int []inOrder){
		BinaryTreeNode<Integer> root = buildTreeHelper(postOrder,0,postOrder.length-1 , inOrder ,0,inOrder.length-1);
		return root;
	}

	public static void main(String[] args) {
		
		BinaryTreeUse tree= new BinaryTreeUse();
		int []inOrder= {4,2,5,1,6,3,7};
		int []postOrder= {4,5,2,6,7,3,1};
		
		BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder);
		tree.printTreeDetailed(root);
		
	}

}
