public class bst_inorder_preorder {
    class Solution {
        public  TreeNode util(int[] inorder,int[] preorder,int prepos,int start,int end){
            
            if(start>end || prepos>=preorder.length){
                return null;
            }
            
            int i=start;
            int val=inorder[i];
            int comp=preorder[prepos];
            while(i<=end){
                val=inorder[i];
                if(val == comp){
                    break;
                }
                i++;
            }
            TreeNode root=new TreeNode(val);
            int dist=i-start;
            root.left=util(inorder,preorder,prepos+1,start,i-1);
            root.right=util(inorder,preorder,prepos+dist+1,i+1,end);
            
            return root;
        }
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int n=inorder.length;
            TreeNode root=util(inorder,preorder,0,0,n-1);
            
            return root;
        }
    }
}
