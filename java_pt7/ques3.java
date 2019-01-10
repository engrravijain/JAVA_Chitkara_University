// question 3

import java.util.*;

public class ques3 {

    static void checkLapalindrome (String s) {
        int n = s.length();
        String s1 = s.substring (0, n/2);
        String s2;
        if (n%2==0)
            s2 = s.substring (n/2, n);
        else
            s2 = s.substring (n/2+1, n);
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1); Arrays.sort(c2);
        for (int i=0; i<n/2; i++) {
            if (c1[i] != c2[i]) {
                System.out.println ("NO");
                return;
            }
        }
        System.out.println ("YES");
    }
    


	public static void main(String args[])
	{
		int t;
		String str1;
		
		Scanner sc=new Scanner(System.in);
		
		t=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++)
		{
			str1=sc.nextLine();			
			checkLapalindrome(str1);
		}
	}
}