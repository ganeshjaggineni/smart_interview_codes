/*
				Longest Prefix Suffix

Given a string, compute the length of the longest proper prefix which is same as the suffix of the given string.



Input Format

The input contains a string S, consisting of only lowercase characters.



Output Format

Print the length of the longest proper prefix which is the same as a suffix of the given string.



Constraints

1 <= len(S) <= 100



Example

Input

smartintsmart



Output

5



Explanation



Self Explanatory
*/
//PROGRAM
import java.io.*;
import java.util.*;

public class Main {
    static int  LongestPrefixSuffix(String word)
    {
        int count = 0;
      for(int j=1;j<word.length();j++)
      {
          if(word.charAt(j) == word.charAt(count))
          {
              count++;
          }
          else
            count = 0;
      }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(LongestPrefixSuffix(str));
    }
}