package Recursion;
import java.util.Scanner;

public class SumOfNaturalNumber {
	
	public static int sumOf( int n) {
		if( n == 1)
			return 1;
	 return n+sumOf(n-1);
	
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number : ");
		int n=s.nextInt();
		 int ans=sumOf(n);
		 System.out.println("Sum of natural number : "+ans);
	}

}
