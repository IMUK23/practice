package catalan_numbers;
import java.io.*;
import java.util.*;
public class count_valleys {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        
        if(n==0||n==1){
            System.out.println(1);
            return;
        }
        
        int[] dp=new int[n+1];
        
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            int inside=i-1;
            int outside=0;
            
            while(inside>=0){
                dp[i]+=dp[inside]*dp[outside];
                inside--;
                outside++;
            }
        }
        
        
        System.out.println(dp[n]);
        
        
        
     }
}
