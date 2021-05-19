import java.io.*;
import java.util.*;

public class longest_bitonic_sequence {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        int[] rarr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            rarr[i]=arr[n-1-i];
        }
        
        
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        
        for(int i=0;i<n;i++){
            dp1[i]=1;
            dp2[i]=1;
        }
        
        
        for(int i=0;i<n;i++){
           
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp1[i]=Math.max(dp1[i],1+dp1[j]);
                }
                
                if(rarr[i]>rarr[j]){
                    dp2[i]=Math.max(dp2[i],1+dp2[j]);
                }
            }
            
        }
        
        int max=0;
        for(int i=0;i<n;i++){
            if(max<(dp1[i]+dp2[n-1-i])){
                max=dp1[i]+dp2[n-1-i];
            }
        }
       /* for(int i=0;i<n;i++){
            System.out.println(dp1[i]+"  "+dp2[n-1-i]);
            
        }*/
        System.out.println(max-1);
        
    }

}