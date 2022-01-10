package Array;

import java.util.Scanner;

public class ArraySum {
	
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
	
	public static int sumOfArray(int arr[]) {
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int array[]=takingInput();
		System.out.println("Sum of array: "+ " "+sumOfArray(array));

	}

}
