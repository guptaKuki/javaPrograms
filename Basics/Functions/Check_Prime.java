package Functions;
import java.util.Scanner;
public class Check_Prime {
	
	public static boolean primeNumber(int n) {
		int i=2;
//		boolean prime=true; 
		while(i<=n/2) {
			if(n%i==0) {
				//prime=false;
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		boolean check= primeNumber(n);
		System.out.println(check);
	}

}
