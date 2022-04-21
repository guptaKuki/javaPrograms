package LinkedList;

public class PrintRecursive {
	
	public static void print(Node<Integer>head) {
		if(head == null)
			return;
		System.out.print(head.data+" ");
		print(head.next);
	}
	

	public static void main(String[] args) {
		NodeCreation ll=new NodeCreation();
		Node head=ll.createLinkedList();
		print(head);

	}

}
