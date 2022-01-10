package Functions;
import java.util.Scanner;
public class Sum {
	
	public static int sumofinteger(int x,int y) {
		int sum=x+y;
		return sum;
	}

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	 int a=s.nextInt();
	 int b=s.nextInt();
	 int summation=sumofinteger(a,b);
	 System.out.println(summation);

	}

}
