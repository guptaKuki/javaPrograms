package Functions;

import java.util.Scanner;

public class EvenNumber {
	
	public static void evennumber(int start,int end) {
		if(start%2!=0) {
			start++;
		}
		for(int i=start;i<=end;i=i+2) {
				System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
//	  System.out.println("enter the number");
//	  int n=s.nextInt();
	  evennumber(7,25);
	}

}
