import java.io.*;
import java.util.*;

public class pattern_matching {

	public static void solution(String str, String pattern, HashMap<Character,String> map, String op)
		
		//base case
		{
                                    if(pattern.length() == 0){
                                        if(str.length() == 0){
                                            boolean[] arr = new boolean[26];
                                            for(int i = 0 ; i < op.length(); i++) {
                                                char ch = op.charAt(i);
                                                if(arr[ch - 'a'] == false) {
                                                    arr[ch - 'a'] = true;
                                                    System.out.print(ch + " -> " + map.get(ch) + ", ");
                                                }
                                            }
                                            System.out.println(".");
                                        }
                                        return;
                                    }
		
		//har pattern ke character pe jao or put krke dekhho kya kya set kr sakte hai
		char curr=pattern.charAt(0);
		String leftpattern=pattern.substring(1);
		
		
		if(map.containsKey(curr)){
		    String check=map.get(curr);
		    //Now compare this check string with window of size of check in str this window will be at starting
		    
		    if(str.length()>=check.length()){
		    String currstring=str.substring(0,check.length());
		    String leftstring=str.substring(check.length());
		    if(currstring.equals(check)){
		        solution(leftstring,leftpattern,map,op);
		    }
		    }
		    
		}
		else{
		    for(int i=0;i<str.length();i++){
		    String currstring=str.substring(0,i+1);
		    String leftstring=str.substring(i+1);
		    map.put(curr,currstring);
		    solution(leftstring,leftpattern,map,op);
		    map.remove(curr);
		    
		}
		    
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String pattern = scn.next();
		HashMap<Character,String> map = new HashMap<>();
		solution(str,pattern,map,pattern);
	}
}