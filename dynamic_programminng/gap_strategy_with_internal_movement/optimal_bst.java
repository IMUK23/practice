package gap_strategy_with_internal_movement;

import java.io.*;
import java.util.*;

public class optimal_bst {
  
  private static void optimalbst(int[] keys, int[] frequency, int n) {
    
    int[][] dp=new int[n][n];
    int[] pfa=new int[n];
    pfa[0]=frequency[0];
    for(int i=1;i<n;i++){
        pfa[i]=frequency[i]+pfa[i-1];
    }
    for(int g=0;g<n;g++){
        for(int i=0,j=g;j<n;i++,j++){
            if(g==0){
                dp[i][j]=frequency[i];
            }
            else if(g==1){
                dp[i][j]=Math.min(frequency[i]+2*frequency[j],frequency[j]+2*frequency[i]);
            }
            else{
                /*Without prefix array
                int x=0;
                    for(int z=i;z<=j;z++){
                        x+=frequency[z];
                    }*/
                /*With prefix array*/
                int x;
                if(i==0){
                    x=pfa[j];
                }
                else{
                    x=pfa[j]-pfa[i-1];
                }
                int min=Integer.MAX_VALUE;    
                for(int k=i;k<=j;k++){
                    int left= k==i?0:dp[i][k-1];
                    int right=k==j?0:dp[k+1][j];
                    if(min> left+right+x){
                        min=left+right+x;
                    }
                    
                }
                dp[i][j]=min;
                
                
                
            }
            
        }
    }
    System.out.println(dp[0][n-1]);
	}

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	int[] keys = new int[n];
	int[] frequency = new int[n];
    for(int i= 0 ;i < n ; i++) {
		keys[i] = scn.nextInt();
	}
	for(int i = 0 ; i < n; i++){
      frequency[i] = scn.nextInt();
    }
	optimalbst(keys,frequency,n);
	}

}
