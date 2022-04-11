package LinkedList;
import java.util.Scanner;
public class LengthofLinkedListed {
	
	public static Node<Integer> createLinkedList(){
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
	
	
	public static int lengthLL(Node<Integer> head) {
		Node<Integer> temp=head;
		int count=0;
		while(temp != null) {
			count++;
			temp=temp.next;
		}
		return count;
	}

	public static void main(String[] args) {
		Node<Integer> head=createLinkedList();
		int res= lengthLL(head);
		System.out.println(res);

	}

}
