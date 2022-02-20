package Recursion;

import java.util.Scanner;

public class CheckNumberArray {
	
	public static boolean checkElement(int arr[], int n) {
		
		if(arr.length ==1) {
			if(arr[0] == n)
				return true;
			else 
				return false;
		}
		int smallans[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallans[i-1]=arr[i];
		}
		
		if(arr[0] == n) {
			return true;
		}else {
			return checkElement(smallans,n);
		}
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
		System.out.println("enter the number ou want to find: ");
		int num=s.nextInt();
		
		boolean check=checkElement(input,num);
		System.out.println(check);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

	}


