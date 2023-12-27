/*

				Toggle Case

Given a string, toggle the case of each character in the given string.



Input Format

The first and only input line contains a string S, consisting of lowercase and uppercase characters.



Output Format

Print the toggled string.



Constraints

1 <= len(S) <= 100



Example

Input

sMaRtInTeRvIeWs



Output

SmArTiNtErViEwS



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
        String ans = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                if(ch >= 'A' && ch <= 'Z')
                {
                    ch = (char)(ch+32);
                }
                else
                {
                    ch = (char)(ch-32);
                }
                ans = ans+ch;
            }
        }
        System.out.println(ans);
    }
}