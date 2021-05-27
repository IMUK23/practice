import java.util.*;

public class count_distince_subsequences{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        int n=s.length();
        long[] dp =new long[n+1];
        
        int[] checker=new int[26];
        dp[0]=1;
        
        for(int i=1;i<n+1;i++){
                dp[i]=2*dp[i-1];
            
                char c=s.charAt(i-1);
                if(checker[c-'a']==0){
                    
                    
                }
                else{
                 int index=checker[c-'a'];
                 dp[i]-=(dp[index-1]);
                 
                }
                
                checker[c-'a']=i;
            }
            
        
        
        System.out.println(dp[n]-1);
        
    }
}