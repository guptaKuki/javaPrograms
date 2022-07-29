package BinaryTree;

class PairMinMax{
	int min;
	int max;
	
	PairMinMax(){
		min=Integer.MAX_VALUE;
		max=Integer.MIN_VALUE;
	}
}

public class MinimunAndMaximum {
	
	public static PairMinMax minMax(BinaryTreeNode<Integer> root) {
		if(root == null)
			return new PairMinMax();
		
		PairMinMax left=minMax(root.left);
		PairMinMax right=minMax(root.right);
		
		int min= Math.min(root.data, Math.min(left.min, right.min));
		int max= Math.max(root.data, Math.max(left.max, right.max));
		
		PairMinMax p= new PairMinMax();
		p.min=min;
		p.max=max;
		
		return p;
	}

	public static void main(String[] args) {
		BinaryTreeUse tree= new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		
		PairMinMax res= minMax(root);
		System.out.println("Minimum value :"+res.min);
		System.out.println("Maximum value :"+res.max);
	}

}
