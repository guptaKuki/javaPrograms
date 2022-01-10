package Array;

import java.util.Scanner;

public class LargestElement {
	
	public static int[] takingInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=s.nextInt();
		int input[]= new int[size];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static void printArray(int input[]) {
		for(int i=0; i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}

	public static int largestElement(int array[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(max < array[i]) {
				max=array[i];
			}
		}
			return max;
	}

	public static void main(String[] args) {
		int arr[]=takingInput();
		printArray(arr);
		int maximum=largestElement(arr);
		System.out.println("largest Element"+ " "+maximum);
	}

}
