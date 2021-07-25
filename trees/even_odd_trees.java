public class even_odd_trees {
    class Solution {
        public boolean isEvenOddTree(TreeNode root) {
            ArrayDeque<TreeNode> q=new ArrayDeque<>();
            
            int count=0;
            q.add(root);
            
            while(q.size()>0){
                
                    if(count==0){
                        int val=Integer.MIN_VALUE;
                        //System.out.println(q.size());
                        int size=q.size();
                        for(int i=0;i<size;i++){
                            TreeNode node=q.removeFirst();
                            
                            if(node.val<=val || node.val%2==0){
                               // System.out.println("breakpoint "+node.val);
                                return false;
                            }
                            val=node.val;
                            if(node.left!=null){q.add(node.left);}
                            if(node.right!=null){q.add(node.right);}
                            
                        }
                        count=1;
                    }
                    else{
                        int val=Integer.MAX_VALUE;
                        //System.out.println(q.size());
                        int size=q.size();
                        for(int i=0;i<size;i++){
                            TreeNode node=q.removeFirst();
                            
                            if(node.val>=val || node.val%2==1){
                                //System.out.println("breakpoint "+node.val);
                                return false;
                            }
                            val=node.val;
                            if(node.left!=null){q.add(node.left);}
                            if(node.right!=null){q.add(node.right);}
    
                        }
                        count=0;
                    }
                
            }
            
            return true;
        }
    }
}
