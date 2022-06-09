package ErrorDetection;

import java.util.Scanner;

public class _2DParityCheckerSender {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the dimension of data row and column respectively:");
		int m=sc.nextInt();
		int n= sc.nextInt();
		char c[][]= takeInput(m,n);
		
		for( int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Which way do you want to send data : 1. Odd Parity  2. Even Parity");
		int choice=sc.nextInt();
		if( choice == 1)
			OddParity(c,m+1,n+1);
		else
			EvenParity(c,m+1,n+1);
	}

	private static void EvenParity(char[][] c, int m, int n) {
		
		for(int i=0 ;i<m-1;i++) {
			int count=0;
			for(int j=0;j<n-1;j++) {
				if(c[i][j] == '1')
					count++;
			}
			if(count%2 !=0)
				c[i][n-1]='1';
			else
				c[i][n-1]='0';
		}
		
		for(int j =0 ;j<n-1 ;j++) {
			int count=0;
			for(int i=0;i<m-1;i++) {
				if(c[i][j] == '1')
					count++;
			}
			if(count % 2 != 0)
				c[m-1][j]='1';
			else
				c[m-1][j]='0';
		}
		
		int count=0;
		for( int i=0;i<n-1;i++) {
			 if(c[m-1][i] == '1')
				 count++;
		}
			 if(count%2 == 0)
				 c[m-1][n-1]='0';
			 else
				 c[m-1][n-1] ='1';
		 
		
		System.out.println("Message sent to be :");
		for( int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
		
	}


	private static void OddParity(char[][] c, int m, int n) {
	   

		for(int i=0 ;i<m-1;i++) {
			int count=0;
			for(int j=0;j<n-1;j++) {
				if(c[i][j] == '1')
					count++;
			}
			if(count%2 !=0)
				c[i][n-1]='0';
			else
				c[i][n-1]='1';
		}
		
		for(int j =0 ;j<n-1 ;j++) {
			int count=0;
			for(int i=0;i<m-1;i++) {
				if(c[i][j] == '1')
					count++;
			}
			if(count % 2 != 0)
				c[m-1][j]='0';
			else
				c[m-1][j]='1';
		}
		
		int count=0;
		 for( int i=0;i<n-1;i++) {
			 if(c[m-1][i] == '1')
				 count++;
		 }
			 if(count%2 == 0)
				 c[m-1][n-1]='1';
			 else
				 c[m-1][n-1] ='0';
		 
		
		System.out.println("Message sent to be :");
		for( int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
		
	}
	
	
	private static char[][] takeInput(int m, int n) {
		Scanner s = new Scanner(System.in);
		char c[][]= new char[m+1][n+1];
		System.out.println("Enter the input :");
		for( int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				c[i][j]=s.next().charAt(0);
			}
			System.out.println();
		}
		return c;
	}

}
