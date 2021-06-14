package gap_strategy_with_internal_movement;

import java.io.*;
import java.util.*;

public class boolean_parenthization {

    
    public static boolean operation(boolean a,boolean b,char op){
        if(op == '^'){
            return a^b;
        }
        else if(op == '|'){
            return a|b;
        }
        else{
            return a&b;
        }
    }
    
    public static boolean getValue(char c){
      //  System.out.println("Yes");
        boolean out =c=='T'?true:false;
        return out;
    }
    
    
    
	public static int solution(String str1, String str2) {
		int n= str1.length();
		int[][] t=new int[n][n];
        int[][] f=new int[n][n];
        

        for(int g=0;g<n;g++){
            
            for(int i=0,j=g;j<n;i++,j++){
                if(g==0){
                    if(str1.charAt(i)=='T'){
                        t[i][j]=1;
                        f[i][j]=0;
                    }
                    else{
                        t[i][j]=0;
                        f[i][j]=1;
                    }
                   
                }
                else{
                    for(int k=i;k<j;k++){
                        
                        int ltc=t[i][k];
                        int rtc=t[k+1][j];
                        int lfc=f[i][k];
                        int rfc=f[k+1][j];
                        
                        char operator=str2.charAt(k);
                    if(operator=='&'){
                      t[i][j]+= ltc*rtc;
                      f[i][j]+= (ltc*rfc + lfc*rtc + lfc*rfc);
                    }
                    else if(operator=='|'){
                        t[i][j]+= (ltc*rfc + lfc*rtc + ltc*rtc);
                        f[i][j]+= lfc*rfc;
                    }
                    else{
                        t[i][j]+= (lfc*rtc + rfc*ltc);
                        f[i][j]+= (ltc*rtc + lfc*rfc);
                    }
                        
                    }
                        
                    
                    
                }
                
                
            }
            
        }
        
        return t[0][n-1]; 
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1, s2));
	}

}


