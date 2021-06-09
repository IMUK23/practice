package catalan_numbers;

import java.io.*;
import java.util.*;

public class traingulation_in_polygon {

    public static long solution(int n) {
        long[] dp = new long[n - 1];

        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n - 2; i++) {
            int one = i - 1;
            int other = 0;
            while (one >= 0) {
                dp[i] += (long) (dp[one] * dp[other]);
                one--;
                other++;
            }
        }

        return dp[n - 2];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solution(n));
    }

}
