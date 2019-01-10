
interface I1 {
    int p = 10;
}

class test {
    public static void main (String args[]) {
        // try {
        //     System.out.println ("Hello" + " " + 1/0);
        // }
        // catch (ArithmeticException e) {
        //     System.out.println ("World");
        // }
        // int arr[][] = new int [5][5];
        // int []arr1[] = new int [5][5];

        // int x = 10;
        // int y = new test().change(x);
        // System.out.println (x+y);

        I1.p = 12;
        System.ou.println (I1.p);
    }

    int change (int x) {
        x = 12;
        return x;
    }
}