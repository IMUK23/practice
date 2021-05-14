import java.io.*;
import java.util.*;

public class words_k_selection {
    public static void ksize(String s,int pos,int k,int start,String ans){
        if(pos==s.length()){
        if(start==k){
            System.out.println(ans);
        
        }
        
            return;
        }
        
        char ss=s.charAt(pos);
        
        ksize(s,pos+1,k,start+1,ans+ss);
       ksize(s,pos+1,k,start+0,ans+"");
        
        
        
        
        
        
    }
  public static void main(String[] args) throws Exception {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      String s=br.readLine();
      
      int k=Integer.parseInt(br.readLine());
      
      HashMap<Character,Integer> map=new HashMap<>();
      
      for(int i=0;i<s.length();i++){
         char c=s.charAt(i);
         
              map.put(c,1);
          
      }
      
      HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for (char ch : s.toCharArray()) {
      if (unique.contains(ch) == false) {
        unique.add(ch);
        ustr += ch;
      }
    }
      ksize(ustr,0,k,0,"");
      
      
    
  }
}
