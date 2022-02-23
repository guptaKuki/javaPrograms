package Recursion;
import java.io.*;
public class AllIndices {
	
	public static void allIndexofElement(int arr[],int n, int startIndex) {
		if(startIndex >=arr.length-1) {
			if(arr[startIndex]== n) {
				System.out.print(startIndex+" ");
				return;
			}
			else
				return;
		}
		allIndexofElement(arr,n,startIndex+1);
		if(arr[startIndex]== n) {
			System.out.print(startIndex+" ");
			return;
		}
		else
			return;	
	}
	
	public static void allIndexofElement(int arr[],int n) {
		allIndexofElement(arr,n,0);
	}

	public static void main(String[] args) throws Exception{
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter the size of array: ");
	   int size=Integer.parseInt(br.readLine());
	   
	  int input[]=new int[size];
	   
	   System.out.println("Enter the elements in a single line with spaces: ");
	   String []str=br.readLine().split(" ");
		for(int i=0;i<size;i++) {
			input[i]= Integer.parseInt(str[i]);
		}
		System.out.println("enter the number ou want to find: ");
		int num=Integer.parseInt(br.readLine());
		
		allIndexofElement(input,num);
		 
	}
}
