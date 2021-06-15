/*LEETCODE 654

Time complexity - Average-O(nlogn) Worst - O(n^2)
Space Complexity - O(n)
*/ 
public class maximum_binary_tree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
       TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int[] getleft(int i,int[] nums){
      int[] left=new int[i];
      for(int j=0;j<i;j++){
          left[j]=nums[j];
      }
      return left;
  }
  
      public int[] getright(int i,int[] nums){
      int size=nums.length-1-i;
          int[] right=new int[size];
      for(int j=i+1;j<nums.length;j++){
          right[j-i-1]=nums[j];
      }
      return right;
  }
  public TreeNode constructMaximumBinaryTree(int[] nums) {
      if(nums.length==0){
          return null;
      }
     
      TreeNode newnode=new TreeNode();
      int min=0;
      for(int i=1;i<nums.length;i++){
          if(nums[min]<nums[i]){
              min=i;
          }
      }
      newnode.val=nums[min];
      int[] left=getleft(min,nums);
      int[] right=getright(min,nums);
      
      
      
      newnode.left= constructMaximumBinaryTree(left);
      newnode.right=constructMaximumBinaryTree(right);
      
          
          return newnode;
      
  }
}