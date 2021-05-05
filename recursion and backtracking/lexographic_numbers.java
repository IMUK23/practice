import java.io.*;
import java.util.*;

public class lexographic_numbers {
	public static void lexographic(int curr,int num){
	    if(curr>num){
	        return;
	    }
	    if(curr<=num && curr!=0){
	        System.out.println(curr);
	        for(int i=0;i<=9;i++){
	        lexographic(10*curr+i,num);
	    }
	        return;
	    }
	    for(int i=1;i<=9;i++){
	        lexographic(curr+i,num);
	    }
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int curr=1;
		lexographic(0,n);
	}
	
}