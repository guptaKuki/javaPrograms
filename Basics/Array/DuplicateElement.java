package Array;

import java.util.Scanner;

public class DuplicateElement {

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
	
	public static int findDuplicate(int arr[]){
		for( int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				 
				if(i != j) {
					if(arr[i] == arr[j])
					    return arr[i];
				}
			}		 	 
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int input[]=takingInput();
		int duplicate =findDuplicate(input);
		System.out.println(duplicate);

	}

}
