package gap_strategy_with_internal_movement;

import java.io.*;
import java.util.*;

public class matrix_chain {

	public static int mcm(int[] arr){
		
		int n=arr.length;
		int[][] dp=new int[n-1][n-1];
		
		for(int g=0;g<n-1;g++){
		    
		    for(int i=0,j=g;j<n-1;i++,j++){
		        if(g==0){
		            dp[i][j]=0;
		        }
		        else if(g==1){
		            dp[i][j]=arr[i]*arr[j]*arr[j+1];
		        }
		        else{
		            dp[i][j]=Integer.MAX_VALUE;
		            for(int k=i;k<j;k++){
		                dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k+1][j]+(arr[i]*arr[k+1]*arr[j+1]));
		            }
		        }
		    }
		}

		return dp[0][n-2];
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++){
			arr[i] = scn.nextInt();
		}
		System.out.println(mcm(arr));
	}

	
}