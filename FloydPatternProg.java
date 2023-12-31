/*
		Floyd Pattern - 2

Print a right-angled triangle pattern. See the example for more details.



Input Format

The first and only line of input contains a single integer N - the size of the triangle.



Output Format

For the given integer, print the right-angled triangle pattern.



Constraints

1 <= N <= 50



Example

Input

5



Output

1

2 6

3 7 10

4 8 11 13

5 9 12 14 15



Explanation



Self Explanatory
*/
//PROGRAM
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int rows=1;rows<=n;rows++)
        {
               int diff = n-1;
                int printnum = rows;
            for(int cols=1;cols<=rows;cols++)
            {
                System.out.print(printnum+" ");
                printnum += diff--;
               
            }
            System.out.println();
        }
    }
}