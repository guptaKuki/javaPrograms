package TwoDimensionalArray;

import java.util.Scanner;

public class LargestRowColumn {
	
	public static int[][] takeInput(){
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows=s.nextInt();
		System.out.println("Enter the number of columns");
		int cols=s.nextInt();
		
		int array[][]=new int[rows][cols];
		// to taking input
		for( int i=0 ;i<rows;i++) {
			for( int j=0;j<cols;j++) {
				System.out.println("Enter the  " + i+j+" "+"value");
				array[i][j]=s.nextInt();
			}
		}
		return array;
	}
	
	public static void largestSum(int arr[][]) {
		
		// for row sum
		int add=Integer.MIN_VALUE;
		int rowindex=0;
		for( int i=0;i<arr.length;i++) {
			int sum=0;
			for( int j=0;j<arr[0].length;j++) {
				sum=sum+arr[i][j];
			}
			if(sum > add) {
				add=sum;
				rowindex=i;
			}
		}
		
		// for column sum
		int summation=Integer.MIN_VALUE;
		int colindex=0;
		for( int i=0;i<arr[0].length;i++) {
			int sum=0;
			for( int j=0;j<arr.length;j++) {
				sum=sum+arr[j][i];
			}
			if( sum > summation) {
				summation=sum;
				colindex=i;
			}
		}
		
		if(add>summation) {
			System.out.println("row "+ rowindex +" "+add);
		}else {
			System.out.println("column "+ colindex +" "+summation);
		}
	}

	public static void main(String[] args) {
		int input[][]=takeInput();
		largestSum(input);

	}

}
