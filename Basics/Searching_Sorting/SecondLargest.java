package Searching_Sorting;

import java.util.Scanner;

public class SecondLargest {
	
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
	
	public static int secondLargest( int arr[]) {
		int max=arr[0];
		int smax =0;
		for( int i=1;i<arr.length;i++) {
			if( smax <arr[i] && arr[i] != max ) {
				if( max < arr[i]) {
				smax=max;
				max=arr[i];
				}else {
					smax=arr[i];
				}
			}
		}
		return smax;
	}

	public static void main(String[] args) {
		int input[]=takingInput();
		int secondlarge=secondLargest(input);
		System.out.println(secondlarge);

	}

}
