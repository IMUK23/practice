import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }

  public static int solution(int n){
    if(n==0){
        return 0;
        
    }
    int x= (int)(Math.log(n)/Math.log(2));
   
    int greatestpower= x*(1<<x-1);
    int sigbits= n-(1<<x) +1;
    
    int ans= greatestpower+sigbits+solution(n-(1<<x));
   
    return ans;
    
  }
  
}