public class tree_from_binary_string {
    public class Solution {
        /**
         * @param s: a string
         * @return: a root of this tree
         */
        public ArrayList<String> getStrings(String s){
            ArrayList<String> res=new ArrayList<>();
            if(s==""){
                res.add("");
                res.add("");
                return res;
            }
          
            int lc=0;
            int rc=0;
            String left="";
            String right="";
            boolean on=false;
    
            for(int i=0;i<s.length();i++){
                if(!on){
                    if(s.charAt(i)=='('){
                        lc++;
                        left=left+'(';
                    }
                    else if(s.charAt(i)==')'){
                        rc++;
                        left=left+")";
                    }
                    else{
                        left=left+s.charAt(i);
                    }
                  if(lc-rc == 0){
                      on=true;
                  }  
                }
                else{
                   if(s.charAt(i)=='('){
                        lc++;
                        right=right+"(";
                    }
                    else if(s.charAt(i)==')'){
                        rc++;
                        right=right+")";
                    }
                    else{
                        right=right+s.charAt(i);
                    } 
                }
    
           
    
            
            }
             if(left.length() >=3){
                left=left.substring(1,left.length()-1);
            }
    
            if(right.length() >=3){
                right=right.substring(1,right.length()-1);
            }
    
            
            res.add(left);
            res.add(right);
            return res;
        }
        public TreeNode str2tree(String s) {
            if(s==""){return null;}
            int val;
            String str="";
            int i;
            for(i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    break;
                }
                str=str+s.charAt(i);
            }
    
            val=Integer.parseInt(str);
            TreeNode root=new TreeNode(val);
            String left="";
            String right="";
    
            
                ArrayList<String> arr=getStrings(s.substring(i));
                left=arr.get(0);
                right=arr.get(1);
                root.left=str2tree(left);
                root.right=str2tree(right);
           
            
    
            return root;
    
    
        }
    }
}
