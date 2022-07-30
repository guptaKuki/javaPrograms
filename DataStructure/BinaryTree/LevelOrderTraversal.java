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
			int size= que.size();
			ArrayList<Integer> smallans= new ArrayList<Integer>();
			
			while(size-- > 0) {
				BinaryTreeNode<Integer> child=que.remove();
				smallans.add(child.data);
				if(child.left != null)
				   que.offer(child.left);
				if(child.right != null)
				   que.offer(child.right);
			}
			ans.add(smallans);
		}
		 return ans;
	}

	public static void main(String[] args) {
		TakeInputLevelWise input=new TakeInputLevelWise();
		BinaryTreeNode<Integer> root = input.levelWise();
		
		List<ArrayList<Integer>> res= levelWiseTraversal(root);
		
		for(int i=0;i<res.size();i++){
		    System.out.print(res.get(i)+" ");
		} 
	}

}
