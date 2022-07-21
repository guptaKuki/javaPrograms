package Queue_Learn;

class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data=data;
	}
}

public class QueueUsingLinkedList<T> {
	
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLinkedList() {
		front=null;
		rear=null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public T front() {
		if(size == 0)
			return null;
		
		return front.data;
	}
	
	public void enqueue(T ele) {
		Node<T> newNode= new Node<T>(ele);
		size++;
		
		if(rear == null) {
			rear=newNode;
			front=newNode;
		}else {
			rear.next=newNode;
			rear=newNode;
		}
	
	}
	
	public T dequeue() {
		if(size == 0)
			return null;
		T temp= front.data;
		size--;
		front=front.next;
		
		if(front == null)
			rear=null;
		
		return temp;
	}
	
	public static void main(String[] args) {
		QueueUsingLinkedList<Integer> qll= new QueueUsingLinkedList<>();
		
		 int array[]= {10,20,30,40,50};
		 for(int x:array)
			 qll.enqueue(x);
		 
		 System.out.println(qll.size());
		 System.out.println(qll.dequeue());
		 System.out.println(qll.front());
	}

}
