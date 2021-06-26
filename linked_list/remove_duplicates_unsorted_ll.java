public class remove_duplicates_unsorted_ll {
    
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         HashSet<Integer> set=new HashSet<>();
         
         Node ptr=head;
         Node prev=new Node(-1);
         while(ptr.next!=null){
             if(!set.contains(ptr.data)){
                 prev.next=ptr;
                 prev=prev.next;
                 set.add(ptr.data);
             }
             ptr=ptr.next;
         }
         if(!set.contains(ptr.data)){
             prev.next=ptr;
         }
         else{
             prev.next=null;
         }
         
         return head;
    }
}

}
