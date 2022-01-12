package Searching_Sorting;

import java.util.Scanner;

public class RotateArray {
	
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
	
	public static int[] rotateArray( int arr[] , int num) {
		int i=0;
		while(i<num) {
			int temp=arr[0];
			for( int j=1 ;j<arr.length;j++) {
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
			i++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int input[]=takingInput();
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the number of rotation");
		int rotate= k.nextInt();
		int array[]=rotateArray(input ,rotate);
		printArray(array);

	}

}
