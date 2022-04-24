package LinkedList;

public class MergeTwoSortedList {
	
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

	public static void main(String[] args) {
		NodeCreation ll1= new NodeCreation();
		NodeCreation ll2= new NodeCreation();


		System.out.println("Enter the elements of list 1 :");
		Node<Integer>head1=ll1.createLinkedListUsingNoOfNode();
		
		System.out.println("Enter the elements of list 2:");
		Node<Integer>head2=ll2.createLinkedListUsingNoOfNode();

		Node<Integer> result=merge(head1,head2);
		
		while(result != null) {
			System.out.print(result.data+" ");
			result=result.next;
		}
	}

}
