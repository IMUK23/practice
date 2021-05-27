import java.io.*;
import java.util.*;

public class count_distinct_pallindromic_subsequences {
    public static int solution(String str) { 
    int n=str.length();
		HashMap<Character,Integer> map=new HashMap<>();
		
		int[] prev=new int[n];
		int[] next=new int[n];
		
		for(int i=0;i<n;i++){
		    if(map.containsKey(str.charAt(i))){
		        prev[i]=map.get(str.charAt(i));
		    }
		    else{
		        prev[i]=-1;
		    }
		    map.put(str.charAt(i),i);
		}
		
		
		map.clear();
		
		for(int i=n-1;i>=0;i--){
		    if(map.containsKey(str.charAt(i))){
		        next[i]=map.get(str.charAt(i));
		    }
		    else{
		        next[i]=n;
		    }
		    map.put(str.charAt(i),i);
		}
		
		
		int[][] dp=new int[n][n];
		
		for(int g=0;g<n;g++){
		    
		    for(int i=0,j=g;j<n;i++,j++){
		        if(g==0){
		            dp[i][j]=1;
		        }
		        else if(g==1){
		          dp[i][j]=2;		            
		        }
		        else{
		            if(str.charAt(i)!= str.charAt(j)){
		                dp[i][j]=dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1];
		            }
		            else{
		                int ne=next[i];
		                int p=prev[j];
		                
		                if(p> ne){
		                    dp[i][j]=2*dp[i+1][j-1]-dp[ne+1][p-1];
		                }
		                else if(p==ne){
		                    dp[i][j]=2*dp[i+1][j-1]+1;
		                }
		                else{
		                    dp[i][j]=2*dp[i+1][j-1]+2;
		                    
		                }
		            }
		        }
		    }
		}
		
		
		return dp[0][n-1];
}
}
