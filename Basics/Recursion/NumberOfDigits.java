package Recursion;

import java.util.Scanner;

public class NumberOfDigits {
	
	public static int countNumber( int n) {
		int count=0;
		if( n/10 == 0)
			return 1;
		
		count= 1+countNumber(n/10);
		return count;

	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		int countDigit=countNumber(n);
		System.out.println(countDigit);
		

	}

}
