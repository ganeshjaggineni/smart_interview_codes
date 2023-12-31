/*
Factorial

Given a non-negative number - N. Print N!



Input Format

The first and only line of input contains a number - N.



Output Format

Print factorial of N.



Constraints

0 <= N <= 10



Example

Input

5



Output

120



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
    int fact = 1;
    for(int i=1;i<=n;i++)
    {
        fact = fact*i;
    }
    System.out.println(fact);
        }
}