package Functions;
import java.util.Scanner;
public class FibonacciNumber {
	
	public static boolean fibonacci(int n) {
		int f0=0, f1=1;
		int fn;
		while(f0<n) {
			fn=f0+f1;
			f0=f1;
			f1=fn;
		}
		if(f0==n) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 boolean fs=fibonacci(n);
	 System.out.println(fs);
	}

}
