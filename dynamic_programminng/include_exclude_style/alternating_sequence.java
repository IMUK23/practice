package include_exclude_style;

import java.util.*;
public class alternating_sequence {
    
    public class Pair{
        int val;
        int sign;
        
        public Pair(){
            val=1;
            sign=1;
        }
        
    }
    public int wiggleMaxLength(int[] nums) {
        /*int n=nums.length;
        
        if(n==1) {
            return n;
        }
        if(n==2){
            if(nums[0]!=0 && nums[1]!=0){
                return 2;
            }
            return 1;
        }
        
        Pair[] dp=new Pair[n];
        for(int i=0;i<n;i++){
            dp[i]=new Pair();
        }
        
        
        
       
        dp[0].val=1;
        dp[0].sign=(int)Math.signum(nums[0]);
        
        for(int i=1;i<n;i++){
            
        
            for(int j=0;j<=i-1;j++){
            
                if(dp[j].val==1){
                    if(dp[j].sign == 0 && (int)Math.signum(nums[i]-nums[j])==0){
                        dp[i].val=1;
                        dp[i].sign=0;
                    }       
                    else{
                        if(dp[i].val< 2 && (int)Math.signum(nums[i]-nums[j])!=0){
                            dp[i].val=2;
                            dp[i].sign=(int)Math.signum(nums[i]-nums[j]);
                        }
                        else if(dp[i].val< 2 && (int)Math.signum(nums[i]-nums[j])==0){
                            dp[i].val=1;
                            dp[i].sign=(int)Math.signum(nums[i]-nums[j]);
                        }
                    }
                }
                else{
                     if((int)Math.signum(nums[i]-nums[j])!=0  && ((int)Math.signum(nums[i]-nums[j])!= dp[j].sign)){
                if(dp[i].val<1+dp[j].val){
                    dp[i].val=1+dp[j].val;
                    dp[i].sign=(int)Math.signum(nums[i]-nums[j]);
                }
            }
                }
                    
            
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<dp[i].val){
                max=dp[i].val;
            }
        }
        
        return max;*/
         int val=1;
        
        int[] up=new int[nums.length];
        int[] down=new int[nums.length];
        up[0]=1;
        down[0]=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                up[i]=down[i-1]+1;
                down[i]=down[i-1];
            }
            else if(nums[i]<nums[i-1]){
                up[i]=up[i-1];
                down[i]=up[i-1]+1;
            }
            else{
                up[i]=up[i-1];
                down[i]=down[i-1];
            }
        }
        int max=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        int m=Math.max(up[i],down[i]);
        
        max=Math.max(m,max);
    }    
        return max;
        
    }
}