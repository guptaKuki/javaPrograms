package LinkedList;

//class Node<T>{
//	T data;
//	Node<T> next;
//	
//	Node(T data){
//		this.data=data;
//	}
//}
public class IncrementElement {
	
	public static void increment(Node<Integer> head){
		Node<Integer> temp=head;
		while(temp != null) {
			temp.data++;
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		Node<Integer> head=ll.createLinkedList();
		increment(head);
		ll.print(head);
	}

}
