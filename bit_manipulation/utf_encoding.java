import java.io.*;
import java.util.*;

public class utf_encoding {
    public static int starting(int num) {
       int n=num;
       if((n>>7)==0b0){
           return 0;
       }
       else if((n>>6) ==0b10){
           return 1;
       }
       else if((n>>5) ==0b110){
           return 2;
       }
       else if((n>>4) ==0b1110){
           return 3;
       }
       else{
           return 4;
       }
       
    }
    
    public static boolean solution(int[] arr) {
       boolean value=true;
        int count=0;
        int x=0;
        for(int val : arr){
            if(count!=0){
                x=starting(val);
                if(x!=1){
                    value=false;
                    break;
                }
                else{
                    count--;
                }
            }
            else
            {
                x=starting(val);
                if(x!=0){
                    if(x==1){
                        value=false;
                        break;
                    }
                    else{
                        count=x-1;
                    }
                }
            }
            
        }
        return value;
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }
    
    
}
