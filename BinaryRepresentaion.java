import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int ans = 0;
     
        while(T-- > 0)
        {
      StringBuilder binary = new StringBuilder();
            int num = sc.nextInt();
            if(num==0)
                System.out.println(num);
                while(num > 0)
            {
                ans = num%2;
                binary.append(ans);
                num = num/2;
            }
            binary = binary.reverse();
            System.out.println(binary);
            // int bin_num = Integer.parseInt(binary.toString());
            // System.out.println(bin_num);
           
        }
    }
}