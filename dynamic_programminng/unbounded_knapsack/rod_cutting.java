package unbounded_knapsack;
import java.util.*;
public class rod_cutting {
    public static int solution(int[] prices) {
        int n=prices.length;
        
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=prices[0];
        for(int i=2;i<=n;i++){
            dp[i]=prices[i-1];    
            for(int j=0;j<i;j++){
                dp[i]=Math.max(dp[i],dp[j]+dp[i-j]);
            }
        }
        
        /*for(int i=0;i<=n;i++){
            System.out.print(" "+dp[i]);
        }*/
        return dp[n];
      }
    
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
          prices[i] = scn.nextInt();
        }
        System.out.println(solution(prices));
      }
}
