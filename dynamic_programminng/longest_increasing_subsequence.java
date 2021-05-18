import java.io.*;
import java.util.*;

public class longest_increasing_subsequence {
    
    
    public static int maxsubarray(int[] arr,int pos,int end,int size,int max){
        if(pos==end){
            return size;
        }
        int max1,max2;
        if(arr[pos]>max){
             return Math.max(maxsubarray(arr,pos+1,end,size+1,arr[pos]),maxsubarray(arr,pos+1,end,size,max));
        }
        else{
            return maxsubarray(arr,pos+1,end,size,max);
        }
        
        
    }
    
    public static int lower_bound(ArrayList<Integer>arr,int k){
            int s=0;
            int e=arr.size();
            while(s!=e){
                int mid=s+e>>1;
                
                if(arr.get(mid)<k){
                    s=mid+1;
                }
                else{
                    e=mid;
                }
            }    
                if(s==arr.size()){
                    return -1;
                }
                return s;
            }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        /*
        first solving using recursion
        int ans=maxsubarray(arr,0,n,0,Integer.MIN_VALUE);
        System.out.println(ans);
        */
        
        //now solving using dp- time complexity- O(n^2)
        /*
        int[] dp=new int[n];
        
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        int max=dp[0];
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
             if(max<dp[i]){
                max=dp[i];
            }
        }*/
       /* int max=dp[0];
        for(int i=0;i<n;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }*/
        
        //System.out.println(max);
        
        
        /* Now solving using binary search and dp  - time complexity-O(nlogn)
        Approach- Traverse the array if the current element is larger than last element of new array add in new array else replace the lower_bound of that current number from the array
        */
        
        //first writing function for lower_bound
        
        
        ArrayList<Integer> narr=new ArrayList<>();
        narr.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]>narr.get(narr.size()-1)){
                narr.add(arr[i]);
            }
            else{
                int lb=lower_bound(narr,arr[i]);
                narr.set(lb,arr[i]);
            }
        }
        
        System.out.println(narr.size());
            
        
        
    }

}