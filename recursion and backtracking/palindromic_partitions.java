import java.io.*;
import java.util.*;
public class palindromic_partitions {
    
    public static boolean isPalindrome(String str){
        
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        
        return str.equals(rev);
        
        
    } 
	public static void solution(String str, String asf) {
	    if(str.length()==0){
	        System.out.println(asf);
	        return;
	    }
		 for(int i=0;i<str.length();i++){
		     String sub=str.substring(0,i+1);
		     
		     if(isPalindrome(sub)){
		         String other=str.substring(i+1);
		         solution(other,asf+"("+sub+") ");
		     }
		 }
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		solution(str, "");
	}
}
