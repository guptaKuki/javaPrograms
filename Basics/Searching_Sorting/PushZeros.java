package Searching_Sorting;

import java.util.Scanner;

public class PushZeros {
	
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

	public static int[] pushZero( int arr[]) {
		int i=0 , j=arr.length-1;
		while(i<=j) {
			if(arr[i] == 0) {
				if(arr[j] !=0) {
					int swap =arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
					i++;
					j--;
				}else {
					j--;
				}
			}else {
				i++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int input[]=takingInput();
		int sortedArray[]=pushZero(input);
		printArray(sortedArray);
	}

}
