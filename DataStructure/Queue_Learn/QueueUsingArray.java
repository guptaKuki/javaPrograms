package Queue_Learn;

public class QueueUsingArray {
	
	private int data[];
	private int front; //Index of element at the front of the queue.
	private int rear; //Index of element at the rear of the queue.
	private int length;
	
	public QueueUsingArray() {
		data=new int[5];
		front=-1;
		rear=-1;
	}
	
	public QueueUsingArray(int capacity) {
		data=new int[capacity];
		front=-1;
		rear=-1;
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public int front() {
		if(front != -1)
			return data[front];
		else
			return -1;
	}
	
	public void enqueue(int ele) {
		if(rear == -1) {
			data[++rear]=ele;
			front++;
			length++;
		}else {
		  data[++rear]=ele;
		  length++;
		}
	}
	
	public int dequeue() {
		if(length==0)
			return -1;
		else {
			length--;
			return data[front++];
		}
	}
	

	public static void main(String[] args) {
		QueueUsingArray q= new QueueUsingArray(10);
		System.out.println("Size :"+q.size());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println("Size :"+q.size());
		System.out.println("Dequeue front Element : "+q.dequeue());
		System.out.println("Dequeue front Element : "+q.dequeue());
		System.out.println("Dequeue front Element : "+q.dequeue());
		System.out.println("Dequeue front Element : "+q.dequeue());
		System.out.println("Dequeue front Element : "+q.dequeue());
		System.out.println("Dequeue front Element : "+q.dequeue());
		System.out.println("Size :"+q.size());
	}

}
