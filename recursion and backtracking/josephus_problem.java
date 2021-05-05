import java.io.*;
import java.util.*;

public class josephus_problem {

public static int solution(int n, int k){
                                if(n == 1){ // base case
                                  return 0;
                                }else{
                                  int x =  (solution(n - 1, k)); // faith
                                  int y = (x + k) % n; // meeting our expectation	
                                   return y; 
                                }
                                
                            }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    System.out.println(solution(n,k));
  }
  

}
