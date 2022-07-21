package Queue_Learn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	
	public static void queueReverse(Queue<Integer> q) {
		
		if(q.size()==0)
			return;
		
		int val= q.poll();
		queueReverse(q);
		q.add(val);
		
	}

	public static void main(String[] args) {
		
		Queue<Integer> queue= new LinkedList<>();
		
		int array[]= {10,20,30,40,50};
		for( int x:array)
			queue.add(x);
		
	/*	Stack<Integer> s= new Stack<>();
		
		while(!queue.isEmpty())
			s.push(queue.poll());
		
		while(!s.isEmpty())
			queue.add(s.pop()); */
		
		queueReverse(queue);
		
		for(int ele:queue)
			System.out.print(ele+" ");
		
	}

}
