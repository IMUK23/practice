public class bst_inorder_postorder {
    class Solution {
        public  TreeNode util(int[] inorder,int[] postorder,int prepos,int start,int end){
           
           if(start>end || prepos<0){
               return null;
           }
           
           int i=start;
           int val=inorder[i];
           
           int comp=postorder[prepos];
           while(i<=end){
               val=inorder[i];
               if(val == comp){
                   break;
               }
               i++;
           }
           TreeNode root=new TreeNode(val);
           int dist=end-i;
           
           root.left=util(inorder,postorder,prepos-dist-1,start,i-1);
           root.right=util(inorder,postorder,prepos-1,i+1,end);
           
           return root;
       }
       
       public TreeNode buildTree(int[] inorder, int[] postorder) {
             int n=inorder.length;
               int n2=postorder.length;
       
           TreeNode root=util(inorder,postorder,n2-1,0,n-1);
           
           return root;
       }
   }
}
