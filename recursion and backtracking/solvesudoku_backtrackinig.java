import java.util.*;
public class solvesudoku_backtrackinig {
    public static void display(int[][] board){
        for(int i = 0; i < board.length; i++){
          for(int j = 0; j < board[0].length; j++){
            System.out.print(board[i][j] + " ");
          }
          System.out.println();
        }
      }
    
      public static void solveSudoku(int[][] board, int i, int j) {
        if(i==board.length){
            display(board);
            return;
        }
        int ni,nj;
        //next findout krenge 
        if(j==board.length-1){
            ni=i+1;
            nj=0;
        }
        else{
            ni=i;
            nj=j+1;
        }
        
       
        if(board[i][j]>0){
        solveSudoku(board,ni,nj);
        }
                else{
                    // it means value is 0 and we have to check what value will be here
                    
                    for(int po=1;po<=9;po++){
                        if(isValid(board,i,j,po) == true){
                            board[i][j]=po;
                        solveSudoku(board,ni,nj);
                        board[i][j]=0;
                        }
                    }
                }
            
        
      }
      
      public static boolean isValid(int[][] board,int x,int y,int po){
          for(int i=0;i<board.length;i++){
              if(board[x][i]==po){
                  return false;
              }
          }
          for(int i=0;i<board.length;i++){
              if(board[i][y]==po){
                  return false;
              }
          }
          int gridi= (x/3)*3;
          int gridj= (y/3)*3;
          for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                  if(board[gridi+i][gridj+j]==po){
                      return false;
                  }
              }
          }
          return true;
}
