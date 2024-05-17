/*
Swap Bits 
Max Score: 50

Given a number, swap the adjacent bits in the binary representation of the number, and print the new number formed after swapping.



Input Format

The first line of input contains T - the number of test cases. Each of the next T lines contains a number N.



Output Format

For each test case, print the new integer formed after swapping adjacent bits, separated by a new line.



Constraints

1 <= T <= 100000

0 <= N <= 109



Example

Input

4

10

7

43

100



Output

5

11

23

152



Explanation



Test-Case 1

Binary Representation of 10: 000...1010

After swapping adjacent bits: 000...0101 (5)



Test-Case 2

Binary Representation of 7: 000...0111

After swapping adjacent bits: 000...1011 (11)
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
       
        while(T-- > 0)
        {
           
            long n = sc.nextLong();
             long lsb_bit1 = 0;
        long lsb_bit2 = 0;
      
            for(int i=0;i<32;i=i+2)
            {
                lsb_bit1 = (n>>i)&1;
                lsb_bit2 = (n>>(i+1))&1;
                if(lsb_bit1 != lsb_bit2)
                {
                    n = n^(1<<i);
                    n = n^(1<<i+1);
                }
            }
            System.out.println(n);
        }
          
    }
}
