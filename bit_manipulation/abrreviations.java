import java.io.*;
import java.util.*;

public class abbreviations {

    public static void solve(String str){
        for(int i=0;i<(1<<str.length()/* <- This is 1000 for length 3 i.e 8*/);i++){
          //i 0 se 7 gya as per example
          StringBuilder sb=new StringBuilder();
          int count=0;
          for(int j=0;j<str.length();j++)
          //j 0 to str.length isliye gaya kyuki merko poore string ke character dekhne the
          {
              // yaha bit ki value string lndex se ulti hai matlab string ka 0 bit ka str.legnth()-1 hai islie wapas ara hai
              int bit=str.length()-j-1;
              
              if((i & (1 << bit))==0){
                  if(count==0){
                      sb.append(str.charAt(j));
                  }
                  else{
                      sb.append(count);
                      sb.append(str.charAt(j));
                      count=0;
                  }
              }
              else{
                  count++;
              }
          }
          if(count>0){
              sb.append(count);
          }
         System.out.println(sb);  
            
        }
     
    }
    
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solve(str);
    }
}
