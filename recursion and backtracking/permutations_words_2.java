import java.io.*;
import java.util.*;
public class permutations_words_2 {
    public static void generateWords(int cc, String str, Character[] spots, 
    HashMap<Character, Integer> lastOccurence) {
//base condition
if(cc==str.length()){
for(char c:spots){
System.out.print(c);
}

System.out.println();
return;
}

char ch=str.charAt(cc);
//fiinding out ki last me kaha pe set tha
int lo=lastOccurence.get(ch);
//ab usse aage hi lagega ye character warna duplicacy hojaegi kyuki sane character hai
for(int i=lo+1;i<spots.length;i++){
//agar spot khali hai tabhi dalega
if(spots[i]==null){
spots[i]=ch;
lastOccurence.put(ch,i);//ab last occurance is character ki i hai
generateWords(cc+1,str,spots,lastOccurence);
lastOccurence.put(ch,lo);//wapas aate hue las occurence wahi hogyi
spots[i]=null;
}
}
}

public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();

Character[] spots = new Character[str.length()];
HashMap<Character, Integer> lastOccurence = new HashMap<>();
for(char ch: str.toCharArray()){
lastOccurence.put(ch, -1);
}

generateWords(0, str, spots, lastOccurence);
}
}
