package Array;

import java.util.Scanner;

public class Array_Use {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size= s.nextInt();
		int input[] = new int[size];
		
		for(int i=0;i<size;i++) {
			input[i]=s.nextInt();
		}
		
		for(int j=0;j<size;j++) {
			System.out.print(input[j]+" ");
		}
		
	}

}
