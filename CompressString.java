/*
Compress String

Given a string, compress the given string. See the example for more details.



Input Format

Input contains a string S, consisting of lowercase and uppercase characters.



Output Format

Print the compressed string.



Constraints

1 <= len(S) <= 100



Example

Input

aaabbbbhhheaaAsssssss



Output

a3b4h3e1a2A1s7



Explanation



In the given string, a is repeating for 3 times - after compression a3.

Similarly,

b is repeating for 4 times - b4

h is repeating for 3 times - h3

e is repeating for 1 time - e1

a is repeating for 2 times - a2

A is repeating for 1 time - A1

s is repeating 7 times - s7
*/
//PROGRAM

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for(int i=1;i<=str.length();i++)
        {
            if(i<str.length() && str.charAt(i) == str.charAt(i-1))
            {
                count++;
            }
            else
            {
               ans.append(str.charAt(i-1));
               ans.append(count);
               count = 1; 
            }
        }
        System.out.println(ans);
    }
}