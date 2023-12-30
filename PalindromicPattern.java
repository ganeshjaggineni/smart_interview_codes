/*
Palindromic Pattern

Print a palindromic right-angled triangle pattern using characters. See the example for more details.



Input Format

The first and only line of input contains an integer N - the size of the pattern.



Output Format

For the given integer N, print the palindromic right-angled triangle pattern.



Constraints

1 <= N <= 26



Example

Input

5



Output

A

A B A

A B C B A

A B C D C B A

A B C D E D C B A



Explanation



Self Explanatory
*/
//PROGRAM
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int rows=1;rows<=n;rows++)
        {
            int ch = 64;
            for(int cols=1;cols<=rows;cols++)
            {
                ch++;
                System.out.print((char)ch+" ");
            }
            for(int cols=1;cols<=rows-1;cols++)
            {
                ch--;
                System.out.print((char)ch+" ");
            }
            System.out.println();
        }
    }
}