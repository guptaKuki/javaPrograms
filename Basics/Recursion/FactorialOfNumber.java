package Recursion;
import java.util.Scanner;


public class FactorialOfNumber {

	public static int factOfNumber(int n) {
		if( n == 0)
			return 1;
		int small=factOfNumber(n-1);
		return n*small;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the Number :");
		 
		 int n=s.nextInt();
		 int factorial=factOfNumber(n);
		 System.out.println("Factorial of number : "+factorial);
	}

}
