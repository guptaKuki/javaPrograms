package Array;

import java.util.Scanner;

public class ArrayDuplication {
	
	public static int[] takingInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=s.nextInt();
		int input[]= new int[size];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static void  duplicatedElement(int arr1[] ,int arr2[]) {
		 
//		int size=0;
//		 while(arr1.length > arr2.length &&  size < arr2.length) {
//			 int i=0 , j=0;
//			 if(arr2[j] == arr1[i]) {
//				 System.out.print(arr2[j] +" ");
//				 arr1[i]=Integer.MIN_VALUE;
//				 j++;
//				 i++;
//			 }else {
//				 i++;
//			 }
//			 size++;
//		 }
//		 
//
//		 while(arr1.length < arr2.length && size<arr1.length) {
//			 int a=0,b=0;
//			 if(arr1[a] == arr2[b]) {
//				 System.out.print(arr1[a] +" ");
//				 arr2[b]=Integer.MIN_VALUE;
//				 b++;
//				 a++;
//			 }else {
//				 b++;
//			 }
//			 size++;
//		 }
		
		for(int i=0; i<arr1.length ;i++) {
			for( int j=0 ;j<arr2.length ;j++) {
				if( arr1[i] == arr2[j]) {
					System.out.print(arr2[j]+" ");
					arr1[i] = Integer.MIN_VALUE;
					break;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		int array1[] = takingInput();
		int array2[] = takingInput();
		duplicatedElement( array1 ,array2);

	}

}
