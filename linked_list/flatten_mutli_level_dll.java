public class flatten_mutli_level_dll {
    /*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
       
    public Node flatten(Node root) {
        
        /**This stack stores the next point which is stopped because of child */
        Stack<Node> st=new Stack<>();
        Node head=root;
        while(head != null){
            /*if child is there then*/
            if(head.child != null){
                /*Also there is next*/
                if(head.next != null){
                    /*next is in the stack*/
                    st.push(head.next);
                }
                /*we added child as the next*/
                    head.next=head.child;
                    head.child.prev=head;
                head.child=null;
                
            }
            /*Now if there is no child but still there might be some next pointers in the stack*/
            else if(head.next == null && !st.isEmpty()){
                /*Now popping them as head and adding at last*/
                head.next = st.pop();
                head.next.prev = head;
            }
            /*This makes the head keep on moving*/
            head=head.next;
            
        }
        return root;
    }
}
}
