package LinkedList;
import java.util.Scanner;

public class FindANode {
	
	public static int nodeIndex(Node<Integer> head , int data) {
		
		Node<Integer> tail = head;
		int index=0;
		while(tail.data != -1) {
			if(tail.data == data) 
				return index;
			tail=tail.next;
			index++;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		NodeCreation ll= new NodeCreation();
		Node<Integer> head=ll.createLinkedList();
		
		System.out.println("Enter the number :");
		int data=sc.nextInt();
		int index=nodeIndex(head,data);
		System.out.println(index);
	}

}
