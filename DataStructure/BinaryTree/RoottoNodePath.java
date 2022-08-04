package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoottoNodePath {
	
	public static List<Integer> path(BinaryTreeNode<Integer> root , int x){
		if(root == null)
			return null;
		
		if(root.data == x) {
			List<Integer> list= new ArrayList<Integer>();
			list.add(root.data);
			return list;
		}
		
		List<Integer> left= path(root.left ,x);
		if(left != null) {
			left.add(root.data);
			return left;
		}
		List<Integer> right =path(root.right ,x);
		if(right != null) {
			right.add(root.data);
			return right;
		}
		
		return null;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		BinaryTreeUse tree= new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		System.out.println("Enter the value for that you want a path :");
		int val= sc.nextInt();
		List<Integer> ans= path(root,val);
		for(int i:ans)
			System.out.print(i+" ");
		
		sc.close();
	}

}
