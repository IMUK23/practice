public class kadane_algorithm {
//Function to find the sum of contiguous subarray with maximum sum.
int maxSubarraySum(int arr[], int n){
        
    int curr_max=arr[0];
   int max_far=arr[0];
   
   
   for(int i=1;i<n;i++){
       curr_max=Math.max(arr[i],arr[i]+curr_max);
       max_far=Math.max(max_far,curr_max);
   }
   
   return max_far;    
}
}
