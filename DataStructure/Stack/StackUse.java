package Stack;

class StackUsingArray {
	private int data[];
	private int topIndex; // Index of top most element

	public StackUsingArray() {
		data = new int[2];
		topIndex = -1;
	}

	public int size() {
		return topIndex + 1;
	}

//	public void push(int element) throws StackFullException {
//		
//		if(topIndex == data.length) {
//			throw new StackFullException();
//		}
//		data[++topIndex]=element;
//	}

	public void push(int element) {

		if (topIndex == data.length-1) {
			doubleCapacity();
		}

		data[++topIndex] = element;
	}

	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];

		for (int i=0;i< temp.length;i++) {
			data[i] = temp[i];
		}
		
	}

	public int pop() throws StackEmptyException {
		if (topIndex == -1) {
			throw new StackEmptyException();
		}
		int temp = data[topIndex--];
		return temp;
	}

	public int top() throws StackEmptyException {
		if (topIndex == -1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
	}

	public boolean isEmpty() {
		if (topIndex == -1)
			return true;
		else
			return false;
	}
}

public class StackUse {

	public static void main(String[] args) throws StackEmptyException {

		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
//		System.out.println(stack.top());
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
		
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());

	}

}
