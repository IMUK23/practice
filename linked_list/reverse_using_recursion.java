import java.io.*;
import java.util.*;
public class reverse_using_recursion {
    public static class LinkedList {
        Node head;
        Node tail;
        int size;    

    void addLast(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = null;
  
        if (size == 0) {
          head = tail = temp;
        } else {
          tail.next = temp;
          tail = temp;
        }
  
        size++;
      }
  
      public int size() {
        return size;
      }
  
    
  
    public void addFirst(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = head;
        head = temp;
  
        if (size == 0) {
          tail = temp;
        }
  
        size++;
      }
  
  
    private void reversePRHelper(Node node){
        if(node.next==null){
            return;
        }
        
        Node n=node.next;
        reversePRHelper(n);
        
        n.next=node;
        
      }
  
      public void reversePR(){
        Node temp=this.head;
        Node ptr=temp;
        reversePRHelper(ptr);
        this.head=this.tail;
        temp.next=null;
        this.tail=temp;
      }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
          int d = Integer.parseInt(values1[i]);
          l1.addLast(d);
        }
    
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
    
        l1.display();
        l1.reversePR();
        l1.addLast(a);
        l1.addFirst(b);
        l1.display();
      }
}
