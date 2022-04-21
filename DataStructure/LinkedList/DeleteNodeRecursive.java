package LinkedList;

import java.util.Scanner;

public class DeleteNodeRecursive {
	
	public static Node<Integer> delete(Node<Integer> head, int index){
		
		if(head== null && index>0)
			return head;
		
		if(index==0) {
			return head.next;
		}
		
		head.next=delete(head.next,index-1);
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
		
		System.out.println("Enter the index you want to delete");
		int index= sc.nextInt();
		Node<Integer> result=delete(head,index);
		print(result);
	}

}
