import java.io.*;
import java.util.*;

public class merge_sorted_array {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    int[] c=new int[a.length+b.length];
    int f1=0;
    int f2=0;
    
    for(int i=0;i<c.length;i++){
        if(f1==a.length){
            c[i]=b[f2];
            f2++;
        }
        else if(f2==b.length){
            c[i]=a[f1];
            f1++;
            
        }
        else if(a[f1]<b[f2]){
            c[i]=a[f1];
            f1++;
        }
        else if(a[f1]>b[f2]){
            c[i]=b[f2];
            f2++;
        }
        else{
            c[i]=a[f1];
            f1++;
        }
    }
    
    return c;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}