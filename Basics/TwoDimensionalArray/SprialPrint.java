package TwoDimensionalArray;

import java.util.Scanner;

public class SprialPrint {
	
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
	
	public static void printSprial( int arr[][]) {
		int row=arr.length , col=arr[0].length;
		 int rs=0 , re=row-1;
		 int cs=0, ce=col-1;
		 
		 while(rs <= re) {
			 for(int i= cs ;i<=ce ;i++) {
				 System.out.print(arr[rs][i]+" ");
			 }
			 rs=rs+1;
			 
			 for(int j= rs ;j<=re ;j++) {
				 System.out.print(arr[j][ce]+" ");
			 }
			 ce=ce-1;
			 
			 for( int k=ce; k>=cs;k--) {
				 System.out.print(arr[re][k]+" ");
			 }
			 re= re-1;
			 
			 for( int l=re ;l>=rs ;l--) {
				 System.out.print(arr[l][cs]+" ");
			 }
			 cs= cs+1;
		 }
	}

	public static void main(String[] args) {
		int input[][]=takeInput();
		printSprial(input);

	}

}
