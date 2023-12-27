/*
Character Frequency

Given a sentence S and a character k, count the occurrence of the given character in the sentence.



Input Format

The first line of input contains a sentence - S and the second line of input contains a single lowercase character - k.



Output Format

Print the count of the given character in the sentence.



Constraints

1 <= len(S) <= 100

'a' <= k <= 'z'



Example

Input

Data Structures & Algorithms

s



Output

2
*/
//PROGRAM

import java.io.*;
import java.util.*;

public class Main {

  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char k = sc.next().charAt(0);
      
        int count = 0;
        char[] strchars = str.toCharArray();
      
        for(int i = 0;i<strchars.length;i++)
        {
             if(strchars[i] == k)
                count++;
        }
        System.out.println(count);
        }
}