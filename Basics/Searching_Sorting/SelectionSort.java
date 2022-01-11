package Searching_Sorting;

import java.util.Scanner;

public class SelectionSort {

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
	
	public static int[] selectionSort(int arr[]) {
		for( int i=0;i<arr.length-1;i++) {
			int temp=i;
			for( int j=i+1; j<arr.length;j++) {
				if(  arr[temp] > arr[j]) 
					temp= j;
			}
			if( temp != i) {
			int swap =arr[i];
			arr[i]= arr[temp];
			arr[temp]=swap;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int input[]=takingInput();
		int array[]=selectionSort(input);
		printArray(array);

	}

}
