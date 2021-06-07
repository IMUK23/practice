import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    
	    int t=Integer.parseInt(br.readLine());
	    
	    while(t>0){
	    String[] s=br.readLine().split(" ");
	    
	    int N=Integer.parseInt(s[0]);
	    int K=Integer.parseInt(s[1]);
	    
	    String val=br.readLine();
	    StringBuilder string = new StringBuilder(val);
        
	    
	    String[] ss=br.readLine().split(" ");
	    
	    int[] l=new int[ss.length];
	    
	    for(int i=0;i<ss.length;i++){
	       l[i]=Integer.parseInt(ss[i]);
	    }     
	    
	    
	    int fin=0;
	    
	    for(int i=0;i<string.length()-1;i++){
	        if(string.charAt(i)==string.charAt(i+1)){
	            fin+=2;
	        }
	        else{
	            fin+=1;
	        }
	    }
	    
	    
	    for(int i=0;i<l.length;i++){
	        int index=l[i]-1;
	        
	        if(index==0){
	            if(string.charAt(index)==string.charAt(index+1)){
	                
	                
	            fin-=1;    
	                
	            }
	            else{
	                
	                
	           fin+=1;     
	            }
	            
	            
	        }
	        else if(index==N-1){
	            if(string.charAt(index)==string.charAt(index-1)){
	           fin-=1;     
	            }
	            else{
	                fin+=1;
	            }
	        }
	        else{
	            if(string.charAt(index-1)==string.charAt(index+1)){
	                
	                if(string.charAt(index)==string.charAt(index+1)){
	                    fin-=2;
	                }
	                else{
	                    fin+=2;
	                }
	                
	                
	            }
	            
	            
	            
	        }
	        if(string.charAt(index)=='0')
	       {string.setCharAt(index,'1');}
	       else
	        {string.setCharAt(index,'0');}
	        
	    
	        System.out.println(fin);
	        
	    
	    
	    
	    
	    
	    }   
	        t--;
	    
	    
	    
	    
	    
	}
}
}