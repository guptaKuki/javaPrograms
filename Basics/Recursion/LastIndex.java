package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LastIndex {
	public static int lastIndexofElement(int arr[],int n,int startIndex) {
		if(startIndex<=0) {
			if(arr[startIndex] == n)
				return startIndex;
			else
				return -1;
		}
		
		if(arr[startIndex] == n)
			return startIndex;
		int index=lastIndexofElement(arr,n,startIndex-1);
		return index;
	}
	
	private static int lastIndexofElement(int arr[],int n) {
		return lastIndexofElement(arr,n,arr.length-1);
	}

	public static void main(String[] args) throws Exception{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter the size of array: ");
		   int size=Integer.parseInt(br.readLine());
		   
		  int input[]=new int[size];
		   
		   System.out.println("Enter the elements: ");
		   String []str=br.readLine().split("");
			for(int i=0;i<size;i++) {
				input[i]= Integer.parseInt(str[i]);
			}
			System.out.println("enter the number ou want to find: ");
			int num=Integer.parseInt(br.readLine());
			
			int fi=lastIndexofElement(input,num);
			System.out.println("last index :"+fi); 
		}
	


}
