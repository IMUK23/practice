public class fold_linked_list {
    public void fold() {
        int n;
      if(size%2==0){
          n=(size/2)-1;
      }
      else{
          n= (size+1)/2 - 1;
      }
      
      Stack<Node> st=new Stack<>();
      Node ptr = head;
      while(ptr!= null){
          st.push(ptr);
          ptr=ptr.next;
          
      }
      Node p=head;
      Node temp=p.next;
      while(n>0){
          Node between=st.pop();
          
          p.next=between;
          between.next=temp;
          p=temp;
          temp=temp.next;
          n--;
      }
      
      Node last=st.pop();
      last.next=null;
      tail=last;
      
    }
}
