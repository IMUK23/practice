import java.io.*;
import java.util.*;

public class reduce_to_1  {

    public static int solution(long n) {

        int count = 0;
        while(n != 1) {
            if(n % 2 == 0) {
                n = n/2;
            }
            else {
                if(n == 3) {
                    count += 2;
                    break;
                }
                else if( n%4 ==1){
                    n=n-1;
                }
                else if( n%4 ==3){
                    n=n+1;
                }
            }
            count ++;
        }
        return count;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        System.out.println(solution(n));
    }
	
	
}

