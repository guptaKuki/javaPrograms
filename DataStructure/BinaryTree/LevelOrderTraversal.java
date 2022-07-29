package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public static List<ArrayList<Integer>> levelWiseTraversal(BinaryTreeNode<Integer> root){
		
		if(root == null)
			return null;
		
		List<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
		Queue<BinaryTreeNode<Integer>> que= new LinkedList<BinaryTreeNode<Integer>>();
		
		que.offer(root);
		while(! que.isEmpty()) {
			BinaryTreeNode<Integer> child= que.peek();
			int size= que.size();
			ArrayList<Integer> smallans= new ArrayList<Integer>();
			while(size-- > 0) {
				smallans.add(que.poll());
			}
			ans.add(smallans);
			que.offer(child.left);
			que.offer(child.right);
		}
		
	return ans;	
		
	}

	public static void main(String[] args) {
		TakeInputLevelWise input=new TakeInputLevelWise();
		BinaryTreeNode<Integer> root = input.levelWise();
		
		List<ArrayList<Integer>> res= levelWiseTraversal(root);
		
	}

}
