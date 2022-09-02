package Learn_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class PairSumto_0 {
	
	public static int pairSum(int arr[]) {
		HashMap<Integer , Integer> map= new HashMap<>();
		int count=0;
		for( int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for( int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]) && map.get(arr[i]) != 0) {
				int nv= -arr[i];
				if(map.containsKey(nv) ) {
					count += map.get(arr[i]) * map.get(nv);
					map.put(arr[i], 0);
					map.put(nv, 0);
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0 ;i<n ;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println(pairSum(arr));
	}

}
