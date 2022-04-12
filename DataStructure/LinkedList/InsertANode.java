package LinkedList;
import java.util.Scanner;
public class InsertANode {
	
	public static Node<Integer> insertNode(Node<Integer> head, int x,int data){
		Node<Integer> tail=head;
		Node<Integer> newnode=new Node<>(data);
		if(x==0) {
			newnode.next=head;
			head=newnode;
			return head;
		}
		
		int index=0;
		while(tail.data != -1) {
			if(index == x-1) {
				newnode.next=tail.next;
				tail.next=newnode;
			  }
			tail=tail.next;
			index++;
		}
		return head;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		NodeCreation ll=new NodeCreation();
		Node<Integer> head=ll.createLinkedList();
		System.out.println("enter the index and value :");
		int x=s.nextInt();
		int data= s.nextInt();
		Node<Integer> newll=insertNode(head,x,data);
		ll.printLinkedList(newll);

	}

}
