package two_pointer;
/*This is not a Linked List question but it is fased on Floyd Cycle detection Algo*/ 
public class delete_duplicate_special {
    class Solution {
        public int findDuplicate(int[] nums) {
        /* 
        
        
        int val=-1;
            for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
                 if(nums[i]==nums[j]){
                     val= nums[i];
                     break;
                 }
                 if(val>=0){
                     break;
                 }
             }
         }
            return val;
       
       */
            
        /*This question is too copy similar to linked list cycle deletion
        in that we were moving like slow.next and fast.next.next in this we move like num[slow] and num[num[fast]]
        and same until slow ==fast
        and again slow is at start and now move slow and fast and equal speed they catch up at intersection
        */    
         int slow=nums[0];
        int fast=nums[0];
            do
            {slow=nums[slow];
            fast=nums[nums[fast]];
            }while(fast!=slow);
            
            
            slow=nums[0];
            while(slow!=fast){
                slow=nums[slow];
                fast=nums[fast];
            }
            return fast;
            
              
          
            
            
       }
        
    }
}
