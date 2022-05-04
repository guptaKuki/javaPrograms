package Stack;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		
		Stack<Integer> stack= new Stack<>();
		
		int arr[]= {5,9,6,3,2,7,1};
		
		for(int ele :arr)
			stack.push(ele);
		
		System.out.println("Top of stack :"+stack.peek());

		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
