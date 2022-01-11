package Searching_Sorting;

import java.util.Scanner;

public class MergeTwoArray {
	
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
	
	public static int[] mergeArray(int arr1[] , int arr2[]) {
		int size=arr1.length + arr2.length;
		int array[] =new int[size];
		
		int i=0,j=0,k=0;
		
		while(i< arr1.length && j<arr2.length) {
			if( arr1[i] <= arr2[j]) {
				array[k]=arr1[i];
				i++;
				k++;
			}else {
				array[k]=arr2[j];
				k++;
				j++;
			}
		}
		
		while( i != arr1.length) {
			array[k]=arr1[i];
			k++;
			i++;
		}
		
		while(j != arr2.length) {
			array[k]=arr2[j];
			k++;
			j++;
		}
		
		return array;
	}


	public static void main(String[] args) {
		int input1[]=takingInput();
		int input2[]=takingInput();
		int mergedArray[] =mergeArray(input1, input2);
		printArray(mergedArray);
	}

}
