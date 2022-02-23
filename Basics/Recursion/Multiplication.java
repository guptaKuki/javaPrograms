package Recursion;
import java.util.Scanner;
public class Multiplication {
	
	public static int multiplication(int n,int m) {
		if(m == 1)
			return n;
		int ans=multiplication(n,m-1);
		return n+ans;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the multiplicant :");
		int n=s.nextInt();
		System.out.println("Enter the multiplier :");
		int m= s.nextInt();
		
		int mul=multiplication(n,m);
		System.out.println("Multiplication of two number :"+mul);
	}

}
