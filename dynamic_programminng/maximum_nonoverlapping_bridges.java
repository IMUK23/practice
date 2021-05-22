import java.io.*;
import java.util.*;
public class maximum_nonoverlapping_bridges{
     
    public static class Bridges implements Comparable<Bridges>{
        int np;
        int sp;
        
        public  void add(int a,int b){
            np=a;
            sp=b;
        }
        
        public int compareTo(Bridges o){
            /* BottleNeck ye comparision sirf north point ke liye hai incase agar dono same hue to pehle kon aega 
            Answer - jiska south chota hoga*/
            if(np!=o.np)
            {return np-o.np;}
            else{
                return sp-o.sp;
            }
        }
        
        public  void display(){
            System.out.println(np+" "+sp);
        }
        
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        
        Bridges[] arr =new Bridges[n];
        
        for(int i=0;i<n;i++){
            Bridges b=new Bridges();
            
             arr[i]=b;
        }
        
        
        for(int i=0;i<n;i++){
            String[] s=br.readLine().split(" ");
            int a=Integer.parseInt(s[0]);
            int b=Integer.parseInt(s[1]);
            
            arr[i].add(a,b);
        }
        
        
        Arrays.sort(arr);
        /*
        for(int i=0;i<n;i++){
            
            arr[i].display();
        }
        
      
        
        Now you see we have sorted array in terms of north pole now its just a maximum increasing subsequence problem */
        
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i].sp>=arr[j].sp){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
            if(max<dp[i]){
                max=dp[i];
            }
            
        }
        
        
        System.out.println(max);
        
        
        
        
    }
}