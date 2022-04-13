package LinkedList;

import java.util.Scanner;

public class ReverseLinkedList {
	
	public static void reverseList(Node<Integer>head){
		Node<Integer> tail=head;
		
		if(tail == null) {
			return;
		}
		
		reverseList(tail.next);
		System.out.print(tail.data+"->");
	
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		NodeCreation ll=new NodeCreation();
		Node<Integer> head=ll.createLinkedListUsingNoOfNode();
		reverseList(head);
	}

}
