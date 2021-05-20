public class buy_sell_stock {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        int max=prices[0];
        
        for(int i=1;i<prices.length;i++){
            int curr=prices[i];
            if(curr<min){
                min=curr;
                max=curr;
                continue;
            }
            if(curr>max){
                max=curr;
                profit=Math.max(profit,max-min);
            }
        }
        return profit;
        
        
        
        
    }
}
