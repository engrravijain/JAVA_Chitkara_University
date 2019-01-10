// question 2

import java.util.*;

public class ques2 {

    static void checkAnagram (String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 != n2) {
            System.out.println (0);
            return;
        }
        int hash1[] = new int[26];
        int hash2[] = new int[26];
        for (int i=0; i<n1; i++) {
            hash1[s1.charAt(i)-97]++;
            hash2[s2.charAt(i)-97]++;
        }
        for (int i=0; i<26; i++) {
            if (hash1[i] != hash2[i]) {
                System.out.println (0);
                return;
            }
        }
        System.out.println(1);
    }


	public static void main(String args[])
	{
		int t;
		String str1,str2;
		
		Scanner sc=new Scanner(System.in);
		
		t=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++)
		{
			str1=sc.nextLine();			
			str2=sc.nextLine();
			checkAnagram(str1,str2);
		}
	}
}