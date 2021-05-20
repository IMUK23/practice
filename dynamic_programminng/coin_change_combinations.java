import java.util.*;
public class coin_change_combinations {
    

    public long count(int S[], int m, int target) 
    { 
        //storage , definition-no of coin change at ith position using given coins 
        long[] dp=new long[target+1];
        dp[0]=1;
        for(int i=0;i<m;i++){
            int val=S[i];
            for(int j=1;j<target+1;j++){
                if(j>=val){
                    dp[j]+=dp[j-val];
                }
            }
        }
        
        return dp[target];
        
    } 
}
