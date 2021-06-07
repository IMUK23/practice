public class buy_sell_stock2 {
    public int maxProfit(int[] prices) {
        /*int min=prices[0];
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
                   profit+=max-min;
                   min=curr;
               }
           }
           return profit;
           }
           */
            int maxprofit = 0;
           for (int i = 1; i < prices.length; i++) {
               if (prices[i] > prices[i - 1])
                  { maxprofit += prices[i] - prices[i - 1];}
           }
           return maxprofit;
       
       }
}
