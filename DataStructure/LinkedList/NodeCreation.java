package LinkedList;

import java.util.Scanner;

public class NodeCreation {
	
	public static Node<Integer> createLinkedList(){
		Scanner sc= new Scanner(System.in);
		
		Node<Integer> head=new Node<>(sc.nextInt());
		Node<Integer> tail=head;
		while(tail.data!= -1) {
			tail.next=new Node<Integer>(sc.nextInt());
			tail=tail.next;
		}
		return head;
	}
	
	public static Node<Integer> createLinkedListUsingNoOfNode(){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		Node<Integer> head=new Node<>(sc.nextInt());
		Node<Integer> tail=head;
		for( int i=1;i<n;i++) {
			tail.next=new Node<Integer>(sc.nextInt());
			tail=tail.next;
		}
		return head;
	}
	
	public static void printLinkedList(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head=createLinkedList();
		printLinkedList(head);
	}

}