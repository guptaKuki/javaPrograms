package Searching_Sorting;

import java.util.Scanner;

public class InsertionSort {

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

	public static int[] insertionSort( int arr[]) {
		 for(int i=1 ;i < arr.length ;i++) {
			 int j=i;
			 while(j>0) {
				 if(arr[j]<arr[j-1]) {
					 int swap= arr[j];
					 arr[j]=arr[j-1];
					 arr[j-1]=swap;
				 }
				 j--;
			 }
		 }
		 return arr;
	}
	
	public static void main(String[] args) {
		int input[]=takingInput();
		int array[]=insertionSort(input);
		printArray(array);

	}

}
