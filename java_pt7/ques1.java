// question 1

import java.util.*;
public class ques1 {
    static void countFreq (int arr[], int n) {
        int hash[] = new int[11];
		for (int i=0; i<n; i++) {
			if (hash[arr[i]] == 0) {
				hash[arr[i]]++;
				int count = 0;
				for (int j=i; j<n; j++) {
					if (arr[j] == arr[i]) {
						count++;
					}
				}
				System.out.println (arr[i] + " occurs " + count + " times");
			}
		}
    }

    public static void main(java.lang.String a[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();			
		}
		countFreq(arr,n);
	}
}