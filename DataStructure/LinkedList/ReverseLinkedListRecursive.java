package LinkedList;

public class ReverseLinkedListRecursive {

	public static Node<Integer> reverse(Node<Integer> head){
		if(head == null || head.next.next == null)
			return head;
		
		Node<Integer> newNode=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return newNode;
	}

	public static void print(Node<Integer>head) {
		if(head == null)
			return;
		System.out.print(head.data+" ");
		print(head.next);
	}
	
	public static void main(String[] args) {

		NodeCreation ll=new NodeCreation();
		Node head=ll.createLinkedList();
		
		Node<Integer> result=reverse(head);
		print(result);

	}

}
