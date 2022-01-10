package Functions;

import java.util.Scanner;

public class calculating_ncr {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		 int n=sc.nextInt();
		 int r=sc.nextInt();
		 
		 int factn=1, factr=1,factnr=1;
		 for(int i=1;i<=n;i++) {
			 factn=factn*i;
			 
			 if(i<=r) {
				 factr=factr*i;
			 }
			 
			 if(i<=(n-r)) {
				 factnr=factnr*i;
			 }
		 }
		 
		 int ncr=factn/(factr*factnr);
		 System.out.println(ncr);
	}
}
