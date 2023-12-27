/*
				Only Vowels

Given a string, check if it contains only vowels.



Input Format

Input contains a string S, consisting of lowercase and uppercase characters.



Output Format

Print "Yes" if the string contains only vowels, "No" otherwise.



Constraints

1 <= len(S) <= 100



Example

Input

AIEEE



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
        String str = sc.nextLine();
        char[] strchars = str.toCharArray();
        int only_vowel = 0;
        for(int i=0;i<strchars.length;i++)
        {
            if(strchars[i] == 'A' ||
               strchars[i] == 'E' ||
                strchars[i] == 'I' ||
                 strchars[i] == 'O' ||
                  strchars[i] == 'U' ||
                     strchars[i] == 'a' ||
                      strchars[i] == 'e' ||
                       strchars[i] == 'i' ||
                        strchars[i] == 'o' ||
                         strchars[i] == 'u'   )
                         {
                             only_vowel = 1;
                         }
            else
                only_vowel = 0;
        }
            if(only_vowel == 1)
                    System.out.println("Yes");
               else
                     System.out.println("No");
    }
}