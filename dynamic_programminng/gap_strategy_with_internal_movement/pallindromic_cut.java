package gap_strategy_with_internal_movement;

import java.io.*;
import java.util.*;

public class pallindromic_cut {
    public static int minPalindromicCut(String s) {
   /* tIME COMPLEXITY - O(N^3)
      int n = s.length();

        int[][] dp = new int[n][n];
        boolean[][] check = new boolean[n][n];
        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    check[i][j] = true;
                } else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        check[i][j] = true;
                    } else {
                        check[i][j] = false;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (check[i + 1][j - 1]) {
                            check[i][j] = true;
                        } else {
                            check[i][j] = false;
                        }
                    } else {
                        check[i][j] = false;

                    }
                }
            }
        }

        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    dp[i][j] = 0;
                } else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = 1;
                    }
                } else {
                    if (check[i][j]) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = Integer.MAX_VALUE;

                        for (int k = i; k < j; k++) {
                            dp[i][j] = Math.min(dp[i][j], 1 + dp[i][k] + dp[k + 1][j]);
                        }

                    }

                }

            }
        }

        return dp[0][n - 1];*/
        /* tIME COMPLEXITY - O(N^2) */
        int n=s.length();
        int[] val=new int[n];

          boolean[][] check = new boolean[n][n];
        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    check[i][j] = true;
                } else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        check[i][j] = true;
                    } else {
                        check[i][j] = false;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (check[i + 1][j - 1]) {
                            check[i][j] = true;
                        } else {
                            check[i][j] = false;
                        }
                    } else {
                        check[i][j] = false;

                    }
                }
            }
        }
        int min;
        for(int j=0;j<n;j++){
            min=j;
            for(int i=0;i<=j;i++){
                if(s.charAt(i)==s.charAt(j) &&(j-i <3 || check[i+1][j-1])){
                    min= i==0?0:Math.min(min,val[i-1]+1);
                }
            }
            val[j]=min;

        }


        return val[n-1];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(minPalindromicCut(str));
    }
}
