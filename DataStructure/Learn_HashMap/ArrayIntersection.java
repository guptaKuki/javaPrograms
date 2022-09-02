package Learn_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayIntersection {
	
	public static void printIntersection(int arr1[] , int arr2[]) {
		HashMap<Integer , Integer> map= new HashMap<>();
		
		for(int i=0;i<arr1.length;i++)
			map.put(arr1[i], map.getOrDefault(arr1[i] ,0)+1);
		 
		for( int j=0; j<arr2.length;j++) {
			if(map.containsKey(arr2[j]) && map.get(arr2[j]) != 0) {
				System.out.print(arr2[j]+" ");
				map.put(arr2[j], map.get(arr2[j])-1);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr1[]=new int[n];
		
		for( int i=0;i<n;i++) 
			arr1[i]=sc.nextInt();
		
		int m=sc.nextInt();
		int arr2[]=new int[m];
		
		for(int j=0 ; j<m ; j++)
			arr2[j]=sc.nextInt();
		
		printIntersection(arr1,arr2);
		
	}

}
