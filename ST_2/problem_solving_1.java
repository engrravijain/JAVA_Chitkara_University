/* if word starts with vowel add way at end else

if apple => appleway

if road => oadray
if scream => eamscray */

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.*;

public class problem_solving_1 {

    public static boolean isVowel(char x) {
        if (x=='a' || x=='A' ||
            x=='e' || x=='E' ||
            x=='i' || x=='I' ||
            x=='o' || x=='O' ||
            x=='u' || x=='U') return true;
        else return false;
    }

    public static void solve(String s) {
        if(isVowel(s.charAt(0)))
            System.out.printf(s.concat("way") + " ");
        else {
            int index = 0;
            for (int j=0; j<s.length(); j++) {
                if (isVowel(s.charAt(j))) {
                    index = j;
                    break;
                }
            }
            System.out.print(s.substring(index)+s.substring(0,index)+"ay ");
        }
    }

    public static void main(String[] args) {
        String str=""; // empty string
        // for (int i=0; i<args.length; i++) str = str+args[i]+" "; // convert command line arguments to string
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("./problem_solving_1_input.txt"));
            str = reader.readLine();
            while(str != null) {
                String s[] = str.split(" ");
                for (int i=0; i<s.length; i++) solve(s[i]); 
                System.out.println();
                str = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}