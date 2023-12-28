/*
			Interchange Diagonals

Given a matrix A of size NxN, interchange the diagonal elements from top to bottom and print the resultant matrix.



Input Format

First line of input contains N - the size of the matrix. It is followed by N lines each containing N integers - elements of the matrix.



Output Format

Print the matrix after interchanging the diagonals.



Constraints

1 <= N <= 100

1 <= A[i][j] <= 104



Example

Input

4

1 2 3 4

5 6 7 8

9 10 11 12

13 14 15 16

*/
//PROGRAM
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i == j)
                {
                    temp = arr[i][j];
                    arr[i][j] = arr[i][N-1-i];
                    arr[i][N-1-i] = temp;
                }
              
            }
          
        }

          for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}