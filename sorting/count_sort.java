import java.io.*;
import java.util.*;

public class count_sort {

  public static void countSort(int[] arr, int min, int max) {
    
    int size=max-min+1;
    int[] freq=new int[size];
    
    for(int i=0;i<arr.length;i++){
        freq[arr[i]-min]++;
    }
    
    for(int i=1;i<freq.length;i++){
        freq[i]+=freq[i-1];
    }
    int[] newar=new int[arr.length];
    for(int i=arr.length-1;i>=0;i--){
        int val=arr[i]-min;
        /*freq ki jo value hai wo 1 index based hai aur position zero index based hai islie -1 kiya*/
        newar[freq[val]-1]=arr[i];
        freq[val]--;
        
    }
    for(int i=0;i<arr.length;i++){
        arr[i]=newar[i];
    }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}