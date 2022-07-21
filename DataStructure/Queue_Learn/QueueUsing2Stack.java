package Queue_Learn;

import java.util.Stack;

public class QueueUsing2Stack<T> {
	
	private Stack<T> s1;
    private Stack<T> s2;
	private int size;
	
	public QueueUsing2Stack() {
		s1= new Stack<T>();
		s2= new Stack<T>();
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public T front() {
		if(s1.isEmpty())
			return null;
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		T val=s2.peek();
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return val;
	}
	
	public void enqueue(T elem) {
		s1.push(elem);
		size++;
	}
	
	public T dequeue() {
		if(size == 0)
			return null;
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		T val=s2.pop();
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		size--;
		return val;
		
	}

	public static void main(String[] args) {

		QueueUsing2Stack<Integer> qus = new QueueUsing2Stack<Integer>();
		
		int array[]= {10,20,30,40,50};
		
		for( int x:array)
			qus.enqueue(x);
		
		System.out.println(qus.size());
		System.out.println(qus.front());
		System.out.println("size "+qus.size());
		System.out.println(qus.dequeue());
		System.out.println(qus.dequeue());
		System.out.println(qus.dequeue());
		System.out.println(qus.size());
	}
	
}