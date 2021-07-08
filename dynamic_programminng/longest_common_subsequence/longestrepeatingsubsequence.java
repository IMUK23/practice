package longest_common_subsequence;
import java.io.*;
import java.util.*;

public class longestrepeatingsubsequence {

	public static int solution(String str){
		int[][] dp=new int[str.length()+1][str.length()+1];
		
		for(int i=0;i<=str.length();i++){
		    for(int j=0;j<=str.length();j++){
		        
		        if(i==0 || j==0){
		            dp[i][j]=0;
		        }
		        else{
		            if(str.charAt(i-1)==str.charAt(j-1) && i!=j){
		                dp[i][j]=1+dp[i-1][j-1];
		            }
		            else{
		                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		            }
		        }
		    }
		}
		return dp[str.length()][str.length()];
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}
}
