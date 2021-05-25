/*I have given various solutions for this one*/
/* This only gives lenth of longest 
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=s.length();
    int[][] dp=new int[n][n];
    boolean[][] checker=new boolean[n][n];
    
    
    for(int g=0;g<s.length();g++){
        for(int i=0,j=g;j<s.length();i++,j++){
            if(g==0){
                checker[i][j]=true;
                dp[i][j]=1;
            }
            else if(g==1){
                if(s.charAt(i)==s.charAt(j)){
                    checker[i][j]=true;
                    dp[i][j]=2;
                }
                else{
                    checker[i][j]=false;
                    dp[i][j]=1;
                }
            }
            else{
                if(s.charAt(i)==s.charAt(j)){
                    if(checker[i+1][j-1])
                    {
                        checker[i][j]=true;
                        dp[i][j]=2+dp[i+1][j-1];
                    }
                    else{
                        dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                    }
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
    }
        
    System.out.println(dp[0][n-1]);    
    }

}
*/ 
/*This gives the correct answer but uses a lot of memory
class Solution{
    static String longestPalin(String s){
        int n=s.length();
    boolean[][] checker=new boolean[n][n];
    String[][] dp=new String[n][n];
    int l=0;
    String out="";
    for(int g=0;g<s.length();g++){
        for(int i=0,j=g;j<s.length();i++,j++){
            if(g==0){
                checker[i][j]=true;
                dp[i][j]=s.charAt(i)+"";
                if(g+1>l){
                    l=g+1;
                    out=dp[i][j];
                }
            }
            else if(g==1){
                if(s.charAt(i)==s.charAt(j)){
                    checker[i][j]=true;
                    dp[i][j]=s.charAt(i)+""+s.charAt(j);
                    if(g+1>l){
                        l=g+1;
                    out=dp[i][j];
                }
                }
                else{
                    checker[i][j]=false;
                    
                }
            }
            else{
                if(s.charAt(i)==s.charAt(j) && checker[i+1][j-1]){
                   checker[i][j]=true;
                   dp[i][j]=s.charAt(i)+dp[i+1][j-1]+s.charAt(i);
                        if(g+1>l){
                            l=g+1;
            
                    out=dp[i][j];
                     }
                    
                    
                }
                else{
                    checker[i][j]=false;
                }
            }
        }
    }
        
    return(out); 
        
    }
}

*/ 
/*This is by far the best */
public class longest_pallindromic_substring {
    public String longestPalindrome(String s) {
        int n=s.length();
    boolean[][] checker=new boolean[n][n];
   /* String[][] dp=new String[n][n];*/
    int max_length=0;
    int start=0;    
    String out="";
    for(int g=0;g<s.length();g++){
        for(int i=0,j=g;j<s.length();i++,j++){
            if(g==0){
                checker[i][j]=true;
                /*dp[i][j]=s.charAt(i)+"";
                if(g+1>l){
                    l=g+1;
                    out=dp[i][j];
                }*/
            }
            else if(g==1){
                if(s.charAt(i)==s.charAt(j)){
                    checker[i][j]=true;
                   /* dp[i][j]=s.charAt(i)+""+s.charAt(j);
                    if(g+1>l){
                        l=g+1;
                    out=dp[i][j];
                }*/
                }
                else{
                    checker[i][j]=false;
                    
                }
            }
            else{
                if(s.charAt(i)==s.charAt(j) && checker[i+1][j-1]){
                   checker[i][j]=true;
                  /* dp[i][j]=s.charAt(i)+dp[i+1][j-1]+s.charAt(i);
                        if(g+1>l){
                            l=g+1;
            
                    out=dp[i][j];
                     }*/
                    
                    
                }
                else{
                    checker[i][j]=false;
                }
            }
            
            if(g+1>max_length && checker[i][j]){
                max_length=g+1;
                start=i;
            }
        }
    }
        
    return(s.substring(start,start+max_length)); 
    }
}
