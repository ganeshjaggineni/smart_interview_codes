/*

			Natural Numbers Sum

Given positive integer - N, print the sum of the first N natural numbers.



Input Format

The first and only line of input contains a positive integer - N.



Output Format

Print the sum of the first N natural numbers.



Constraints

1 <= N <= 109



Example

Input

4



Output

10



Explanation



Self Explanatory
*/

//PROGRAM

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long  sum = 0;
        for(int i=1;i<=n;i++)
            sum = sum+i;
        System.out.println(sum);

    }
}