/*
Binary Search

Given a sorted array of integers, search a given key in the array using Binary Search.

(Try to practice both iterative and recursive codes for Binary Search)



Note: Do not use any inbuilt functions / libraries for your main logic.

Input Format

The first line of input contains two integers N and K. N is the size of the array and K is the key. The second line contains the elements of the array.



Output Format

Print "true" if key is present in the array, otherwise, print false.



Constraints

1 <= N <= 102

0 <= ar[i] <= 109



Example

Input

5 19

2 19 23 35 38



Output

true



Explanation



Self Explanatory
*/
//PROGRAM

import java.io.*;
import java.util.*;

public class Main {

    static boolean BinarySearch(int[] a,int key,int low,int high)
    {
        if(low <= high)
        { 
        int mid = low+(high-low)/2;
        if(a[mid] == key)
            return true;
        else if(a[mid] < key)
           return  BinarySearch(a,key,mid+1,high);
        else
            return BinarySearch(a,key,low,mid-1);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        // System.out.println("N="+N+"k ="+K+arr[1]);
        int low = 0;
        int high = N-1;
        boolean ans = BinarySearch(arr,K,low,high);
        System.out.println(ans);
    }
}