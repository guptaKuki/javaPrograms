package LinkedList;

import java.util.Scanner;

public class FindNodeRecursive {
	
	public static int find(Node<Integer> head, int data) {
		if( head == null )
			return -1;
		if(head.data.equals(data))
			return 0;
		
		int value=find(head.next,data);
		
		if(value == -1)
			return -1;
		return value+1;
			
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		NodeCreation ll= new NodeCreation();
		Node<Integer> head=ll.createLinkedList();
		
		System.out.println("Enter the number :");
		int data=sc.nextInt();
		int index=find(head,data);
		System.out.println(index);
	}

}
