public class add_two_number_ {
/*used when output requires head node of linked list*/
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution{
        
    static Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        
        Node curr=head;
        Node prev=null;
        Node nex=null;
        
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
    }    
    
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        Node head1=reverse(first);
        Node head2=reverse(second);
        Node head3=null;
        Node ans=null;
        Node head=ans;
        int carr=0;
        while(head1!=null && head2!=null){
            int data=head1.data+head2.data+carr;
            int val=data%10;
             carr=data/10;
            Node nn=new Node(val);
            if(ans==null){
                head3=nn;
                ans=nn;
            }
            else{
                ans.next=nn;
                ans=ans.next;
            }
            head1=head1.next;
            head2=head2.next;
            
            
        }
       while(head1!=null){
           int data=head1.data+carr;
            int val=data%10;
             carr=data/10;
            Node nn=new Node(val);
            if(ans==null){
                head3=nn;
                ans=nn;
            }
            else{
                ans.next=nn;
                ans=ans.next;
            }
            head1=head1.next;
       }
       while(head2!=null){
           int data=head2.data+carr;
            int val=data%10;
             carr=data/10;
            Node nn=new Node(val);
            if(ans==null){
                head3=nn;
                ans=nn;
            }
            else{
                ans.next=nn;
                ans=ans.next;
            }
            head2=head2.next;
       }
       
      if(carr!=0){
          Node nn=new Node(carr);
          ans.next=nn;
      }
      head3=reverse(head3);
      return head3;
    }
}
}
