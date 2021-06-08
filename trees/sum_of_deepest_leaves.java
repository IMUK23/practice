
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

public class sum_of_deepest_leaves {
  int deepest=0,sum=0;
  public int deep(TreeNode root,int depth){
       if(root==null){
          return 0;
      }
      if(root.left ==null && root.right ==null){
          if(depth==deepest){
              sum=sum+root.val;
          }
          else if(depth>deepest){
              sum=root.val;
              deepest=depth;
          }
      }
      deep(root.left,depth+1);
      deep(root.right,depth+1);
      System.out.println(sum);
      return sum;
  }
  public int deepestLeavesSum(TreeNode root) {
      /*Using BFS*/
      /*ArrayDeque<TreeNode> q=new ArrayDeque<>();
      q.add(root);
      int sum=0,i;
      while(q.size()>0){
          for(i=q.size()-1,sum=0;i>=0;i--){
              TreeNode p = q.removeFirst();
              sum=sum+p.val;
              
              if(p.left !=null){
                  q.add(p.left);
              }
              if(p.right !=null){
                  q.add(p.right);
              }
          }
      }
      
      
     return sum ;*/
      
      /*DFS Approach*/
      
     return deep(root,0);
      
      
      
      
  }
}