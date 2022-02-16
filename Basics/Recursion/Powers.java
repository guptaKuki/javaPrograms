package Recursion;
import java.util.Scanner;

public class Powers {
	
	public static int powerOfNumber(int n,int m) {
		if (m == 1) 
		return n;
		
		return n*powerOfNumber(n,m-1);
	}

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int n=s.nextInt();
	System.out.println("Enter the power of number: ");
	int m=s.nextInt();
	if(m==0)
		System.out.println("Answer: "+1);
	else {
	int powers=powerOfNumber(n,m);
	System.out.println("Answer: "+powers);
	}	
	}

}
