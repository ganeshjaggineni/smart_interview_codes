/*
			Reverse String

Given a string, reverse the given string in place and then print it.



Note:

Do not use any inbuilt functions / libraries for your main logic.



Input Format
The input contains a string S, consisting of ASCII characters.



Output Format

Print the reversed string.



Constraints

1 <= len(s) <= 100



Example

Input

smart



Output

trams



Explanation



Self Explanatory

*/

//PROGRAM

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans="";
       char[] strchars = str.toCharArray();
       for(int i=0;i<strchars.length;i++)
       {
           ans = strchars[i]+ans;
       }
       System.out.println(ans);
    }
}