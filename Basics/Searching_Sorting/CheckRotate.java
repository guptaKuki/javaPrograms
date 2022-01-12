package Searching_Sorting;

import java.util.Scanner;

public class CheckRotate {
	
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
	
	public static int checkRotation( int arr[]) {
		for( int i=0;i<arr.length-1;i++) {
			if( arr[i] >arr[i+1]) {
				return ( i+1);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int input[]=takingInput();
		int number=checkRotation(input);
		System.out.println(number);

	}

}
