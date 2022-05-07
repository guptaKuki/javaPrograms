package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
	
	public static int[] span(int arr[]) {
		Stack stack= new Stack();
		int result[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(stack.isEmpty()) {
				stack.push(i);
				result[i]=i+1;
			}
			else {
				if(arr[i] <= arr[i-1]) {
					stack.push(i);
					result[i]=1;
				}else{
					int count=0;
					while( !stack.isEmpty()&& arr[i]>(int)stack.peek()) {
						stack.pop();
						count++;
					}
					if(stack.isEmpty())
						result[i]=i+1;
					else
						result[i]=count+1;
					stack.push(i);
				}
					
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=s.nextInt();
		int input[]= new int[size];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			input[i]=s.nextInt();
		}
		 int result[]=span(input);
		 for(int j:result)
			 System.out.println(j);
		

	}

}
