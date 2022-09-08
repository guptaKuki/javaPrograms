package Learn_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.management.relation.RelationSupportMBean;

public class LongestConsecutiveSubsequence {
	
	public static List<Integer> subsequence(int arr[] , int n){
		
		HashMap<Integer ,Boolean> map= new HashMap<>();
		
		for( int i=0;i<n;i++)
			map.put(arr[i], true);
		
		int maxlength=0;
		int sRange=0;
		int eRange=0;
		for( int i=0;i<n;i++) {
			int max=0,s=0,e=0;
			if(map.get(arr[i]) == true) {
				int num=arr[i];
				e=num;
				while(map.containsKey(num)) {
					s=num;
					map.put(num, false);
					num--;
					max++;
				}
				int number=arr[i]+1;
				while(map.containsKey(number)) {
					e=number;
					map.put(number, false);
					number++;
					max++;
				}
			}
			
			if(maxlength < max) {
				maxlength=max;
				sRange=s;
				eRange=e;
			}
		}
		List<Integer> ans= new ArrayList<>();
		ans.add(sRange);
		ans.add(eRange);
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of array :");
		int n=sc.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter the elements: ");
		for( int i=0;i<n;i++)
			array[i]=sc.nextInt();
		
		List<Integer> res=subsequence(array, n);
		System.out.println(res);
	}

}
