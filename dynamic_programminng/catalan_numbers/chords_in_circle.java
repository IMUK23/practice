package catalan_numbers;
import java.io.*;
import java.util.*;

public class chords_in_circle{
    public static long NumberOfChords(int n){
        long[] dp=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            int c=i-1;
            int l=0;
            while(c>=0){
                dp[i]+=(long)(dp[c]*dp[l]);
                c--;
                l++;
            }
        }
        
        return dp[n];
    }
  public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(NumberOfChords(n));
	}
}
