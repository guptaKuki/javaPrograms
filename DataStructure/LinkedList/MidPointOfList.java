package LinkedList;

public class MidPointOfList {
	
	public static int midPoint(Node<Integer> head) {
		Node<Integer> tail=head;
		int count=0;
		while(tail.data != -1) {
			count++;
			tail=tail.next;
		}
		int mid=count/2;
		Node temp=head;
		while(mid>0){
			temp=temp.next;
			mid--;
		}
		
		return  (int) temp.data;
	}

	public static void main(String[] args) {
		NodeCreation ll= new NodeCreation();
		Node<Integer>head=ll.createLinkedList();
		int result=midPoint(head);
		System.out.println(result);
	}

}
