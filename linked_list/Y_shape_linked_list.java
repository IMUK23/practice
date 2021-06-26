public class Y_shape_linked_list {
    class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         int size1=0;
         int size2=0;
         Node ptr1=head1;
         Node ptr2=head2;

         while(ptr1!=null){
             size1++;
             ptr1=ptr1.next;
         }
         
         while(ptr2!=null){
             size2++;
             ptr2=ptr2.next;
         }
         
    if(size1<size2){
        int diff=size2-size1;
        while(diff>0){
            head2=head2.next;
            diff--;
            
        }
        while(head2!=null){
             if(head1==head2){
                return head1.data;
            }
            head1=head1.next;
            head2=head2.next;
        }
    }
    else if(size1>size2){
        int diff=size1-size2;
        while(diff>0){
            head1=head1.next;
            diff--;
        }
        while(head2!=null){
             if(head1==head2){
                return head1.data;
            }
            head1=head1.next;
            head2=head2.next;
        }
    }
    else{
        while(head1!=null){
            if(head1==head2){
                return head1.data;
            }
            head1=head1.next;
            head2=head2.next;
        }
    }
         
     return -1;    
	}
}
}
