package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue<T> {
	
	private Queue<T> q1;
	private Queue<T> q2;
	private int size;
	
	public StackUsing2Queue() {
		q1= new LinkedList<>();
		q2= new LinkedList<>();
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public T top() {
		while(q1.size()>1) {
			q2.add(q1.poll());
		}
		T val= q1.poll();
		q2.add(val);
		
		Queue<T> temp= q2;
		q2=q1;
		q1=temp;
		
		return val;
	}
	
	public void push(T elem) {
		q1.add(elem);
		size++;
	}

	public T pop() {
		while(q1.size()>1) {
			q2.add(q1.poll());
		}
		T val= q1.poll();
		
		Queue<T> temp= q2;
		q2=q1;
		q1=temp;
		
		size--;
		return val;
	}
	
	
	public static void main(String[] args) {

		StackUsing2Queue<Integer> suq= new StackUsing2Queue<Integer>();
		int array[]= {10,20,30,40,50};
		
		for( int x:array)
			suq.push(x);
		
		System.out.println("size "+suq.size());
		System.out.println("Peek Value "+suq.top());
		System.out.println("Pop "+suq.pop());
		System.out.println("Pop "+suq.pop());
		System.out.println("size "+suq.size());
		suq.push(45);
		System.out.println("Peek Value "+suq.top());
	}

}
