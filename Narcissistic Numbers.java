/*
Narcissistic Numbers

Given an integer N, check whether it is a Narcissistic number or not.

Note that a Narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits



Input Format

The first and only line of input contains an integer - N.



Output Format

Print "Yes" if the number is Narcissistic number, "No" otherwise.



Constraints

0 <= N <= 109



Example

Input

8208



Output

Yes



Explanation



84 + 24 + 04 + 84 = 8208

*/
//PROGRAM
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        int rem = 0;
        String temp = Integer.toString(n);
        int len = temp.length();
        while(num>0)
        {
            rem = num%10;
            sum = sum+(int)Math.pow(rem,len);
            num = num/10;
        }
        if(n == sum)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}