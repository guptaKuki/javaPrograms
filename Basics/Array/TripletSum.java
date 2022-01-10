package Array;

import java.util.Scanner;

public class TripletSum {
	
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
	
	public static int tripletSum( int arr[] , int sum) {
		int count=0;
		for( int i=0 ;i< arr.length; i++) {
			for( int j=i+1 ;j<arr.length ;j++) {
				for( int k=j+1;k<arr.length;k++) {
					if( arr[i] +arr[j] + arr[k] == sum) {
						count++;
					}
				}
			}
		}
		return count;
	}


	public static void main(String[] args) {
		Scanner k= new Scanner(System.in);
		int input[]=takingInput();
		System.out.println("enter the value of sum");
		int sum=k.nextInt();
		int count= tripletSum(input ,sum);
		System.out.println(count);

	}

}
