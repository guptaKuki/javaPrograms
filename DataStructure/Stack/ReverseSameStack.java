package Stack;

import java.util.Stack;

public class ReverseSameStack {

	public static void main(String[] args) {
		Stack<Integer> stack= new Stack<>();
		Stack<Integer> helper=new Stack<>();
		
		int arr[]= {5,9,6,3,2,7,1};
		
		for(int ele :arr)
			stack.push(ele);
		reverse(stack,helper);

		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	public static void reverse(Stack<Integer> stack, Stack<Integer> helper) {
		if(stack.size()<=1)
			return;
		int temp=stack.pop();
		reverse(stack,helper);
		while(!stack.isEmpty()) {
			int val=stack.pop();
			helper.push(val);
		}
		helper.push(temp);
		while(!helper.isEmpty()) {
			int value=helper.pop();
			stack.push(value);
		}
	}

}
