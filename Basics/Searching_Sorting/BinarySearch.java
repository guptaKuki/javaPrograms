package Searching_Sorting;

import java.util.Scanner;

public class BinarySearch {
	
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
	
	public static int search ( int arr[] ,int num) {
		int start=0 , end=arr.length;
		
		while(start <= end) {
			 int mid =(start+end)/2;
			 if(num <= arr[mid]) {
				 if(num == arr[mid]) 
					 return mid;
				 else 
					 end= mid;
			 	
			 }else{
				 start = mid+1;
				 }		  
		}
		return -1;
		}
	

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		int array[]=takingInput();
		System.out.println("Enter the number you want to find");
		int num =a.nextInt();	
		int searchednum = search(array, num);
		System.out.println(searchednum);
	}

}
