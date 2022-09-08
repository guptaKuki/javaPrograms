package Learn_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class PairsWithDifferenceK {
	//Distinct pairs
	
	public static int pairDiff( int arr[] ,int diff) {
		
		HashMap<Integer , Integer> map= new HashMap<>();
		int count=0;
		for( int i=0;i<arr.length;i++) {
			int temp;
			if(diff <= arr[i])
				  temp = arr[i]-diff;
			else
				temp=arr[i]+diff;
			
			if(map.containsKey(temp)) {
				count++;
				map.remove(temp);
			}else {
				map.put(arr[i], 1);
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of array :");
		int n=sc.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter the elements: ");
		for( int i=0;i<n;i++)
			array[i]=sc.nextInt();
		
		System.out.println("Enter the difference :");
		int diff=sc.nextInt();
		
		System.out.println(pairDiff(array,diff));
	}

}
