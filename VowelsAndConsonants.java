/*
				Vowels and Consonants

Given a string, print the count of vowels and consonants in the string.



Input Format

Input contains a string S, consisting of lowercase and uppercase characters.



Output Format

Print the count of vowels and consonants in the given string, separated by space.



Constraints

1 <= len(S) <= 100



Example

Input

abxbbiAaspw



Output

4 7



Explanation



Self Explanatory
*/
//PROGRAM

import java.io.*;
import java.util.*;

public class Main {
    
    static boolean isVowel(char letter)
    {
        return letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' 
            || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'; 
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int vowel_count = 0;
        int consonant_count = 0;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isLetter(ch))
            {
                if(isVowel(ch))
                    vowel_count++;
                else
                    consonant_count++;
            }
        }
        System.out.println(vowel_count+" "+consonant_count);
    }
}