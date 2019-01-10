// question 4

import java.util.*;

public class ques4 {

    static void checkHappy (int arr[], int n, int c) {
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum = sum+arr[i];
            if (sum > c) {
                System.out.println ("No");
                return;
            }
        }
        System.out.println ("Yes");
    }

    public static void main (String args[]) {
        int t, n, c;
        Scanner sc  = new Scanner (System.in);
        t=sc.nextInt();
        for (int i=0; i<t; i++) {
            n = sc.nextInt(); c = sc.nextInt();
            int arr[] = new int[n];
            for (int j=0; j<n; j++)
                arr[j] = sc.nextInt();
            checkHappy (arr, n, c);
        }
    }
}