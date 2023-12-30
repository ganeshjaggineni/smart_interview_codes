/*
				Pyramid Pattern

Print pyramid pattern using '*'. See the example for more details.



Input Format

The first and only line of input contains a single integer N - the size of the pyramid.



Output Format

For the given integer, print the pyramid pattern.



Constraints

1 <= N <= 50



Example

Input



5
Output



    *
   ***
  *****
 *******
*********
Explanation



Self Explanatory

*/
//PROGRAM
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int rows=1;rows<=n;rows++)
        {
            for(int spaces=1;spaces<=n-rows;spaces++)
            {
                System.out.print(" ");
            }
            for(int cols=1;cols<=2*rows-1 ;cols++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

      
    }
}