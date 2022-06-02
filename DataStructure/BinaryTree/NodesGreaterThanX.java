package BinaryTree;

import java.util.Scanner;

public class NodesGreaterThanX {
	
	public static int greaterthanX(BinaryTreeNode<Integer> root , int x) {
		
		if(root == null)
			return 0;
		
		int greaterLeft = greaterthanX(root.left ,x);
		int greaterRight = greaterthanX(root.right ,x);
		
		if(root.data > x)
			return 1+greaterLeft+greaterRight ;
		else
			return greaterLeft + greaterRight ;
	}

	public static void main(String[] args) {
		
		BinaryTreeUse tree=new BinaryTreeUse();
		BinaryTreeNode<Integer> root= tree.takeInputBetter(true, 0, true);
		
		System.out.println("Enter the Number which you want to compare with :");
		Scanner s= new Scanner(System.in);
		int x = s.nextInt();		
		int greaterNode = greaterthanX(root ,x);
		System.out.println("Number of Nodes Greater than "+x+" :"+greaterNode);
	}

}
