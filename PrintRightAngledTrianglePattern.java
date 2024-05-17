/*
Print Right Angled Triangle Pattern 
Max Score: 50

Print a mirror image of a right-angled triangle using '*'. See examples for more details.



Input Format

The First line of input contains T - the number of test cases. It's followed by T lines, each line contains a single integer N - the size of the pattern.



Output Format

For each test case, print the test case number as shown, followed by the pattern, separated by a new line.



Constraints

1 <= T <= 100

1 <= N <= 100



Example

Input

4
2
1
5
10


Output

Case #1:
 *
**
Case #2:
*
Case #3:
    *
   **
  ***
 ****
*****
Case #4:
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********


Explanation



Self Explanatory
*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
       
            int temp = T;
        while(T-- > 0)
        {
           int N = sc.nextInt();
           System.out.println("Case #"+(temp-T)+":");
           for(int row=1;row<=N;row++)
           {
               for(int spaces=1;spaces<=N-row;spaces++)
               {
                   System.out.print(" ");
               }
                for(int col=1;col<=row;col++)
               {
                   System.out.print("*");
               }
           System.out.println();
           }
        }
    }
}
