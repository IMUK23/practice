package include_exclude_style;

public class house_robber {
    public int include_exclude(int[] nums){
        if(nums.length==1){
            return nums[0];
        } 
     int max=Integer.MIN_VALUE;
     int[] in =new int[nums.length];
     int[] ex =new int[nums.length];    
     in[0]=nums[0];
         for(int i=1;i<nums.length;i++ ){
             in[i]=ex[i-1]+nums[i];
             ex[i]=Math.max(in[i-1],ex[i-1]);  
         }
         max=Math.max(in[nums.length-1],ex[nums.length-1]);
     
     
     return max; 
     }
}
