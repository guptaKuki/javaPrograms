package Array;

import java.util.Scanner;

public class ArrangeNumbers {
	
	
	public static void printArray(int input[]) {
		for(int i=0; i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] arrangeNumber() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=s.nextInt();
		int input[]= new int[size];
		
		//FIRST APPROACH
//		 int val=1;
//		for(int i=0;i<=size/2 ;i++) {
//			 input[i]=val;
//			 val=val+2;
//		}
//		 int num=2;
//		for(int j=size-1;j>size/2;j--) {
//			input[j]=num;
//			num=num+2;
//		}
//		return input;
		
		//SECOND APPROACH
		
		int val=1;
		for(int i=0,j=size-1 ; i<=j;) {
			if(val%2 != 0) {
				input[i]=val;
				val++;
				i++;
			}else {
				input[j]=val;
				val++;
				j--;
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		int arr[]=arrangeNumber();
		printArray(arr);
		
	}

}
