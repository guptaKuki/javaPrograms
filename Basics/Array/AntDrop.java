package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AntDrop {
	public static int[] pheromone(int input1,int[] input2, int[] input3, int input4) {
		int [][] finalarr=new int [input1][input1];
		for(int i=0;i<input1;i++) {
			if(input2[i] != 0) {
				int drtn =input3[i];
				int[] arr=new int[input1];
				Arrays.fill(arr,0);
				if(drtn==1) {
				for(int j=i;j<input4+i;j++) {
					if((j+drtn)>=0 && (j+drtn)<input1) {
						arr[j+drtn]=input2[i];					
						}
					}
				}
				else if(drtn==-1){
					for(int j=i;j>i-input4;j--) {
						if((j+drtn)>=0 && (j+drtn)<input1) {
							arr[j+drtn]=input2[i];					
							}
						}
				}
				System.out.println(Arrays.toString(arr));
				finalarr[i]=arr;
			}
		}
		int [] ans=new int[input1];
		Arrays.fill(ans, 0);
		for( int c=0;c<finalarr.length;c++) {
			for(int r=0;r<finalarr.length;r++) {
				ans[c]=ans[c] + finalarr[r][c];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		int []input1=new int[m];
		for(int i=0;i<m;i++)
			input1[i]=sc.nextInt();
		
		int []input2=new int[m];
		for(int i=0;i<m;i++)
			input2[i]=sc.nextInt();
		
		int n=sc.nextInt();
		int[] res=pheromone(m,input1,input2,n);
		System.out.println(Arrays.toString(res));
	}

}
