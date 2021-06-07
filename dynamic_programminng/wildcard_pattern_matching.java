import java.io.*;
import java.util.*;

public class wildcard_pattern_matching {

	public static boolean solution(String s, String p) {
		 int m=s.length();
		int n=p.length();
		
		boolean[][] dp=new boolean[n+1][m+1];
		
        dp[n][m]=true;
        /*This is the most important thing if * is at last it can take anything
        but as soon as you encounter character the star before that will have restrictions */ 
        
        
        /*Reason last me khali hai to akhiri ke star khali ko rakh sakte hai but char ke pehle wale ya to khali rakhenge ya to char */ 
        for(int i=n-1;i>=0;i--){
            if(p.charAt(i)!='*'){
                break;
            }
            else{
                dp[i][m]=true;
            }
        }
        
		
		for(int i=n-1;i>=0;i--){
		    for(int j=m-1;j>=0;j--){
		       
		            
		            if(p.charAt(i)!= '?' && p.charAt(i)!='*'){
		                dp[i][j]= s.charAt(j)==p.charAt(i)?dp[i+1][j+1]:false;
		            }
		            
		            else if(p.charAt(i)=='?'){
		                dp[i][j]=dp[i+1][j+1];
		            }
		            
		            else if(p.charAt(i)=='*'){
		                dp[i][j]=(dp[i+1][j] | dp[i][j+1] | dp[i+1][j+1]);
		            }
                    else{
                        dp[i][j]=false;
                    }
		            
		            
		            
		        }
		    }
		
		
		
		
		
		return dp[0][0];
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1,s2));
	}

}