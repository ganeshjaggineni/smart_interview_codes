import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
         Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            long A = sc.nextLong();
            long B = sc.nextLong();

            long setbits = A^B;
            int count = 0;
            while(setbits > 0)
            {
                if((setbits&1) ==1)
                    count++;
               setbits =  setbits>>1;
            }
            System.out.println(count);
        }
    }
}