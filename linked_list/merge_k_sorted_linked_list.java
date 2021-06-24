import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class items implements Comparable<items>{
    Node item;
    
    public items(Node n){
        item=n;
    }
    
    public int compareTo(items b){
        return item.data-b.item.data;
    }
}
class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        Node head=null;
        Node ptr=head;
        
        PriorityQueue<items> pq=new PriorityQueue<>();
        for(int i=0;i<K;i++){
            pq.add(new items(arr[i]));
        }
        while(pq.size()>0){
           items p= pq.remove();
           if(ptr==null){
               ptr=p.item;
               head=ptr;
               
           }
           else{
               ptr.next=p.item;
               ptr=ptr.next;
               
           }
           if(p.item.next!=null){
               pq.add(new items(p.item.next));
           }
            
        }
        return head;
    }
}