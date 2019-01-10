// question 5

import java.util.*;

class ques5 {

    public static void main (String args[]) {
        int t; // testcases
        int X, Y, K, N; // pages to write, pages available, Money Left, Notebooks shown 
        int p_i, c_i; // pages and price respectively of Nth notebook
        boolean Lucky = false;
        Scanner sc = new Scanner (System.in);
        t = sc.nextInt();
        for (int i=0; i<t; i++) {
            Lucky = false;
            X = sc.nextInt();
            Y = sc.nextInt();
            K = sc.nextInt();
            N = sc.nextInt();
            int pages_required = X-Y;
            for (int j =0; j<N; j++) {
                p_i = sc.nextInt();
                c_i = sc.nextInt();
                if (c_i <= K && pages_required <= p_i) {
                    Lucky = true;
                    break;
                }
            }
            if (Lucky)
                System.out.println("LuckyChef");
            else
                System.out.println("UnluckyChef");
        }
    }
}