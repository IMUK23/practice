import java.util.*;
public class dfs {
    public void dfs(int src,boolean[] visited, ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>res){
        if(visited[src]==false){
            visited[src]=true;
            res.add(src);
            for(int i:adj.get(src)){
                dfs(i,visited,adj,res);
            }
            
        }
        
        return;
    }
    
    //Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
       /*Recursive*/
       
       ArrayList<Integer> res=new ArrayList<>();
       boolean[] visited=new boolean[V];
       
       /*dfs(0,visited,adj,res);
       
       */
       
       
       /*Iterative*/
       Stack<Integer> st=new Stack<>();
       st.push(0);
       int s=0;
       while(st.size()>0){
           s=st.peek();
           st.pop();
           
           if(visited[s]==false){
               res.add(s);
               visited[s]=true;
           }
           Iterator<Integer> itr = adj.get(s).iterator();
                 
                while (itr.hasNext())
                {
                    int v = itr.next();
                    if(visited[v]==false)
                        st.push(v);
                }
           
       }
       
       
       
       return res;
    }
}