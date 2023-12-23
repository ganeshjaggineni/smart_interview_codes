/*
				Concatenate Array

Given an integer array A of size N. You have to construct a new B array with a length of (N+N). For each index i from 0 to N-1, the value of B[i] should be the same as the value of A[i], and the value of B[i+N] should also be the same as the value of A[i].

In simple terms, you have to duplicate the A array and place them consecutively in the B array two times.



Input Format

The first line of input contains the N - the size of the array A. The next line contains N integers of array A.



Output Format

Print the elements of the B array separated by space.



Constraints

1 <= N <= 1000

1 <= A[i] <= 1000



Example

Input

3

6 7 7



Output

6 7 7 6 7 7



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
        int[] a = new int[n];
        int[] b = new int[2*n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
            b[i+n] = a[i];
            
        }
        
        for(int i=0;i<2*n;i++)
        {
          System.out.print(b[i]+" ");
            
        }
    }
}