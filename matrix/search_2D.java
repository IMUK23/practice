public class search_2D {
    class Solution {
        
      /* Time Complexity- O(m+logn) 
       public boolean binarysearch(int[][] matrix,int row, int target){
            int start=0;
            int end=matrix[row].length-1;
            
            while(start<=end){
                
                int mid=(start+end)/2;
                if(matrix[row][mid]==target){
                    return true;
                }
                else if(matrix[row][mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return false;
            
            
        }
        public boolean searchMatrix(int[][] matrix, int target) {
            int r=matrix.length;int c=matrix[0].length-1;
            int i=0;
            while(i<r){
                
                if(matrix[i][0]<=target && matrix[i][c]>=target){
                    return binarysearch(matrix,i,target);
                }
                i++;
            }
            
            return false;
        }*/

    /*Time complexity - O(logm + logn)*/ 
    public boolean binarysearch(int[][] matrix,int row, int target){
        int start=0;
        int end=matrix[row].length-1;
        
        while(start<=end){
            
            int mid=(start+end)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
        
        
    }
    public boolean searchMatrix(int[][] matrix, int target) {
       int top=0;
        int down=matrix.length-1;
        
        while(top<=down){
            
            int mid=(top+down)/2;
            if(matrix[mid][0]<=target && matrix[mid][matrix[0].length-1]>=target){
                return binarysearch(matrix,mid,target);
            }
            else if(matrix[mid][0]>target){
                down=mid-1;
            }
            else{
                top=mid+1;
            }
        }
        return false;
    }

    }
}
