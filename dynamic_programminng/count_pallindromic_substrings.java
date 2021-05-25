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

/*Approach is simple boolean dp 2-D array hai jo dekhra hai ki agar kone wale element same hai to beech wale palindrome ke dp hone par ye bhi dp hoga 
warna nahi agar same nahi hai to waise bhi dp ni ho sakta  */
import java.io.*;
import java.util.*;

public class count_pallindromic_substrings {
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
    
    boolean[][] dp=new boolean[n][n];
    int c=0;
    for(int g=0;g<n;g++){
        for(int i=0,j=g;j<n;i++,j++){
            if(g==0){
                dp[i][j]=true;
                c++;
            }
            else if(g==1){
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=true;
                    c++;
                }
                else{
                    dp[i][j]=false;
                }
            }
            else{
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1];
                    if(dp[i][j]){
                    c++;}
                }
                else{
                    dp[i][j]=false;
                }
            }
        }
        
    }
    
    System.out.println(c);
    
    }

}