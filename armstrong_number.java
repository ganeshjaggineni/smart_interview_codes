/*
				Armstrong Number

Given an integer N, check whether it's an Armstrong number or not.

Note that an Armstrong number is a number that is equal to the sum of cubes of its digits.



Input Format

The first and only line of input contains an integer - N.



Output Format

Print "Yes" if the number is Armstrong number, "No" otherwise.



Constraints

0 <= N <= 109



Example

Input

153



Output

Yes



Explanation



13 + 53 + 33 = 153

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