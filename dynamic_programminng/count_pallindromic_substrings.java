/*My approach had time complexity of O(N^3)

import java.io.*;
import java.util.*;

public class Main {
    public static boolean ispallindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=s.length();
    
    int[] dp=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
        dp[i]=1;
        for(int j=i+1;j<n;j++){
            String sub=s.substring(i,j+1);
            if(ispallindrome(sub)){
                dp[i]++;
            }
        }
        sum+=dp[i];
    }
    
    System.out.println(sum);
    
    }

}

*/ 