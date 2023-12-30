/*
			Inverted Pyramid

Print a hollow half-inverted pyramid pattern using '*'. See the example for more details.



Input Format

The first and only line of input contains a single integer N.



Output Format

For the given integer, print hollow half-inverted pyramid pattern.



Constraints

1 <= N <= 50



Example

Input

5



Output

* * * * *
*     *
*   *
* *
*


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
           for(int cols=1;cols<=n;cols++)
           {
               if(rows==1 || cols==1 || cols==(n-rows)+1)
               {
                   System.out.printf("* ");
               }
               else
                System.out.print("  ");
           }
           System.out.println();
       }
        }
}