import java.io.*;
import java.util.*;

public class max_score {
    
	public static int solution(String[] words, int[] farr, int[] score, int idx) {
		if(idx==words.length){
		    return 0;
		}
		
		int max;
		
		int no=0+solution(words,farr,score,idx+1);
		
		int yes=0;
		
		int wordscore=0;
		boolean flag=true; // agar kahi false hua to matlab frequency -ve chli gyi
		for(int i=0;i<words[idx].length();i++){
		char ch=words[idx].charAt(i);
		if(farr[ch-'a']==0){
		    flag=false;
		}
		farr[ch-'a']--;
		wordscore+=score[ch-'a'];
		}
		
		if(flag){
		    yes=wordscore+solution(words,farr,score,idx+1);
		}
		//ab backtrack krna hai to jitni freqyency ghatai utni badhao
		for(int i=0;i<words[idx].length();i++){
		    	char ch=words[idx].charAt(i);
		    farr[ch-'a']++;
		}
		max=Math.max(no,yes);
		return max;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int nofWords = scn.nextInt();
		String[] words = new String[nofWords];
		for(int i = 0 ; i < words.length; i++) {
			words[i] = scn.next();
		}
		int nofLetters = scn.nextInt();
		char[] letters = new char[nofLetters];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = scn.next().charAt(0);
		}
		int[] score = new int[26];
		for (int i = 0; i < score.length; i++) {
			score[i] = scn.nextInt();
		}
		if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null
				|| score.length == 0) {
			System.out.println(0);
			return;
		}
		int[] farr = new int[score.length];
		for (char ch : letters) {
			farr[ch - 'a']++;
		}
		System.out.println(solution(words, farr, score, 0));

	}
}