public class buy_and_sell_atmost_twice {
    public static int[] maxi(int[] arr){
        int n=arr.length;
        int[] dp=new int[n];
        
        int min=arr[0];
        int max=arr[0];
        int profit=max-min;
        dp[0]=profit;
        for(int i=1;i<n;i++){
            int val=arr[i];
            if(val<min){
                dp[i]=profit;
                min=val;
                max=val;
                continue;
            }
            if(val>max){
                max=val;
                profit=Math.max(profit,max-min);
                dp[i]=profit;
            }
            
        }
        return dp;
        
    }
    public static int[] rmaxi(int[] arr){
        int n=arr.length;
        int[] dp=new int[n];
        
        int max=arr[n-1];
        int profit=0;
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int curr=arr[i];
            
            if(curr>max){
                dp[i]=profit;
            max=curr;
        }
            else{
                profit=Math.max(profit,max-curr);
                dp[i]=profit;
            }
        
    }
        return dp;
    }

    public static int[] reverse(int[] arr){
        int n=arr.length;
        int[] rp=new int[n];
        for(int i=0;i<n;i++){
            rp[i]=arr[n-1-i];
        }
        return rp;
    }
    public int maxProfit(int[] prices) {
       int n=prices.length;
        int[] dp=maxi(prices);
        
       int[] rp=reverse(prices);
        
        int[] dp2=rmaxi(prices);
        
        
        
        
        
        
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(max< (dp[i]+dp2[i])){
                max=dp[i]+dp2[i];
            }
        }
        for(int i=0;i<dp.length;i++)
        {
        System.out.println(dp[i]+" "+dp2[i]);}
        return max;
    }
}
