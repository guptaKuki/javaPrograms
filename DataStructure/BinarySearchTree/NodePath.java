package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BinaryTree.BinaryTreeNode;
import BinaryTree.BinaryTreeUse;

public class NodePath {

	public static List<Integer> pathNode(BinaryTreeNode<Integer> root , int x){
		if(root == null)
			return null;
		
		if(root.data == x) {
			List<Integer> list= new ArrayList<Integer>();
			list.add(root.data);
			return list;
		}
		
		if(x<root.data) {
			List<Integer> left= pathNode(root.left ,x);
			if(left != null) {
				left.add(root.data);
				return left;
			}
		}else {
			List<Integer> right =pathNode(root.right ,x);
			if(right != null) {
				right.add(root.data);
				return right;
			}
		}
		
		return null;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		BinaryTreeUse tree= new BinaryTreeUse();
		BinaryTreeNode<Integer> root = tree.takeInputBetter(true, 0, true);
		System.out.println("Enter the value for that you want a path :");
		int val= sc.nextInt();
		List<Integer> ans= pathNode(root,val);
		for(int i:ans)
			System.out.print(i+" ");
		
		sc.close();
	}

}
