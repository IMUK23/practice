import java.io.*;
import java.util.*;

public class cryptarithmatic {
   
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String s1 = scn.nextLine();
      String s2 = scn.nextLine();
      String s3 = scn.nextLine();
  
      HashMap<Character, Integer> charIntMap = new HashMap<>();
      String unique = "";
      for (int i = 0; i < s1.length(); i++) {
        if (!charIntMap.containsKey(s1.charAt(i))) {
          charIntMap.put(s1.charAt(i), -1);
          unique += s1.charAt(i);
        }
      }
  
      for (int i = 0; i < s2.length(); i++) {
        if (!charIntMap.containsKey(s2.charAt(i))) {
          charIntMap.put(s2.charAt(i), -1);
          unique += s2.charAt(i);
        }
      }
  
      for (int i = 0; i < s3.length(); i++) {
        if (!charIntMap.containsKey(s3.charAt(i))) {
          charIntMap.put(s3.charAt(i), -1);
          unique += s3.charAt(i);
        }
      }
  
      boolean[] usedNumbers = new boolean[10];
      solution(unique, 0, charIntMap, usedNumbers, s1, s2, s3);
    }
  
    
    public static void solution(String unique, int idx, 
                                HashMap<Character, Integer> charIntMap, boolean[] usedNumbers, 
                                String s1, String s2, String s3) {
                                    
              //Each character in unique has options to get 0-9 because other than we cant assign any value
          if(idx==unique.length()){
              int a=0,b=0,c=0;
              for(int i=0;i<s1.length();i++){
                  char sub=s1.charAt(i);
                  a=(10*a+charIntMap.get(sub));
              }
              for(int i=0;i<s2.length();i++){
                  char sub=s2.charAt(i);
                  b=(10*b+charIntMap.get(sub));
              }
              for(int i=0;i<s3.length();i++){
                  char sub=s3.charAt(i);
                  c=(10*c+charIntMap.get(sub));
              }
              if(a+b==c){
                  ArrayList<Character> z=new ArrayList<Character>(charIntMap.keySet());
                  Collections.sort(z);
                  for( char key : z ) {
                  System.out.print(key+"-"+charIntMap.get(key)+" ");
                  }
                  System.out.println();
                  return;
              }
              else{
              
              return;
                  
              }
          }	
          
          char c=unique.charAt(idx);
          for(int i=0;i<=9;i++){
              if(usedNumbers[i]==false){
                  charIntMap.put(c,i);
                  usedNumbers[i]=true;
                  solution(unique,idx+1,charIntMap,usedNumbers,s1,s2,s3);
                  usedNumbers[i]=false;
                  charIntMap.put(c,-1);
              }
          }
         
    }
}
  
