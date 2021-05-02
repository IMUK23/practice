import java.io.*;
import java.util.*;

public class convert_A2B {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();

    int c= (a^b);
    
    int count=0;
    int rsb;
    while(c!=0){
        rsb= (c & -c);
        c=c-rsb;
        count++;
    }
    System.out.println(count);
  }

}
