public class flatten_linked_list {
    class GfG
{
    class items implements Comparable<items>{
        Node item;
        
        public items(Node n){
            item=n;
        }
        
        public int compareTo(items b){
            return item.data-b.item.data;
        }
    }
    Node merge(Node a,Node b){
        if(a==null) return b;
        if(b==null) return a;
        
        if(a.data<=b.data){
            
            a.bottom=merge(a.bottom,b);
            return a;
        }
        else {
            
            b.bottom=merge(a,b.bottom);
            return b;
        }
        
    }
    
    Node flatten(Node root)
    {
      /*  This is also correct solution but uses extra space
	PriorityQueue<items> pq=new PriorityQueue<>();
    Node ptr=root;
    
    Node head=null;
    Node flag=null;
   
    while(ptr!=null){
        pq.add(new items(ptr));
        ptr=ptr.next;
    }
    if(pq.size()>0){
        items i=pq.remove();
        if(i.item.bottom!=null){
            pq.add(new items(i.item.bottom));
        }
        head=new Node(i.item.data);
    }
    flag=head;
    while(pq.size()>0){
        items i=pq.remove();
        flag.bottom=new Node(i.item.data);
        flag=flag.bottom;
    
        if(i.item.bottom!=null){
            pq.add(new items(i.item.bottom));
           
        }
    }

   return head;*/

   /*This does not use extra space*/ 
   if(root==null){
       return null;
   }
   
   root.next=flatten(root.next);
   root=merge(root,root.next);
   
   return root;
   
    }
}
}
