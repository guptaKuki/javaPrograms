package Stack;

class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data=data;
	}
}

class StackUsingLinkedList<T>{
	private Node<T> head;
	private int size;
	
	StackUsingLinkedList(){
		head= null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size==0)
			return true;
		return false;
	}
	
	public T pop() throws StackEmptyException{
		if (head == null) {
			throw new StackEmptyException();
		}
		T temp=head.data;
		head=head.next;
		size--;
		return temp;
	}
	
	public T top() throws StackEmptyException {
		if (size == 0) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public void push(T element) {
		Node<T> newNode= new Node<T>(element);
		newNode.next=head;
		head=newNode;
		size++;
	}
}

public class StackUse2 {

	public static void main(String[] args) throws StackEmptyException {
		StackUsingLinkedList sll= new StackUsingLinkedList();
		
		sll.push(10);
		sll.push(20);
		sll.push(30);
		System.out.println(sll.top());
		System.out.println(sll.pop());
		System.out.println(sll.top());
		System.out.println(sll.size());
		
		

	}

}
