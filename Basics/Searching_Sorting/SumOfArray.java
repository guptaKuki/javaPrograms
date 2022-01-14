package Searching_Sorting;

import java.util.Scanner;

public class SumOfArray {
	
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
	
	public static int maximum(int arr1[] , int arr2[]) {
		if(arr1.length >arr2.length)
			return arr1.length;
		else
			return arr2.length;
				
	}
	
	public static int[] sumOfArray( int arr1[] , int arr2[]) {
		int size=maximum(arr1,arr2) + 1;
		int array[] =new int[size];
		
		int i=arr1.length-1,j=arr2.length-1,k=array.length-1;
		int sum=0,carry=0;
		while(i>=0 && j>=0) {
			
			 sum= arr1[i] +arr2[j]+carry;
			 array[k]=sum % 10;
			 carry=sum/10;
			 i--;
			 j--;
			 k--;
		}
		
		while( i>=0) {
			sum=arr1[i] +carry;
			array[k]=sum % 10;
			carry=sum/10;
			i--;
			k--;
		}
		
		while( j>=0) {
			sum=arr2[j] +carry;
			array[k]=sum % 10;
			carry=sum/10;
			j--;
			k--;
		}
		array[0]=carry;
		return array;
	}
	
	public static void printArray(int input[]) {
		for(int i=0; i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		int input1[] = takingInput();
		int input2[] = takingInput();
		int sum[] = sumOfArray(input1,input2);
		printArray(sum);

	}

}
