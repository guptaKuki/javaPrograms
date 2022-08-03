package BinarySearchTree;

import java.util.LinkedList;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data=data;
	}
}

class LLNode{
	Node<Integer> head;
	Node<Integer> tail;
	
	LLNode(){
		head= null;
		tail=null;
	}
}


public class BST_to_LL {

	public static Node<Integer> BSTtoLL(BinaryTreeNode<Integer> root){
		if(root == null)
			return null;
		
		if(root.left == null  && root.right == null) {
			return new Node<Integer>(root.data);
		}
		
		LLNode pair= BSTtoLLhelper( root );
		
		return pair.head;
	}
	
	public static LLNode BSTtoLLhelper(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return null;
		
		Node<Integer> head= null;
		Node<Integer> tail= null;
		
		LLNode leftpair=BSTtoLLhelper(root.left);
		
		if(leftpair != null) {
			head= leftpair.head;
			leftpair.tail.next=new Node<Integer>(root.data);
			tail=leftpair.tail.next;
		}else {
			head= new Node<Integer>(root.data);
			tail=head;
		}
		
		LLNode rightpair= BSTtoLLhelper(root.right);
		
		if(rightpair != null) {
			tail.next=rightpair.head;
			tail=rightpair.tail;
		}
		
		LLNode ll= new LLNode();
		ll.head=head;
		ll.tail=tail;
		return ll;
	}

	public static void main(String[] args) {
		TakeInputLevelWise input=new TakeInputLevelWise();
		BinaryTreeNode<Integer> root = input.levelWise();
		Node<Integer> node= BSTtoLL(root);
		
		while(node != null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
	}

}
