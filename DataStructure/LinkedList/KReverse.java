package LinkedList;

import java.util.Scanner;

public class KReverse {
	
	public static Node<Integer> reverse(Node<Integer> head){
		if(head == null || head.next.next == null)
			return head;
		
		Node<Integer> newNode=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return newNode;
	}
	
	//NOT COMPLETED
	public static Node<Integer> kReverseList(Node<Integer> head , int index){
		
		if(head == null || index== 0)
			return head; 
		Node<Integer> h1=head, t1= head;
		int count=1;
		while(count <= index) {
			t1=t1.next;
			count++;
		}
		Node<Integer> h2=t1.next;
		t1=h1;
		Node<Integer> newh1=reverse(h1);
		return head;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		NodeCreation ll=new NodeCreation();
		Node<Integer> head=ll.createLinkedListUsingNoOfNode();
		System.out.println("enter the index value");
		int index= sc.nextInt();
		Node<Integer> result=kReverseList(head,index);
		while(result != null) {
			System.out.print(result.data+" ");
			result=result.next;
		}
	}
}
