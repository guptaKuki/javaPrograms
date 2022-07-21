package Queue_Learn;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseKtElement {

	public static void main(String[] args) {

		Queue<Integer> queue= new LinkedList<>();
		
		int array[]= {1,2,3,4,5,6};
		for(int x:array)
			queue.add(x);
		int count=4;
		
		Queue<Integer> temp= new LinkedList<>();
		int flag=count;
		while(flag!=0) {
			temp.add(queue.poll());
			flag--;
		}
		
		queueReverse(temp);
		
		while(queue.size() != 0) {
			temp.add(queue.poll());
		}
		
		for( int ele:temp)
			System.out.print(ele+" ");
	}

	private static void queueReverse(Queue<Integer> queue) {
		
		if(queue.size()==0)
			return;
		
		int val= queue.poll();
		queueReverse(queue);
		queue.add(val);
	}

}
