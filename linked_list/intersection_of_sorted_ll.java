public class intersection_of_sorted_ll {
class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
       Node head=new Node(-1);
       Node ptr=head;
       
       while(head1!=null && head2!=null){
           if(head1.data<head2.data){
               head1=head1.next;
           }
           else if(head2.data<head1.data){
               head2=head2.next;
           }
           else{
               ptr.next=new Node(head1.data);
               head1=head1.next;
               ptr=ptr.next;
           }
       }
       
       return head.next;
    }
}
}
