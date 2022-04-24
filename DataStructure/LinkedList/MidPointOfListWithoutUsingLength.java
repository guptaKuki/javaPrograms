package LinkedList;

public class MidPointOfListWithoutUsingLength {

	public static int midOfList(Node<Integer> head) {
		if(head == null || head.next == null)
			return head.data;
		
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		
		while(fast.next != null && fast.next.next != null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast.next.next == null) {
			return slow.next.data;
		}
		return (int)slow.data;
	}
	public static void main(String[] args) {
		NodeCreation ll= new NodeCreation();

		System.out.println("Enter the elements :");
		Node<Integer>head=ll.createLinkedListUsingNoOfNode();
		int result=midOfList(head);
		System.out.println(result);
	}

}
