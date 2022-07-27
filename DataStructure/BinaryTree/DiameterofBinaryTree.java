package BinaryTree;

class Pair{
	int height;
	int diameter;
	
	Pair(int height , int diameter){
		this.height=height;
		this.diameter=diameter;
	}
}

public class DiameterofBinaryTree {
	
	public static Pair diameter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			Pair ans= new Pair(0,0);
			return ans;
		}
		
		Pair leftPair= diameter(root.left);
		Pair rightPair = diameter(root.right);
		
		int leftDiameter=leftPair.diameter;
		int rightDiameter= rightPair.diameter;
		
		int dist=1+leftPair.height+rightPair.height;
		int height=Math.max(leftPair.height, rightPair.height)+1;
		
		int dia=Math.max(leftDiameter, Math.max(rightDiameter, dist));
		
		Pair res= new Pair(height,dia);
		return res;
	}

	public static void main(String[] args) {
		BinaryTreeUse tree= new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		
		System.out.println("Diameter of BinaryTree :"+diameter(root).diameter);
		System.out.println("Height of BinaryTree :"+diameter(root).height)
		;
	}

}
