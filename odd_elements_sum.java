/*
				Odd Elements Sum

Print the sum of all odd elements in an array.



Input Format

The first line of input contains N - the size of the array and the second line contains array elements.



Output Format

Print the sum of all odd elements of the given array.



Constraints

1 <= N <= 103

-106 <= ar[i] <= 106



Example

Input

5

-6 9 -8 4 -3



Output

6



Explanation



9 + (-3) = 6
*/
//PROGRAM

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int odd_sum = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]%2 != 0)
                odd_sum += arr[i];
        }
        System.out.println(odd_sum);
        }
}