package LinkedList;

import java.util.*;
public class RemoveDuplicate {

	public static ArrayList<Integer> removeDuplicateElement(int arr[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(arr[0]);
		for( int i=1;i<arr.length;i++) {
			if(arr[i-1] != arr[i])
				al.add(arr[i]);
		}
		return al;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		
		ArrayList<Integer> result=removeDuplicateElement(arr);
		System.out.println(result);

	}

}
