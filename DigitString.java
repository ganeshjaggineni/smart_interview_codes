/*
Digit String

Given a string, check if it contains only digits.



Input Format

The input contains a string S, consisting of ASCII characters.



Output Format

Print "Yes" if the string contains only digits, and "No" otherwise.



Constraints

1 <= len(S) <= 100



Example

Input

123456786543



Output

Yes



Explanation



Self Explanatory
*/
//PROGRAM

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String numstr = sc.nextLine();
        char[] numstrchars = numstr.toCharArray();
        int flag = 1;
        for(int i=0;i<numstrchars.length;i++)
        {
            if(!(numstrchars[i]  >= '0' && numstrchars[i] <= '9'))
            {
                flag = 0;
            }
         
        }
        if(flag == 1)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}