package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static int fibonacci(int n) {
		if(n==0 || n==1)
			return n;
		
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		int nthNumber=fibonacci(n);
		System.out.println("the nth fibonacci number is: "+nthNumber);
	}

}
