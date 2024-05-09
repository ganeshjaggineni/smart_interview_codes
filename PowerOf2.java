import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            long n = sc.nextLong();
            
               if((n&(n-1)) == 0)
                    System.out.println("True");
                else
                    System.out.println("False");
            
           
        }

    }
}