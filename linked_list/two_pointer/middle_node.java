package two_pointer;

public class middle_node {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
        class Solution {
            //Function to check if the linked list has a loop.
            public  Node findmiddle(Node head){
               /*Floyd Cycle Detection Algorithm*/
               Node slow=head;
               Node fast=head;
               
               while(fast!=null && fast.next!=null){
                   fast=fast.next.next;
                   slow=slow.next;
                   
                   }
                return slow;   
               }
            
            }
        }
    