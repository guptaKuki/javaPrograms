package Recursion;

import java.util.Scanner;

public class SumofElements {
	
	public static int sumArray(int arr[]) {
		if( arr.length == 1)
			return arr[0];
		
		int smallans[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallans[i-1]=arr[i];
		}
		int sum=arr[0]+sumArray(smallans);
		
		return sum;
		
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		
		try {
		int size= s.nextInt();
		int input[] = new int[size];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			input[i]=s.nextInt();
		}
		
		int sum=sumArray(input);
		System.out.println(sum);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
