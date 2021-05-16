public class ispallindrome {
    public boolean IsPalindrome() {
        Node ptr=head,global=head;
        Stack<Node> st=new Stack<>();
        while(ptr!=null){
            st.push(ptr);
            ptr=ptr.next;
        }
        while(global !=tail.next){
            Node m=st.peek();
            if(m.data != global.data){
                return false;
            }
            st.pop();
            global=global.next;
        }
        return true;
    }   
}
