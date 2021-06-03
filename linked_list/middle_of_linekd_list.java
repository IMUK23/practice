
import java.util.*;

public class middle_of_linekd_list {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode midNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode curr=head;
        ListNode jump=head;
        
        /*For second mid node
          while(jump!=null && jump.next!=null){
            jump=jump.next.next;
            curr=curr.next;
            
        }
        
        */



        /*for first mid node*/ 
        while(jump.next!=null && jump.next.next!=null){
            jump=jump.next.next;
            curr=curr.next;
            
        }
        
        
        return curr;
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

        ListNode head = midNode(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}