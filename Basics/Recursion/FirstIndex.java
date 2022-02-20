package Recursion;
import java.io.*;
public class FirstIndex {
	
	public static int firstIndexofElement(int arr[],int n,int startIndex) {
		if(startIndex>=arr.length-1) {
			if(arr[startIndex] == n)
				return startIndex;
			else
				return -1;
		}
		
		if(arr[startIndex] == n)
			return startIndex;
		int index=firstIndexofElement(arr,n,startIndex+1);
		return index;
	}
	
	private static int firstIndexofElement(int arr[],int n) {
		return firstIndexofElement(arr,n,0);
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
		
		int fi=firstIndexofElement(input,num);
		System.out.println("First index :"+fi); 
	}
}
