/*
				Number of Multiples

Given a positive integer - N. Print the number of multiples of 3, 5 between [1, N].



Input Format

The first and only line of input contains a positive integer - N.



Output Format

Print the number of multiples of 3, 5 between [1, N].



Constraints

1 <= N <= 1018



Example

Input

12



Output

6



Explanation



Multiples of 3 and 5 in range of 1 to 12 are 3, 5, 6, 9, 10, 12.

*/
//PROGRAM
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(i%3 == 0 || i%5 == 0)
                count++;
        }
        System.out.println(count);
        }
}