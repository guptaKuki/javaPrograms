package LinkedList;

import java.util.Scanner;

public class EliminateDuplicate {
	
	public static Node<Integer> deleteDuplicate(Node<Integer> head){
		Node<Integer> tail=head;

		while(tail.next != null) {
			if( tail.data == tail.next.data) 
				tail.next=tail.next.next;
			
			tail=tail.next;
		}
		return head;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		NodeCreation ll=new NodeCreation();
		Node<Integer> head=ll.createLinkedList();
		
		Node<Integer> newnode=deleteDuplicate(head);
		ll.printLinkedList(newnode);

	}

}
