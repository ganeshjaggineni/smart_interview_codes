/*
				Harshad Numbers

Given an integer N, check whether it is a Harshad number or not.

Note that a Harshad number is an integer, that is divisible by the sum of its digits.



Input

The first and only line of input contains a integer - N.



Output

Print "Yes" if the number is Harshad number, "No" otherwise.



Constraints

1 <= N <= 109



Example

Input

18



Output

Yes



Explanation



18 / (1 + 8) = 2

As 18 is divisible by the sum of its digits, it is a Harshad number.

*/
//PROGRAM

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum  = 0;
        int rem = 0;
        while(num>0)
        {
            rem = num%10;
            sum += rem;
            num = num/10;
        }
        if(n%sum == 0)
            System.out.println("Yes");
        else
            System.out.println("No");




    }
}