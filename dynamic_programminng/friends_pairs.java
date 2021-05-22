public class friends_pairs {
    public long countFriendsPairings(int n) 
    {   
       //this is different problem than friends pairing in k parts
       if(n<3){
           return n;
       }
       else{
       long mod=(long)Math.pow(10,9)+7;
       long b=1;
       long a=2;
       long curr=0;
        for(int i=3;i<n+1;i++){
            curr=(a+(i-1)*b)%mod;
            b=a;
            a=curr;
            
        }       
          
           
           
       return curr; }   
       }
          
}
