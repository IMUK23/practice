import java.io.*;
import java.util.*;
public class cross_word {

	public static void solution(char[][] arr, String[] words, int vidx){
	if(vidx==words.length){
	    print(arr);
	    return;
	}	    
		    
		    
		    String word=words[vidx];
		    for(int i=0;i<arr.length;i++){
		        for(int j=0;j<arr[0].length;j++){
		            if(arr[i][j]=='-'|| arr[i][j]==word.charAt(0))
		            {if(canPlaceHorizontally(arr,word,i,j)==true){
		                boolean[] is=new boolean[word.length()];
		                is=placeHorizontally(arr,word,i,j);
		                solution(arr,words,vidx+1);
		                removeHorizontally(arr,word,is,i,j);
		            }
		            if(canPlaceVertically(arr,word,i,j)==true){
		                boolean[] is=new boolean[word.length()];
		                is=placeVertically(arr,word,i,j);
		                solution(arr,words,vidx+1);
		                removeVertically(arr,word,is,i,j);
		        }}
		    }
	
	}
	}    
    
    public static boolean canPlaceHorizontally(char[][] arr,String word,int i,int j){
        int k=0;

            for(;k<word.length();k++){
                                
               if(k+j>=arr.length){
                   return false;
               }
               if(arr[i][j+k]=='-' || arr[i][j+k]==word.charAt(k)){
                   continue;
               }
               else{
                   return false;
               }
                
            }
            
                if(j+k==arr.length || arr[i][j+k]=='+'){
                    return true;
                }
                else{
                    return false;
                }
    }
    
    public static boolean canPlaceVertically(char[][] arr,String word,int i,int j){
       int k=0;

            for(;k<word.length();k++){
                                
               if(k+i>=arr.length){
                   return false;
               }
               if(arr[i+k][j]=='-' || arr[i+k][j]==word.charAt(k)){
                   continue;
               }
               else{
                   return false;
               }
                
            }
            
                if(i+k==arr.length || arr[i+k][j]=='+'){
                    return true;
                }
                else{
                    return false;
                }
    }
    
    public static boolean[] placeHorizontally(char[][] arr,String word,int i,int j){
        boolean[] is=new boolean[word.length()];
        
        for(int k=0;k<word.length();k++){
            if(arr[i][j+k]==word.charAt(k)){
                continue;
            }
            else{
                arr[i][j+k]=word.charAt(k);
                is[k]=true;
            }
        }
        return is;
    }
    
    public static void removeHorizontally(char[][] arr,String word,boolean[] is,int i,int j){
        for(int k=0;k<is.length;k++){
            if(is[k]){
                arr[i][j+k]='-';
            }
        }
    }
	
	public static void removeVertically(char[][] arr,String word,boolean[] is,int i,int j){
        for(int k=0;k<is.length;k++){
            if(is[k]){
                arr[i+k][j]='-';
            }
        }
    }
	
	
    public static boolean[] placeVertically(char[][] arr,String word,int i,int j){
        boolean[] is=new boolean[word.length()];
        
        for(int k=0;k<word.length();k++){
            if(arr[i+k][j]==word.charAt(k)){
                continue;
            }
            else{
                arr[i+k][j]=word.charAt(k);
                is[k]=true;
            }
        }
        return is;
    }
    
    
    
	
	public static void print(char[][] arr){
		for(int i = 0 ; i < arr.length; i++){
			for(int j = 0 ; j < arr.length; j++){
				System.out.print(arr[i][j]);
			}
                  System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[][] arr = new char[10][10];
		for(int i = 0 ; i < arr.length; i++){
			String str = scn.next();
			arr[i] = str.toCharArray();
		}
		int n = scn.nextInt();
		String[] words = new String[n];
		for(int i = 0 ; i  < words.length; i++){
			words[i] = scn.next();
		}
		
		solution(arr,words,0);

	}
}