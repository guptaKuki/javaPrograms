package LinkedList;
import java.util.Scanner;
public class DeleteNode {
	
	public static Node<Integer> deleteNode(Node<Integer> head, int x){
		Node<Integer> tail= head;
		if(x == 0) {
			head=tail.next;
			return head;
		}
		int index=0;
		while(tail.data != -1) {
			if(index == x-1) 
				tail.next=tail.next.next;
			tail=tail.next;
			index++;
		}
		return head;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		NodeCreation ll= new NodeCreation();
		Node<Integer> head= ll.createLinkedList();
		System.out.println("Enter the index");
		int x=s.nextInt();
		Node<Integer> newll=deleteNode(head,x);
		ll.printLinkedList(newll);
	}

}
