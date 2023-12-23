/*
Reverse Array

Print the array in reverse order.



Note:

Try solving this using recursion. Do not use any inbuilt functions / libraries for your main logic.



Input Format
The first line of input contains N - the size of the array and the second line contains the elements of the array.



Output Format

Print the given array in reverse order.



Constraints

1 <= N <= 100

0 <= ar[i] <= 1000



Example

Input

5

2 19 8 15 4



Output

4 15 8 19 2



Explanation



Self Explanatory
*/
//PROGRAM

import java.io.*;
import java.util.*;

public class Main {

  static void recRevArray(int[] arr,int start,int end)
        {
            if(start<end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            recRevArray(arr,start+1,end-1);
            }
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        recRevArray(arr,0,n-1);
      
        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i] + " ");
        }
        }
}