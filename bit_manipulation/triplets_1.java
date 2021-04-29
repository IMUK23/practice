import java.io.*;
import java.util.*;
public class triplets_1 {
   //Question - To find no of triplets in an array which divides array in two parts and left and right parts are equal

	public static void solution(int[] arr){
		int count=0;
		for(int i=0;i<arr.length;i++){
		
		    int xor=arr[i];
		    for(int k=i+1;k<arr.length;k++){
		        xor^=arr[k];
		        if(xor==0){
		            count+=k-i;
		        }
		    }
		    
		}
		System.out.println(count);
		
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        solution(arr);
    }
	
	
}

