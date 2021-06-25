package two_pointer;

public class detect_loop {
    class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
    class Solution {
        //Function to check if the linked list has a loop.
        public  boolean detectLoop(Node head){
           /*Floyd Cycle Detection Algorithm*/
           Node slow=head;
           Node fast=head;
           
           while(slow!=null && fast!=null && fast.next!=null){
               fast=fast.next.next;
               slow=slow.next;
               if(slow==fast){
                   return true;
               }
               
           }
           return false;
           /*Node flag=head;
            Node ptr=head.next;
            while(ptr!=null && ptr!=flag){
                if(checker.contains(ptr)){
                    return true;
                }
                checker.add(ptr);
                ptr=ptr.next;
            }
            return false;*/
        }
    }
}
