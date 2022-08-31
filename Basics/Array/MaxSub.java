package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MaxSub{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            
            
        List<Integer> ans = maxSubarraySum(arr,n);
        for(Integer num:ans)
            System.out.print(num+" ");
    }
    
    static List<Integer> maxSubarraySum(int arr[], int n){
        List<Integer> ans = new ArrayList<>();
        if(n==0){
            return ans;
        }
        
        
        int sum=0;
        int max= 0;

        List<Integer> smallAns = new ArrayList<>();
        
        for(int i=0;i<n;i++){
        	if(arr[i]<0){
                sum=0;
                smallAns.clear();
                continue;
            }
            sum+= arr[i];
            smallAns.add(arr[i]);
            System.out.println(smallAns);
            if(sum>max){
                max= sum;
                ans = new ArrayList<>(smallAns);
                System.out.println(ans);
            }
            
            
            System.out.println(smallAns);
        }
        System.out.println(ans);
        return ans;
        
        
        
    }
    
}
