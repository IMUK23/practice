/*leetcode*/ 
import java.util.*;
public class binary_tree_level_order {
    
// Definition for a binary tree node.
 public class TreeNode {
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
 
class Solution {
    class Pair{
        TreeNode node;
        int level;
        
        public Pair(TreeNode n,int l){
            this.node=n;
            this.level=l;
        }
        
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>a =new ArrayList<>();
        
        
        if(root==null){
            return a;
        }
        
        ArrayDeque<Pair> q=new ArrayDeque<>();
        
        q.add(new Pair(root,1));
        
        while(q.size()>0){
            Pair p=q.removeFirst();
            
            if(a.size()<p.level){
                a.add(new ArrayList<Integer>());
                a.get(p.level-1).add(p.node.val);
            }
            else{
                a.get(p.level-1).add(p.node.val);
            }
            if(p.node.left !=null){
                q.add(new Pair(p.node.left,p.level+1) );
            }
            if(p.node.right !=null){
                q.add(new Pair(p.node.right,p.level+1) );
            }
        }
        
        
        
        
       
        
        
        return a;
        
    
    
    }
}
}
