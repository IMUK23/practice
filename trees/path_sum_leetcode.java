class Solution {
    public boolean helper(TreeNode root,int sum,int targetSum){
        if(root==null){
            return false;
        }
       
        if(root.left==null && root.right==null){
            if(sum+root.val ==targetSum){
                return true;
            }
            return false;
        }
        boolean left=false,right=false;
        
        if(root.left!=null){
            left=helper(root.left,sum+root.val,targetSum);
        }
        if(root.right!=null){
            right=helper(root.right,sum+root.val,targetSum);
        }
        
        return (left || right) ;
        
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        
        return helper(root,sum,targetSum);
        
        
    }
}