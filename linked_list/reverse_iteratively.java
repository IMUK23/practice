import java.util.*;

class reverse_iteratively {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverse(ListNode head) {
     if(head==null||head.next==null){
         return head;
     }
     
     if(head.next.next==null){
         ListNode one=head;
         ListNode two=head.next;
         
         two.next=one;
         one.next=null;
         return two;
     }
      ListNode prev,curr,nex;
     /* My-solution sahi hai but thoda ajeeb hai specially ye loop ke baad wali statement
    
     
     
     prev=head;
     curr=head.next;
     nex=curr.next;
     prev.next=null;
     while(nex!=null){
         curr.next=prev;
         prev=curr;
         curr=nex;
         nex=nex.next;
     }
     
     curr.next=prev;
     
     return curr;
      */  
      
     /*Sir's Solution */
    
    prev=null;
     curr=head;
     nex=null;
    
     while(curr!=null){
         nex=curr.next;
         curr.next=prev;
         prev=curr;
         curr=nex;

     }
     
     
     
     return prev; 
     
      
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = reverse(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
head = head.next;
        }
    }
}