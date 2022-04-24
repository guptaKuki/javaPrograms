package LinkedList;

public class MergeSortOnLinkedList {
	
	public static Node<Integer> midOfList(Node<Integer> head) {
		if(head == null || head.next == null)
			return head;
		
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		
		while(fast.next != null && fast.next.next != null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
	}
	
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
		Node<Integer> head=null , tail=null;
		
		if(head1.data < head2.data) {
			head=head1;
			tail=head1;
			head1=head1.next;
		}else {
			head=head2;
			tail=head2;
			head2=head2.next;
		}
		
		while(head1 != null && head2 != null) {
			if(head1.data <head2.data) {
				tail.next=head1;
				tail=head1;
				head1=head1.next;
				
			}else {
				tail.next=head2;
				tail=head2;
				head2=head2.next;
			}
		}
		
		while(head1 != null) {
			tail.next=head1;
			tail=head1;
			head1=head1.next;
		}
		
		
		while(head2 != null) {
			tail.next=head2;
			tail=head2;
			head2=head2.next;
		}
		return head;
	}

	public static Node<Integer> mergeSort(Node<Integer> head){
		
		if(head == null || head.next == null)
			return head;
		Node<Integer> mid= midOfList(head);
		Node<Integer> fPart=head;
		Node<Integer> sPart=mid.next;
		mid.next=null;
		
		fPart=mergeSort(fPart);
		sPart=mergeSort(sPart);
		Node<Integer>result=merge(fPart,sPart);
		return result;
	}
	
	public static void main(String[] args) {
		NodeCreation ll= new NodeCreation();

		System.out.println("Enter the elements :");
		Node<Integer>head=ll.createLinkedListUsingNoOfNode();
		Node<Integer> result=mergeSort(head);
		
		while(result != null) {
			System.out.print(result.data+" ");
			result=result.next;
		}
	}

}
