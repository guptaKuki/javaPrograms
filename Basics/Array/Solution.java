package Array;
import java.util.*;

public class Solution{
	
	static void maximizeArray(int[] arr1,int[] arr2)
	{
		int arr3[] = new int[10];
		for(int i = 0; i < arr3.length; i++)
		{
			arr3[i] = 0;
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0; i < arr2.length; i++)
		{
			if(arr3[arr2[i]] == 0)
			{
				arr3[arr2[i]] = 2;
				al.add(arr2[i]);
			}
		}
		
		for(int i = 0; i < arr1.length; i++)
		{
			if(arr3[arr1[i]] == 0)
			{
				arr3[arr1[i]] = 1;
				al.add(arr1[i]);
			}
		}
		int count = 0;
		for(int j = 9; j >= 0; j--)
		{
			if(count < arr1.length &
			(arr3[j] == 2 || arr3[j] == 1))
			{
				count++;
			}
			else
			{
				al.remove(Integer.valueOf(j));
			}
		}
	
		int i = 0;
		for(int x:al)
		{
			arr1[i++] = x;
		}
	}
	
	static void printArray(int[] arr)
	{
		for(int x:arr)
			System.out.print(x + " ");
	}
	
	// Driver Code
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		  int n=sc.nextInt();
		  int m=sc.nextInt();
			int arr1[] = new int[n];
		  	for(int i=0;i<n;i++){
		      arr1[i]=sc.nextInt();
		    }
			int arr2[] = new int[m];
		 	for(int j=0;j<m;j++){
		      arr2[j]=sc.nextInt();
		    }
		maximizeArray(arr1,arr2);
		printArray(arr1);
	}
}
	
