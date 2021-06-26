public class remove_duplicates_from_sorted_ll {
    class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {if(head==null || head.next == null){
        return head;
    }
        
	    Node ptr=head;
	    Node temp=ptr.next;
	    while(temp.next!=null){
	        if(ptr.data==temp.data){
	            temp=temp.next;
	        }
	       else{ ptr.next=temp;
	       ptr=ptr.next;
	        temp=temp.next;}
	    }
	    if(ptr.data==temp.data){
	        ptr.next=null;
	    }
	    else{
	        ptr.next=temp;
	    }
	    return head;
    }
}
}
