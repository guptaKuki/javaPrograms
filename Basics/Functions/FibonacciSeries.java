package Functions;
import java.io.*;
public class FibonacciSeries {
	
	static int n1=0,n2=1,n3=0;
	public static void fibSeries(int count) {

		if(count >= 0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			fibSeries(count-1);
		}
	}

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of terms : ");
		 int n=Integer.parseInt(br.readLine());
		 System.out.print(0+" "+1+" ");
		 fibSeries(n-2);
		 
	}

}
