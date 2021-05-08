import java.io.*;
import java.util.*;

public class tug_of_war{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		solve(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
		System.out.println(ans);
	}

	static int mindiff = Integer.MAX_VALUE;
	static String ans = "";

	public static void solve(int[] arr, int vidx, ArrayList<Integer> set1, ArrayList<Integer> set2, int soset1,
			int soset2) {
		if(vidx==arr.length){
		    if(set1.size()==set2.size() || Math.abs(set1.size()-set2.size())==1)
		    {if(mindiff > Math.abs(soset1-soset2)){
		        mindiff=Math.abs(soset1-soset2);
		        ans=set1+" "+set2;
		    }}
		    return;
		}
		
		int num=arr[vidx];
		
		
		
		set1.add(num);
		soset1+=num;
		solve(arr,vidx+1,set1,set2,soset1,soset2);
		soset1-=num;
		set1.remove(set1.size()-1);
		
		set2.add(num);
		soset2+=num;
		solve(arr,vidx+1,set1,set2,soset1,soset2);
		soset2-=num;
		set2.remove(set2.size()-1);
	}

}
