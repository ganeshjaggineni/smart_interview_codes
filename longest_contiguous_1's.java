/*
				Longest Contiguous 1's

Given an array of elements containing 0's and 1's. You have to find the length of longest contiguous 1's.



Input Format

First line of input contains N - size of the array. The next line contains the N integers of array A.



Output Format

Print the length of longest contiguous 1's.



Constraints

1 <= N <= 1000



Example

Input

10

1 0 0 1 0 1 1 1 1 0



Output

4



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
        int arr[] = new int[n];
        int count = 0;
        int max_count = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int j=i;
        count = 0;
            while(j<n && arr[j] != 0)
            {
                if(arr[j] == 1)
                    count++;
                else   
                    break;
              j++;
            }
            if(count>max_count)
                max_count = count;
        }
        System.out.println(max_count);
        }
}