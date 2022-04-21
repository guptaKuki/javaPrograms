package LinkedList;

import java.util.Scanner;

public class InsertRecursive {

	public static Node<Integer> insert(Node<Integer> head , int index , int value){
		
		if(head==null && index>0)
			return head;
		
		if(index == 0) {
			Node<Integer> newNode= new Node<>(value);
			newNode.next=head;
			return newNode;
		}
		
//		Node<Integer> temp=insert(head.next ,index-1,value);
//	    head.next=temp;
		head.next=insert(head.next ,index-1,value);
	    return head;
	}
	

	public static void print(Node<Integer>head) {
		if(head == null)
			return;
		System.out.print(head.data+" ");
		print(head.next);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		NodeCreation ll=new NodeCreation();
		Node head=ll.createLinkedList();
		System.out.println("Enter the value");
		int value=sc.nextInt();
		System.out.println("Enter the index");
		int index= sc.nextInt();
		Node<Integer> result=insert(head,index,value);
		print(result);
	}

}
