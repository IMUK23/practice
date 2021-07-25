class Solution
{
    public boolean Node_to_root(Node node,int n,ArrayList<Node> path){
     if(node==null){return false;}
     
     if(node.data==n){
         path.add(node);
         return true;
     }
     
     if(Node_to_root(node.left,n,path)){
         path.add(node);
         return true;
     }
     
     if(Node_to_root(node.right,n,path)){
         path.add(node);
         return true;
     }
     
     return false;
    }
    
    public Node LCA(ArrayList<Node> path1,ArrayList<Node>path2){
      
        Node res=null;
        for(int i=path1.size()-1,j=path2.size()-1;i>=0 && j>=0;i--,j--){
            Node n1=path1.get(i);
            Node n2=path2.get(j);
           
            if(n1==n2){
               res=n1;
            }
            else{
                break;
            }
            
        }
        return res;
    }
    //Function to return the lowest common ancestor in a Binary Tree.
	Node lca(Node root, int n1,int n2)
	{
		ArrayList<Node> path1 =new ArrayList<>();
		boolean b1=Node_to_root(root,n1,path1);
		ArrayList<Node> path2 =new ArrayList<>();
		boolean b2=Node_to_root(root,n2,path2);
		if(!b1 && !b2){return null;}
		Node res=LCA(path1,path2);
		
		return res;
	}
}
