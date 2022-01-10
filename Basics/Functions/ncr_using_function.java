package Functions;
import java.util.Scanner;
public class ncr_using_function {
	
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 System.out.println("enter the number N");
		 int n=s.nextInt();
		 System.out.println("enter the number R");
		 int r=s.nextInt();
		 int ncr= factorial(n)/(factorial(r)*factorial(n-r));
		 System.out.println(ncr);
	}

}
