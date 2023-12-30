/*
				Rectangle Pattern

Print rectangle pattern. See the example for more details.



Input Format

The first and only line of input contains a single integer N.



Output Format

For the given integer, print a rectangle pattern as shown in the example.



Constraints

1 <= N <= 50



Example

Input

5



Output

5432*

543*1

54*21

5*321

*4321



Explanation



Self Explanatory


*/
//PROGRAM

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int rows=1;rows<=n;rows++)
        {
            int printnum = n;
            for(int cols=1;cols<=n;cols++)
            {
                if(cols !=n+1-rows)
                {
                    System.out.print(printnum--);
                }
                else
                {
                    System.out.print("*");
                    printnum--;
                }
                
            }
            System.out.println();
        }
    }
}