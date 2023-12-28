/*
Linear Search

Given an array of integers, search a given key in the array using linear search.



Note: Do not use any inbuilt functions / libraries for your main logic.

Input Format

The first line of input contains two integers N and K. N is the size of the array and K is the key. The second line contains the elements of the array.



Output Format

If the key is found, print the index of the array, otherwise print -1.



Constraints

1 <= N <= 102

0 <= ar[i] <= 109



Example

Input

5 15

-2 -19 8 15 4



Output

3



Explanation



Self Explanatory
*/
//PROGRAM

import java.io.*;
import java.util.*;

public class Main {

    static void LinearSearch(int [] a,int key)
    {
        int flag = 0;
        int index = 0;
        for(int i=0 ; i < a.length ;i++)
        {
            if(a[i] == key)
            {
                flag = 1;
                index = i;
                break;
            }
        }
        if(flag == 1)
            System.out.println(index);
        else
            System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        LinearSearch(arr,K);
    }
}