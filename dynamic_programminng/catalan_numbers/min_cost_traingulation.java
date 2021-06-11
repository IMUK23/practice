package catalan_numbers;

import java.io.*;
import java.util.*;

public class min_cost_traingulation {

	public static int minScoreTriangulation(int[] arr) {
		int n=arr.length;
		
		int[][] dp=new int[n][n];
		
		for(int g=0;g<n;g++){
		    
		    for(int i=0,j=g;j<n;i++,j++){
		        if(g==0 || g== 1){
		            dp[i][j]=0;
		        }
		        else if(g==2){
		            dp[i][j]=arr[i]*arr[i+1]*arr[j];
		        }
		        else{
		            int val=Integer.MAX_VALUE;
		            for(int k=i+1;k<j;k++){
		                int val1=arr[i]*arr[j]*arr[k];
		                int val2=dp[i][k];
		                int val3=dp[k][j];
		                
		                int sum=val1+val2+val3;
		                if(sum<val){
		                    val=sum;
		                }
		            }
		            dp[i][j]=val;
		        }
		    }
		}
		
		return dp[0][n-1];
    }
  public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
		for(int i = 0 ; i  < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(minScoreTriangulation(arr));
	}
}
