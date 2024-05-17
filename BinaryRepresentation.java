/*
Binary Representation 
Max Score: 50

Given a positive integer, print its binary representation.



Input Format

The first line of input contains T - the number of test cases. It's followed by T lines, each line containing a single integer.



Output Format

For each test case, print a binary representation, separated by a new line.



Constraints

1 <= T <= 10000

0 <= N <= 109



Example

Input

5

10

15

7

1

120



Output

1010

1111

111

1

1111000



Explanation



Self Explanatory
*/

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
