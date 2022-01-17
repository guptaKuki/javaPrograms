package TwoDimensionalArray;

import java.util.Scanner;

public class TotalSumOnBoundaries {
	
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
	
	public static int totalSum(int arr[][]) {
		
		//Boundaries Sum
		int i=0;
		int sum=0;
		while( i < arr.length) {
			if(i == 0 || i == arr.length-1) {
				for( int j=0 ;j<arr[i].length ;j++) {
				sum= sum+arr[i][j];
				}
			}
			if( i > 0 && i < arr[i].length-1) {
				int k=arr[0].length-1;
				sum =sum+arr[i][0] +arr[i][k];
			}
			i++;
		}
		System.out.println(sum);
		
		//Diagonal Sum
		int row=arr.length, col=arr[0].length;
		int r=1;
		while(r<row-1) {
			int c=1;
			while(c<col-1) {
			if( r == c) {
				sum=sum+arr[r][c];
			}
			if(r+c == row-1) {
				sum=sum+arr[r][c];
			}
			c++;
		}
			r++;
		}
	
		
		return sum;
	}

	public static void main(String[] args) {
		int input[][] =takeInput();
		int l=input.length;
		int totalsum=totalSum(input);
		if( l % 2 != 0) {
			totalsum = totalsum-input[l/2][l/2];
		}
		System.out.println(totalsum);
	}

}
