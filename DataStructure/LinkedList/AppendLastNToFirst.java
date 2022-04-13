package LinkedList;

import java.util.Scanner;

public class AppendLastNToFirst {
	
	public static Node<Integer> appendNode(Node<Integer>head, int n){
		Node<Integer> tail=head;
		Node<Integer> temp=head;
		int index=0,count=0;
		while(tail.next != null) {
			tail=tail.next;
			count++;
		}
		
		while(index<count-n-1) {
			temp=temp.next;
			index++;
		}
		tail.next=head;;
		head=temp.next;
		temp.next=null;
		
		return head;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		NodeCreation ll=new NodeCreation();
		Node<Integer> head=ll.createLinkedListUsingNoOfNode();
		
		System.out.println("Enter the Value n:");
		int n=sc.nextInt();
		
		Node<Integer> res=appendNode(head,n);
		ll.printLinkedList(res);
	}

}
