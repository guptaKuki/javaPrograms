package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

class Node2{
	 BinaryTreeNode data;
	 Node2 next;
	 Node2(BinaryTreeNode data){
		 this.data=data;
	 }
}

public class LevelWisetoLL {

	public static Node2 leveltoll(BinaryTreeNode<Integer> root ){
		
		if(root == null)
			return null;
		
		Queue<BinaryTreeNode<Integer>> que= new LinkedList<BinaryTreeNode<Integer>>();
		Node2 head= null;
		Node2 tail= null;
		
		que.offer(root);
		while(! que.isEmpty()) {
			int size =que.size();
			while(size-- >0) {
				BinaryTreeNode<Integer> help=que.poll();
				Node2 newNode =new Node2(help);
				if(head == null) {
					head=newNode;
					tail=newNode;
				}else {
					tail.next=newNode;
					tail=tail.next;
				}
				if(help.left != null)
					que.offer(help.left);
				if(help.right != null)
					que.offer(help.right);
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		TakeInputLevelWise input=new TakeInputLevelWise();
		BinaryTreeNode<Integer> root = input.levelWise();
		
		Node2 head= leveltoll(root);
		
		while(head != null) {
			System.out.print(head.data.data+" ");
			head=head.next;
		}
		
	}

}
