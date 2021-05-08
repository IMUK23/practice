import java.io.*;
import java.util.*;
public class palindromic_permutations {
    

	public static void generatepw(int cs, int ts, HashMap<Character, Integer> fmap, Character oddc, String asf) {
        if(cs>ts){
            
            String result=asf;
            String rev="";
            
            for(int i=asf.length()-1;i>=0;i--){
                rev+=asf.charAt(i);
            }
            
            if(oddc!=null){
                result+=oddc;
            }
            
            result+=rev;
            
            System.out.println(result);
            return;
        }
        for(char c:fmap.keySet()){
            int freq=fmap.get(c);
            if(freq>0){
                fmap.put(c,freq-1);
                generatepw(cs+1,ts,fmap,oddc,asf+c);
                fmap.put(c,freq);
            }
        }	
        }
    
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            HashMap<Character, Integer> fmap = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
            }
            
            int oddn=0;
            int len=0;
            Character oddchar=null;
            for(char c: fmap.keySet()){
               int freq=fmap.get(c);
                if(freq% 2 ==1){
                    oddn++;
                    oddchar=c;
                }
               
              fmap.put(c,freq/2);
              
              //total size of half string with character frequency as even
              len=len+(freq/2);
            }
            
        if(oddn>1){
            System.out.println(-1);
            return;
        }
        
        generatepw(1,len,fmap,oddchar,"");
        
        }
}
