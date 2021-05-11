import java.io.*;
import java.util.*;

public class largest_with_k_swaps {

	static String max;
	public static void findMaximum(String str, int k) {
		 if (Integer.parseInt(str) > Integer.parseInt(max)){
		        max=str;
		    }
		
		if(k==0){
		    
		    return;
		}
		
		for(int i=0;i<str.length();i++){
		    for(int j=i+1;j<str.length();j++){
		        int a=str.charAt(i)-'0';
		        int b=str.charAt(j)-'0';
		        if(b>a){
		            String next=swap(str,i,j);
		            findMaximum(next,k-1);
		        }
		    }
		}
		
	}
	
	public static String swap(String str,int i,int j){
	    char a=str.charAt(i);
	    char b=str.charAt(j);
	    
	    String front =str.substring(0,i)+ b+str.substring(i+1,j)+a+str.substring(j+1);
	    
	    return front;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();
		 max = str;
		findMaximum(str, k);
		System.out.println(max);
	}

}