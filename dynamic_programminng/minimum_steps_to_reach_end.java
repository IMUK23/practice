import java.io.*;
import java.util.*;
public class minimum_steps_to_reach_end {
    static int minJumps(int[] arr){
        int n=arr.length;
        if(arr[0]==0){
            return -1;
            
        }
        
        if(arr.length<=1){
            return 0;
        }
        
        
        int maxreach=arr[0];
        int steps=arr[0];
        int jump= 1;
        
        for(int i=1;i<n;i++){
            if(i==n-1){
                System.out.println("maxreach : "+maxreach+"steps : "+steps+"jumps :"+jump);
                return jump;
            }
            
            maxreach=Math.max(maxreach,i+arr[i]);
            
            steps--;
            
            if(steps==0){
                jump++;
                
                if(i>=maxreach){
                    return -1;
                }
                
                steps=maxreach-i;
            }
            
            System.out.println("maxreach : "+maxreach+"steps : "+steps+"jumps :"+jump);  
        }
        
       return -1; 
        
    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        
        System.out.println(minJumps(arr));
    }
}
