/*
Balanced Parentheses 
Max Score: 100

Write a program to generate all possible strings with balanced parentheses having N pairs of curly braces.



Input Format

The first line of input contains T - the number of test cases. It's followed by T lines, each containing a single integer N.



Output Format

For each test case, print each combinational pair of balanced parenthesis of length N in a lexicographical order along with the test case number, separated by a new line.



Constraints

1 <= T <= 12

1 <= N <= 12



Example

Input

2

3

2



Output

Test Case #1:
{{{}}}
{{}{}}
{{}}{}
{}{{}}
{}{}{}
Test Case #2:
{{}}
{}{}


Explanation



Self Explanatory
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        int temp = T;
        while(T-- > 0)
        {
           int N = sc.nextInt();
        int upper_brace_count=0,lower_brace_count=0,index=0;
        char[] arr = new char[2*N];
                        System.out.println("Test Case #"+(temp-T)+":");
                      Parenthesis(N,upper_brace_count,lower_brace_count,index,arr);

        }
    }
 static void Parenthesis(int n,int upper,int lower,int i,char[] arr)
      {
          if(i == 2*n)
          {
              System.out.println(new String(arr));
          }
          if(upper < n)
          {
              arr[i]='{';
              Parenthesis(n,upper+1,lower,i+1,arr);
          }
          if(upper > lower)
          {
              arr[i] = '}';
              Parenthesis(n,upper,lower+1,i+1,arr);
          }
      }

}
