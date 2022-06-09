//Incomplete.
package ErrorDetection;

import java.util.Scanner;

public class _2DParityCheckerReceiver {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
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
		
		System.out.println("In which parity did you your meassgae: 1. EvenParity  2. OddParity");
		int choice=sc.nextInt();
		boolean check;
		if(choice == 1)
			check=evenParityChecker(c,m,n);
		else
			check=oddParityChecker(c,m,n);
		if(check)
			System.out.println("Message Accepted");
		else
			System.out.println("Message Rejected");
	}
	
	private static boolean oddParityChecker(char[][] c, int m, int n) {
		for(int i=0 ;i<m;i++) {
			int count=0;
			for( int j=0;j<n ;j++) {
				if(c[i][j] == '1')
					count++;
			}
			if(count%2 != 0 && c[i][n-1]=='0' || count%2 == 0 && c[i][n-1]=='1')
				continue;
			else
				return false;
		}
		return true;
		
	}
	
	

	private static boolean evenParityChecker(char[][] c, int m, int n) {
		for(int j=0 ;j<n;j++) {
			int count=0;
			for( int i=0;i<m ;i++) {
				if(c[i][j] == '1')
					count++;
			}
			if(count%2 != 0 && c[m-1][j]=='1' || count%2 == 0 && c[m-1][j]=='0')
				continue;
			else
				return false;
		}
		return true;
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
