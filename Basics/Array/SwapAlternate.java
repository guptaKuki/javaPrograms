package Array;

import java.util.Scanner;

public class SwapAlternate {
	
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
	
	public static int[] swapAlternate(int arr[]) {
	   
	   int n=arr.length;
	   
	   for(int i=0 ;i<n-1;i=i+2) {
		   int temp=arr[i];
		   arr[i]=arr[i+1];
		   arr[i+1] = temp;
	   }
	   return arr;
	}

	public static void main(String[] args) {
		int array[]=takingInput();
		int arr[]= swapAlternate(array);
		printArray(arr);
	}

}
