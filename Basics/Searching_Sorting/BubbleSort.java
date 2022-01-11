package Searching_Sorting;

import java.util.Scanner;

public class BubbleSort {

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
	
	public static int[] bubbleSort( int arr[]) {
		 int i=0 ,end=arr.length;
		 while(i<end) {
			 for( int j=0 ;j<end-1 ;j++) {
				 if( arr[j] > arr[j+1]) {
					 int swap =arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]= swap;
				 }
			 }
			 end--;
		 }
		 return arr;
	}
	
	public static void main(String[] args) {
		int input[]=takingInput();
		int array[]=bubbleSort(input);
		printArray(array);
	}

}
