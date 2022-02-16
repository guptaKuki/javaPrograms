package Recursion;

import java.util.Scanner;

public class CheckSorted {
	
	public static boolean checkArray( int arr[]) {
		if( arr.length == 1)
			return true;
		int smallarr[]=new int[arr.length-1];
		for( int i=1;i<arr.length;i++) {
			smallarr[i-1]=arr[i];
		}
		boolean flag= checkArray(smallarr);
		if(!flag)
			return false;
		
		if(arr[0] <= arr[1])
			return true;
		else
			return false;
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
			
		
			boolean check=checkArray(input);
			System.out.println(check);
			
			}catch(Exception e) {
				System.out.println(e);
			}
			
	}

}
