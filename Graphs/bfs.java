import java.util.*;
class bfs
{
    //Function to return Breadth First Traversal of given graph.
    
    public void bfs(ArrayDeque<Integer> q ,boolean[] visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res){
        if(q.size()==0){
            return;
        }
        int src=q.removeFirst();
        
        if(visited[src]==false){
            res.add(src);
            visited[src]=true;
            for(int i : adj.get(src)){
                q.add(i);
            }
        }
        bfs(q,visited,adj,res);
        
        return;
    }
    
    
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        /*Recursive BFS*/
        
        ArrayList<Integer> res=new ArrayList<>();
        ArrayDeque<Integer> q=new ArrayDeque<>();
        boolean[] visited=new boolean[V];
        q.add(0);
        
        bfs(q,visited,adj,res);
        
        return res;
        
        
     /*  Iterative BFS  
     ArrayDeque<Integer> q=new ArrayDeque<>();
       ArrayList<Integer> res=new ArrayList<>();
       res.add(0);
       
       boolean[] arr=new boolean[V];
       arr[0]=true;
       q.add(0);
       while(q.size()>0){
           int i=q.removeFirst();
           
           ArrayList<Integer> s=adj.get(i);
           
           for(int j:s){
               if(arr[j]==false){
                   q.add(j);
                   res.add(j);
                   arr[j]=true;
               }
           }
           
       }
       return res;*/
    }



    
}