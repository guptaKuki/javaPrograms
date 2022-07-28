package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	
	public static int toh(int n,String source, String aux, String des,int count) {
		if( n == 1) {
			System.out.println("move disk "+n+" from "+source+" to "+des);
			return count=1;
		}
		
		 int p1=toh(n-1,source,des,aux,count);
		 System.out.println("move disk "+n+" from "+source+" to "+des);
		 int p2= toh(n-1 , aux,source,des,count);
		 return 1+p1+p2;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of disk :");
		int num=sc.nextInt();
		String s="source";
		String a="aux";
		String d="des";
		int res=toh(num,s,a,d,0);
		System.out.println(res);
	}

}
