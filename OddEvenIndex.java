/*
			Odd Even Index

Given a string, print all the letters present at the odd index, followed by the letters present at the even index.



Input Format

The input contains a string S, consisting of ASCII characters.



Output Format

Print letters present at odd index, followed by the letters present at even index.



Constraints

1 <= len(S) <= 100



Example

Input

afdg5tg



Output

fgtad5g



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
            String even_str = "";
            String odd_str = "";
            char[] strchars = str.toCharArray();
            for(int i=0;i<strchars.length;i++)
            {
                if(i%2 == 0)
                    even_str = even_str + strchars[i];
                else
                    odd_str = odd_str + strchars[i];
            }
            System.out.println(odd_str+even_str);
    }
}