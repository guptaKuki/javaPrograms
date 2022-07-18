package String;

import java.util.Arrays;

public class substringproblem {

	public static void main(String[] args) {
		String str="welcometojava";
		int p=3;
		String arr[]=new String[str.length()-2];
		
		for( int i=0;i<str.length()-2;i++) {
			arr[i]=str.substring(i,i+3);
		}
		for(int j=0 ;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}
