package TwoDimensionalArray;

import java.util.Scanner;

public class RowWiseSum {
	
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
	
	public static void rowWiseSum(int arr[][]) {

		for( int i=0;i<arr.length;i++) {
			int sum=0;
			for( int j=0;j<arr[0].length;j++) {
				sum=sum+arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}

	public static void main(String[] args) {
		int input[][]=takeInput();
		rowWiseSum(input);

	}

}
