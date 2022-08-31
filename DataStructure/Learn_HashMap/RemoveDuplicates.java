package Learn_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]= new int[n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		List<Integer> ans= remove(arr);
		System.out.println(ans);
	}

	private static List<Integer> remove(int[] arr) {
		List<Integer> res= new ArrayList<>();
		HashMap<Integer , Boolean> map= new HashMap<>();
		
		for( int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				continue;
			res.add(arr[i]);
			map.put(arr[i], true);
		}
		return res;
	}

}
