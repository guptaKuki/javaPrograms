package Array;

import java.util.Scanner;

public class LinearSearch {
	
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
	
	public static int linearSearch(int arr[],int n) {
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i] == n) {
				  return i;
			  }
		  }
		  return -1;
	}

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);

		int array[]=takingInput();
		printArray(array);
		System.out.println("Enter the number you want to find");
		int n=p.nextInt();
		int index=linearSearch(array,n);
		System.out.println(index);
	}

}
