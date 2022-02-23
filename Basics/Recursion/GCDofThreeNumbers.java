package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCDofThreeNumbers {
	
	public static int gcd(int a,int b) {
		if(b== 0)
			return a;
		return gcd(b,a%b);
	}

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers : ");
		
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		
		int ans=gcd(a,gcd(b,c));
		System.out.println("GCD of three number is :"+ans);
	}
}
