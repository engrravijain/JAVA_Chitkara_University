import java.util.*;
import java.lang.*;
import java.io.*;

public class ques51 {     
    static void printHeads(int arr[], int size) { 
        for (int i=0; i<size; i++) {
            int flag = 1;
            for (int j=i; j<size; j++)
                if (arr[j] > arr[i])
                    flag = 0;
            if (flag == 1)
                System.out.println (arr[i]);
        }
    }   

    public static void main(String[] args) { 
    	Scanner sc=new Scanner(System.in);		
		int n=sc.nextInt();
		int arr[] = new int[n];
        for (int i = 0; i < n; i++)             
            arr[i] = sc.nextInt();               
        printHeads(arr, n); 
    } 
} 