public class add_two_numbers {
    public static int addTwoListsHelper(Node one, Node two,int p1,int p2,LinkedList res) {
        if(one==null && two==null){
            return 0;
        }
        int dataa=0;
        int nxarr;
        if(p1>p2){
            int carr=addTwoListsHelper(one.next,two,p1-1,p2,res);
            dataa= one.data+carr;
            res.addFirst(dataa%10);
            nxarr=dataa/10;
            return nxarr;
        }
        else if(p2>p1){
            int carr=addTwoListsHelper(one,two.next,p1,p2-1,res);
            dataa= two.data+carr;
            res.addFirst(dataa%10);
            nxarr=dataa/10;
            return nxarr;
        }
        
        else{
            int carr=addTwoListsHelper(one.next,two.next,p1-1,p2-1,res);
            dataa= one.data+two.data+carr;
            res.addFirst(dataa%10);
            nxarr=dataa/10;
            return nxarr;
        }
}
