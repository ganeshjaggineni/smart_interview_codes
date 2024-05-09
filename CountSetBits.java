import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
          Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
     
        while(T-- > 0)
        {
            long N = sc.nextLong();
            int count = 0;
            while(N>0)
            {
            if((N&1) == 1)
                count++;
            N=N>>1;
            }
            System.out.println(count);
        }

    }
}