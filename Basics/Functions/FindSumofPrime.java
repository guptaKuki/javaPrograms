package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class FindSumofPrime {
	
	public static int sumofPrime(int array[] , int n) {
		
		int sum=0;
		
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			if(isPrime(array[i])) {
				temp[j]=array[i];
				j++;
			}
		}
		Arrays.sort(temp);
		for(int i=0 ;i<n-1;i++)
			sum=sum+temp[i];
		
		if(sum == 0) {
			Arrays.sort(array);
			for(int i=0 ;i<n-1;i++)
				sum=sum+array[i];
		}
		return sum;
	}

	private static boolean isPrime(int i) {
		int j=2;
		
		while(j<=i/2) {
			if(i%j == 0)
				return false;
			j++;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		
		int array[]= new int[size];
		System.out.println("Enter the values of array : ");
		for( int i=0;i<size;i++) 
			array[i]=sc.nextInt();
		
		int sum= sumofPrime(array,size);
		System.out.print("sum is :"+sum);
	}

}
