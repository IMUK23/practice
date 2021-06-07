package catalan_numbers;

import java.io.*;
import java.util.*;

public class number_of_bsts {
    


public static int catalan(int N){
       int mod=1000000000+7;
       if(N==0 || N==1){
           return 1;
       } 
       
       
       long[] dp=new long[N+1];
       
       
       dp[0]=1;
       dp[1]=1;
       
       for(int i=2;i<=N;i++){
           for(int j=0;j<i;j++){
               dp[i]=(dp[i]+ ((dp[j]) * (dp[i-1-j]))%mod)%mod;
           }
       }
       
       return (int)dp[N];
    }
    
    public static int factorial(int N){
        if(N==0 || N==1){
            return 1;
        }
        int a=1;
        for(int i=2;i<=N;i++){
            a=a*i;
        }
        
        return a;
        
    }

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    
    
    int n=sc.nextInt();
    
    System.out.println(catalan(n));
 }

}