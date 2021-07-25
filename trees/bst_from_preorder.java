import java.util.*;
public class bst_from_preorder {
    class Solution {
        public TreeNode bstFromPreorder(int[] preorder) {
         if(preorder.length==0){return null;}
            
        Stack<TreeNode> st=new Stack<>();
        TreeNode node=new TreeNode(preorder[0]);
        st.push(node);
            
        for(int i=1;i<preorder.length;i++){
            if(preorder[i]<st.peek().val){
                TreeNode parent=st.peek();
                TreeNode child=new TreeNode(preorder[i]);
                parent.left=child;
                st.push(child);
            }
            else{
                TreeNode parent=st.peek();
                TreeNode curr=null;
                while(st.size()>1 && parent.val<preorder[i]){
                    curr=st.pop();
                     parent=st.peek();
                }
                if(st.size()==1){
                    if(parent.val<preorder[i])
                    {TreeNode set=new TreeNode(preorder[i]);
                    parent.right=set;
                    st.pop();
                    st.push(set);}
                    else{
                    TreeNode set=new TreeNode(preorder[i]);
                    curr.right=set;
                    st.push(set);    
                    }
                }
                else{
                    TreeNode set=new TreeNode(preorder[i]);
                    curr.right=set;
                    st.push(set);
                }
            }
        }    
            
         return node;   
        }
    }
}
