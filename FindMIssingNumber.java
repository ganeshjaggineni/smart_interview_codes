import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
           Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int N = sc.nextInt();
            int sum = 0;
            int arr[] = new int[N];
            
           int org_sum = ((N+1)*(N+2))/2;
            for(int i=0;i<N;i++)
            {
                arr[i] = sc.nextInt();
                sum = sum+arr[i];
            }
            System.out.println(org_sum-sum);
        }
    }
}