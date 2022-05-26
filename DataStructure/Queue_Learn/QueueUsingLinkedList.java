package Queue_Learn;

class Node<T> {

	T data;
	Node<T> next;

	Node(T data) {
		data = this.data;
	}
}

class QueueLL<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size;

	QueueLL() {
		front = null;
		rear = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public void enqueue(T elem) {
		size = size + 1;
		Node<T> newNode = new Node<>(elem);

		if (rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = rear.next;
		}
	}

	public T front() {
		if (front == null)
			return null;

		return front.data;
	}

	public T dequeue() {
		if (front == null)
			return null;
		size--;
		T result = front.data;
		front = front.next;

		if (front == null)
			rear = null;

		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}

public class QueueUsingLinkedList {

	public static void main(String[] args) {

		QueueLL<Integer> que = new QueueLL<>();

//		int array[] = { 1, 2, 3, 4, 5, 6 };
//
//		for (int i : array) {
//			que.enqueue(i);
//		}
//		System.out.println(que.front());
//		System.out.println("Size " + que.size());
//
//		while (!que.isEmpty()) {
//			System.out.println(que.dequeue());
//		}

		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		
		System.out.println(que.front());
		
		System.out.println(que.dequeue());
	}

}
