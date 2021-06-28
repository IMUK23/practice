import java.util.*;
public class spiral_traversal{
    class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
     ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        int w,x,y,z;
        w=0;
        x=0;
        y=c-1;
        z=r-1;
        ArrayList<Integer> res=new ArrayList<>();
        while(w<=z && x<=y){
            /*Step 1 Move j from x to y at i=w */
           if(w==z){
             for(int j=x;j<=y;j++){
                res.add(matrix[w][j]);
            }
           }
           else if(x==y){
              for(int i=w;i<=z;i++){
                res.add(matrix[i][y]);
            } 
           }
           else{for(int j=x;j<=y;j++){
                res.add(matrix[w][j]);
            }
            
            /*Step 2 move i from w+1 to z at j=y*/
            
            for(int i=w+1;i<=z;i++){
                res.add(matrix[i][y]);
            }
            
            /*Step 3 move j from y-1 to x at i=z*/
            for(int j=y-1;j>=x;j--){
                res.add(matrix[z][j]);
            }
            
            /*Step 4 move i from z-1 to w+1 at j=x*/
            
            for(int i=z-1;i>=w+1;i--){
                res.add(matrix[i][x]);
            }}
            
            
            /*Update w,x,y,z*/
            w++;
            z--;
            x++;
            y--;
        }
        return res;
    }
}

}