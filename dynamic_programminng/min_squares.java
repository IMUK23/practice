import java.io.*;
import java.util.*;
public class min_squares {
    public static int solution(int n){
		int[] dp =new int[n+1];
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<n+1;i++){
		    /*Time Complexity - O(n* n^0.5)*/
		    dp[i]=Integer.MAX_VALUE;
		    int root=(int)Math.pow(i,0.5);
		    
		    for(int j=1;j<=root;j++){
		        dp[i]=Math.min(1+dp[i-(j*j)],dp[i]);
		    }
		}
        
		return dp[n];
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(solution(n));
	}
}
