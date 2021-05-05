
import java.io.*;
import java.util.*;

public class nqueens_branch_and_bound {
    
    public static void nqueens(boolean[][] board,int row,boolean[] col,boolean[] diag,boolean[] rdiag,String path){
    if(row==board.length){
        System.out.println(path+".");
        return;
    }    
        
        
        for(int c=0;c<board.length;c++){
            if(board[row][c]==false && col[c]==false && diag[row+c]==false &&  rdiag[row-c+board.length-1]==false){
board[row][c]=true;
col[c]=true; 
diag[row+c]=true; 
rdiag[row-c+board.length-1]=true;
nqueens(board,row+1,col,diag,rdiag,path+row+"-"+c+", ");
board[row][c]=false;
col[c]=false; 
diag[row+c]=false; 
rdiag[row-c+board.length-1]=false;
            }
        }
    }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    
    
    boolean[] col=new boolean[n];
    boolean[] diag=new boolean[2*n-1];
    boolean[] rdiag =new boolean[2*n-1];
    
    String path="";
    nqueens(board,0,col,diag,rdiag,path);
    
  }

}