/*
					Unique Elements

Print unique elements of the array in the same order as they appear in the input.



Note:

Do not use any inbuilt functions / libraries for your main logic.



Input Format
The first line of input contains the size of the array - N and the second line contains the elements of the array.



Output Format

Print unique elements from the given array.



Constraints

1 <= N <= 100

0 <= ar[i] <= 109



Example

Input

7

5 4 10 9 21 4 10



Output

5 9 21



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
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int check = arr[i];
             int count = 0;
            for(int j=0;j<n;j++)
            {
                if(check == arr[j])
                {
                    count++;
                }
            }
            if(count == 1 )
                System.out.print(arr[i]+" ");
        }

    }
}