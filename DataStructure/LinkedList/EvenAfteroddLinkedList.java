package LinkedList;

public class EvenAfteroddLinkedList {
	
	public static Node<Integer> evenOdd(Node<Integer> head){
		Node<Integer> oddH=null , oddT= null;
		Node<Integer> evenH=null , evenT= null;
		
		if( head == null || head.next.data == -1)
			return head;
		
		//For first element
		if( head.data % 2 == 0) {
			evenH=head;
			evenT=head;
			head=head.next;
		}else {
			oddH=head;
			oddT=head;
			head=head.next;
		}
		
		//Divided into two linked list
		while(head.data != -1) {
			if((head.data % 2) == 0) {
				if(evenH == null) {
					evenH=head;
					evenT=head;
				
				}else {
					evenT.next=head;
					evenT=evenT.next;
				}
				head=head.next;
			}else {
				if(oddH == null) {
					oddH=head;
					oddT=head;
				
				}else {
					oddT.next=head;
					oddT=oddT.next;
				}
				head=head.next;
			}		
		}
		
		if(oddH == null)
			return evenH;
		else {
			evenT.next=null;
			oddT.next=null;
			oddT.next=evenH;
			return oddH;
		}
		
	}

	public static void main(String[] args) {
		NodeCreation ll= new NodeCreation();
		Node<Integer> head=ll.createLinkedList();
		
		Node<Integer> result=evenOdd(head);
		while(result != null) {
			System.out.print(result.data+" ");
			result=result.next;
		}
	}

}
