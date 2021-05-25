import java.io.*;
import java.util.*;

public class longest_pallindromic_subsequence {
    
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    
    String s=sc.nextLine();
    
    int[][] dp =new int[s.length()][s.length()];
    
   //This loop maintanins the gap between i and j as i and j are having gap from 0 to end 
   //We are traversing in diagonal manner
    for(int g=0;g<s.length();g++)
    {
        for(int i=0,j=g;j<s.length();i++,j++){
        if(g==0){
            dp[i][j]=1;
        }
        else if(g==1){
            if(s.charAt(i)==s.charAt(j)){
                dp[i][j]=2;
            }
            else{
                dp[i][j]=1;
            }
        }
        else{
            if(s.charAt(i)==s.charAt(j)){
                dp[i][j]=2+dp[i+1][j-1];
            }
            else{
                dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
            }
        }
            
        }
        
        
        
    }
    
    System.out.println(dp[0][s.length()-1]);
    
    }

}