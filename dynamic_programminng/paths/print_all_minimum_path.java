package paths;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class print_all_minimum_path{
    
    public static class Pair{
        int l;
        int v;
        int i;
        String psf;
        
        public Pair(int l,int i,int v,String s){
            this.l=l;
            this.i=i;
            this.v=v;
            this.psf=s;
        }
        
    } 
    
    public static void Solution(int arr[]){
        int n=arr.length;
        int[] dp=new int[n];
    /* Solution sahi hai output dera hai hai ulta     
        dp[0]=0;
        
        for(int i=1;i<n;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++){
            
            for(int j=1;j<1+arr[i];j++){
                if(i+j>=n){
                    break;
                }
                dp[i+j]=Math.min(dp[i+j],1+dp[i]);
            }
        }
    ArrayDeque<Pair> q=new ArrayDeque<>();
    
    9->7->5->3->0
    9->6->5->3->0
    
    Apan ko chahiye seedha 
    
    q.add(new Pair(dp[n-1],n-1,arr[n-1],(n-1)+""));
    
    
    while(q.size()>0){
        Pair p=q.removeFirst();
        if(p.l==0){
            
            System.out.println(p.psf);
        }
        for(int k=p.i;k>=0;k--){
            if(dp[k]==p.l-1 && k+arr[k]>=p.i){
                q.add(new Pair(dp[k],k,arr[k],p.psf+"->"+(k)));
            }
        }
        
    */    
    
     for(int idx = arr.length-2 ; idx >=0 ; idx--){
            int steps = arr[idx];
        
            int min = Integer.MAX_VALUE;
            if(steps > 0){
                for(int i = 1 ; i <= steps ;i++){
                    if(idx + i < arr.length)
                        {min = Math.min(min,dp[idx+i]);}
                }
            }
            dp[idx] = min == Integer.MAX_VALUE ? min : min+1;
            // System.out.print(dp[idx]+" ");
        }
        
    System.out.println(dp[0]);   
    ArrayDeque<Pair> q=new ArrayDeque<>();
    
    
    q.add(new Pair(dp[0],0,arr[0],0+""));
    
    
    while(q.size()>0){
        Pair p=q.removeFirst();
        if(p.l==0){
            System.out.println(p.psf+" .");
        }
        for(int k=1;k<=p.v;k++){
            if(p.i+k<n && dp[p.i+k]!= Integer.MAX_VALUE && dp[p.i+k]==p.l-1 ){
                q.add(new Pair(dp[p.i+k],p.i+k,arr[p.i+k],p.psf + " -> " + (p.i+k)));
            }
        }
        
    }
    
    
        
    }
}