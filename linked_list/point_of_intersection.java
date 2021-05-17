public class point_of_intersection {
    /*Non recursive Approach Time Complexity - O(m+n) Space Complexity - O(m+n)*/ 
    public static int findIntersection(LinkedList one, LinkedList two){
        Stack<Node> s1=new Stack<>();
         Stack<Node> s2=new Stack<>();
         Node ptr=one.head;
         while(ptr!=one.tail.next){
             s1.push(ptr);
             ptr=ptr.next;
         }
         ptr=two.head;
         while(ptr!=two.tail.next){
             s2.push(ptr);
             ptr=ptr.next;
         }
         int datad=0;
         
         while(s1.size()>0 && s2.size()>0 && s1.peek().data == s2.peek().data){
             datad=s1.peek().data;
             s1.pop();
             s2.pop();
             
         }
         
         return datad;
         
         
      }

      /*Another Approach Time Complexity-O(n) Space Complexity - O(1)*  Basically moving larger list to a point where size of both will be equal*/
      public static int findIntersection(LinkedList one, LinkedList two){
        Stack<Node> s1=new Stack<>();
         Stack<Node> s2=new Stack<>();
         Node ptr=one.head;
         while(ptr!=one.tail.next){
             s1.push(ptr);
             ptr=ptr.next;
         }
         ptr=two.head;
         while(ptr!=two.tail.next){
             s2.push(ptr);
             ptr=ptr.next;
         }
         int datad=0;
         
         while(s1.size()>0 && s2.size()>0 && s1.peek().data == s2.peek().data){
             datad=s1.peek().data;
             s1.pop();
             s2.pop();
             
         }
         
         return datad;
         
         
      }

      


}
