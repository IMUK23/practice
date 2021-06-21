package gap_strategy_with_internal_movement;
import java.io.*;
import java.util.*;
public class burst_ballons {
    
  public static int solution(int[] arr) {
    int n= arr.length;
    int[][] dp =new int[n][n];
    
    for(int g=0;g<n;g++){
        
        for(int i=0,j=g;j<n;i++,j++){
            
            if(g==0){
                if(i==0){
                    dp[i][j]=arr[i]*arr[i+1];
                }
                else if(i==n-1){
                    dp[i][j]=arr[i]*arr[i-1];
                }
                else{
                    dp[i][j]=arr[i]*arr[i+1]*arr[i-1];
                }
            }
            else{
                    int max=Integer.MIN_VALUE;
                    int left,right,lt,rt;
                    lt= i==0?1:arr[i-1];
                    rt= j==n-1?1:arr[j+1];
                    for(int k=i;k<=j;k++){
                        left= k==i?0:dp[i][k-1];
                        right= k==j?0:dp[k+1][j];
                        
                        if(max< (left+right+(arr[k]*lt*rt))){
                            max=(left+right+(arr[k]*lt*rt));
                        }
                    }
                    dp[i][j]=max;
                    
                
                
                
            }
        }
    }
        
    return dp[0][n-1];
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }
}
