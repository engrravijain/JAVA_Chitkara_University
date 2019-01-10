import java.util.*;
import java.math.*;
public class ques12 {
	static void lenOfLongIncSubArr(int arr[],int n) {
        int start=0, end=0, max_length = 0;
        for (int i=0; i<n; i++) {
            int l = 0; int j;
            for (j=i; j<n; j++) {
                l++;
                if (j+1 < n)
                    if (arr[j+1] <= arr[j])
                        break;
            }
            // System.out.println ("l: " + l);
            if (l>max_length) {
                max_length = l;
                start = i;
                end = j;
            }
        }
        if (max_length > 1) {
            System.out.println (max_length);
            for (int i=start; i<end+1; i++) {
                if (i<n)
                    System.out.print (arr[i] + " ");
            }
            System.out.println();
        }
	}
	
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int arr[] = new int[n];
			for(int j=0;j<n;j++)
				arr[j]=sc.nextInt();		
			lenOfLongIncSubArr(arr, arr.length);
		}
	}
}