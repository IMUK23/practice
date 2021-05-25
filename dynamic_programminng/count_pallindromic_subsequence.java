public class count_pallindromic_subsequence 
{
    long countPS(String s)
    {
        long mod=1000000000+7;
        long[][] dp =new long[s.length()][s.length()];
    
   //This loop maintanins the gap between i and j as i and j are having gap from 0 to end 
   //We are traversing in diagonal manner
    for(int g=0;g<s.length();g++)
    {
        for(int i=0,j=g;j<s.length();i++,j++){
        if(g==0){
            dp[i][j]=1;
        }
        else if(g==1){
            if(s.charAt(i)==s.charAt(j)){
                dp[i][j]=3;
            }
            else{
                dp[i][j]=2;
            }
        }
        else{
            if(s.charAt(i)==s.charAt(j)){
                dp[i][j]=(1+dp[i][j-1]+dp[i+1][j])%mod;
            }
            else{
                //Addition of mod caused prevention of -ve mod 
                dp[i][j]=((dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1])%mod+mod)%mod;
            }
        }
            
        }
        
        
        
    }
    
    return (dp[0][s.length()-1]);
    }
}