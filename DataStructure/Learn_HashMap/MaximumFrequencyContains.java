package Learn_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumFrequencyContains {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]= new int[n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int val=maximumFrequency(arr);
		System.out.println(val);
	}
	
	public static int maximumFrequency(int arr[]) {
		HashMap<Integer ,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int of=map.get(arr[i]);
				int nf=of+1;
				map.put(arr[i], nf);
			}else
				map.put(arr[i], 1);
		}
		
		int max=map.get(arr[0]);
		int ele=arr[0];
		for(Integer i:map.keySet()) {
			if(map.get(i) > max){
				max=map.get(i);
				ele=i;
			}
		}
		return ele; 
	}

}
