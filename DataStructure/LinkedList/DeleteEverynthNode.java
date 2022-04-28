package LinkedList;

import java.util.Scanner;

public class DeleteEverynthNode {
	
	public static Node<Integer>skipNNode(Node<Integer> head, int m,int n){
		
		//corner cases
		if( m==0 || head == null) {
			System.out.println("No element present");
			return null;
		}
		if(n == 0)
			return head;
		
		Node<Integer> temp1=head , temp2=null;
		
		while(temp1 != null ) {
			int c1=1 , c2=1;
			
			while(temp1 != null && c1<m) {
				temp1=temp1.next;
				c1++;
			}
			temp2=temp1.next;
			while(c2<=n && temp2 != null) {
				temp2=temp2.next;
				c2++;
			}
			
			temp1.next=temp2;
			temp1=temp2;	
		}
		return head;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		NodeCreation ll= new NodeCreation();
		Node<Integer> head=ll.createLinkedList();
		System.out.println("Enter the value of m");
		int m=s.nextInt();
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		
		Node<Integer> result=skipNNode(head,m,n);
		while(result != null) {
			System.out.print(result.data+" ");
			result=result.next;
		}
	}

}
