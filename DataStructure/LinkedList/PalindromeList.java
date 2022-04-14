package LinkedList;

import java.util.Scanner;

public class PalindromeList {
	

	public static int lengthLL(Node<Integer> head) {
		Node<Integer> temp=head;
		int count=0;
		while(temp != null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public static Node<Integer> reverseList(Node<Integer>head){
		Node<Integer> tail=head;
		Node<Integer> prev=null;
		Node<Integer> fwd=null;
		
		while(tail != null) {
			fwd=tail.next;
			tail.next=prev;
			prev=tail;
			tail=fwd;
		}
		
		return prev;
	}
	
	public static boolean compareLinkedList(Node<Integer> node ,Node<Integer>newNode) {
		
		
		
		while( newNode != null) {
			if(node.data == newNode.data){
				node=node.next;
				newNode=newNode.next;
			}
			else
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		NodeCreation ll=new NodeCreation();
		Node<Integer> head=ll.createLinkedListUsingNoOfNode();
		
		int length=lengthLL(head);
		int index=0;
		Node<Integer> head2=head;
		while(index<=length/2) {
			head2=head2.next;
			index++;
		}
		Node<Integer> newNode=reverseList(head2);
		 boolean check=compareLinkedList(head,newNode);
		 System.out.println(check);
		

	}

}
