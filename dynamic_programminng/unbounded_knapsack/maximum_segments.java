package unbounded_knapsack;
import java.util.*;
public class maximum_segments {
    public static  int maximizeCuts(int n, int x, int y, int z)
    {
        int[] dp=new int[n+1];
        dp[0]=0;
        
        for(int i=1;i<n+1;i++){
            if(i==x || i==y || i==z ){
                dp[i]=Math.max(dp[i],1);
            }
        
                if(i>x){
                if(dp[i-x] != 0){
                    dp[i]= Math.max(dp[i],1+dp[i-x]);
                }
                
                    
                }
            
            if(i>y){
                
                if(dp[i-y] != 0){
                    dp[i]= Math.max(dp[i],1+dp[i-y]);
                }
                
                
            }
            if(i>z){
                
                if(dp[i-z] != 0){
                    dp[i]= Math.max(dp[i],1+dp[i-z]);
                }
                
                
            }
                
            
        }
    /*for(int i=0;i<n+1;i++){
        System.out.print(" "+dp[i]);
    }
*/

    return dp[n];    
        
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        System.out.println(" "+maximizeCuts(n,x,y,z));

    }
}
