public class buy_sell_stocks_k_trasactions {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][] dp=new int[k+1][n+1];
        
        for(int r=0;r<k+1;r++){
            for(int i=0;i<n+1;i++){
                if(i==0 || r==0){
                    dp[r][i]=0;
                }
                else{
                    int max=0;
                   /* Time Complexity using this is O(k.n^2);
                    for(int j=1;j<i;j++){
                        maxi=Math.max(maxi,((prices[i-1]-prices[j-1])+dp[r-1][j]));
                    }
                    
                    dp[r][i]=Math.max(maxi,dp[r][i-1]);
                    
                    */
                    
                    //Now making it O(k.n)
                    
                    if(dp[r-1][i-1]-prices[i-1]>max){
                        max=dp[r-1][i-1]-prices[i-1];
                    }
                    
                    if(max+prices[i-1]>dp[r][i-1]){
                        dp[r][i]=max+prices[i-1];
                    }
                    else{
                        dp[r][i]=dp[r][i-1];
                    }
                }
            }
        }
        
        
        return dp[k][n];
    }
}
