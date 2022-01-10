package Functions;
import java.util.Scanner;
public class CelsiusFahrenheit {
	 public static void CtoF(int s,int e,int w) {
		 for(int i=s;i<=e;i+=w) {
			 int fahrenheitValue =(int)((5.0/ 9) * (i - 32));
			 System.out.println(i+" "+fahrenheitValue);
		 }
	 }

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int width=s.nextInt();
		CtoF(start,end,width);

	}

}
