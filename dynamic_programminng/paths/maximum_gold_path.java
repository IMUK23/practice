package paths;
/*Bhai question pichle wale jaisa hi hai bss mushkil itni hai ki order kya hai ye ni pta chalta*/

import java.io.*;
import java.util.*;

public class maximum_gold_path {

   private static class Pair {
      String psf;
      int i;
      int j;

      public Pair(String psf, int i, int j) {
         this.psf = psf;
         this.i = i;
         this.j = j;
      }
   }
   
   public static int solution(int[][] dp){
       int n=dp.length;
       int m=dp[0].length;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           if(dp[i][m-1]>max){
               max=dp[i][m-1];
           }
           
       }
       return max;
       
   }
   
   
   public static int[][] maxcost(int[][] arr){
       int n=arr.length;
       int m=arr[0].length;
       
       
       int[][] dp=new int[n][m];
       
       
       for(int j=0;j<m;j++){
           for(int i=0;i<n;i++){
               
               if(j==0){
                   dp[i][j]=arr[i][j];
               }
               
               else if(i==0){
                   dp[i][j]=arr[i][j]+Math.max(dp[i+1][j-1],dp[i][j-1]);
               }
               else if(i==n-1){
                   dp[i][j]=arr[i][j]+Math.max(dp[i-1][j-1],dp[i][j-1]);
               }
               
               else{
                   dp[i][j]=arr[i][j]+Math.max(Math.max(dp[i+1][j-1],dp[i][j-1]),dp[i-1][j-1]);
               }
               
           }
       }
       return dp;
   }
   
   
   public static void maxcostpath(int[][] dp){
       
       //1)taking all the values having max value in last column of dp and adding
       // them to the queue
       
       //then removing them one by one until and unless we reach 0th column 
       //print the path with row 
       
       
       int n=dp.length;
       int m=dp[0].length;
       
       ArrayDeque<Pair> q=new ArrayDeque<>();
       
       int max=solution(dp);
       
       
       for(int i=0;i<n;i++){
           if(dp[i][m-1] == max){
               q.add(new Pair("",i,m-1));
               /*System.out.println(q.peek().i);*/
           }
       }
       
       while(q.size()>0){
           Pair p=q.removeFirst();
           
           if(p.j==0){
               System.out.println(p.i+" "+p.psf);
           }
           
           else{
               if(p.i==0){
                   int g=Math.max(dp[p.i][p.j-1],dp[p.i+1][p.j-1]);
                   
                    
                   
                   
                   if(dp[p.i+1][p.j -1]==g){
                       q.add(new Pair("d1 "+p.psf , p.i+1,p.j-1));
                   }
                  
                  if(dp[p.i][p.j -1]==g){
                       q.add(new Pair("d2 "+p.psf , p.i,p.j-1));
                   }
                   
                  
                   
               }
               
               else if(p.i==n-1){
                   int g=Math.max(dp[p.i][p.j -1],dp[p.i-1][p.j -1]);
                   if(dp[p.i][p.j -1]==g){
                       q.add(new Pair("d2 "+p.psf , p.i,p.j-1));
                   }
                   if(g==dp[p.i-1][p.j -1]){
                       q.add(new Pair("d3 "+p.psf , p.i-1,p.j-1));
                   }
                   
               }
               
               else{
                   int g=Math.max(Math.max(dp[p.i-1][p.j-1],dp[p.i][p.j-1]),dp[p.i+1][p.j-1]);
                   
                   
                   if(g==dp[p.i][p.j-1]){
                      q.add(new Pair("d2 "+p.psf , p.i,p.j-1)); 
                   }
                    
                   if(g==dp[p.i-1][p.j-1]){
                       q.add(new Pair("d3 "+p.psf , p.i-1,p.j-1));
                   }
                   
                   if(g==dp[p.i+1][p.j-1]){
                       q.add(new Pair("d1 "+p.psf , p.i+1,p.j-1));
                   }
                  
                  
                   
               }
               
               
           }
           
           
           
       }
       
       
       
       
   }
   
   
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());
      int[][] arr = new int[n][m];

      for (int i = 0; i < n; i++) {
         String str = br.readLine();
         for (int j = 0; j < m; j++) {
            arr[i][j] = Integer.parseInt(str.split(" ")[j]);
         }
      }

    int[][] dp=maxcost(arr);
    System.out.println(solution(dp));
    maxcostpath(dp);
    
    /*for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }*/
    
   }


}