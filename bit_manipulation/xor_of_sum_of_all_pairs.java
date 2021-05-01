import java.io.*;
import java.util.*;

public class xor_of_sum_of_all_pairs {

    public static int solution(int[] arr){
      int xor=0;
      for(int a: arr){
          xor ^= (a+a);
      }
       
       return xor;
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